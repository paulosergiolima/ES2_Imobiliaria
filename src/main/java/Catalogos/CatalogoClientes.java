package Catalogos;

import java.util.ArrayList;
import Conceitos.Cliente;
import Controle.Timer;
import Controle.ControladorFuncionario;

public class CatalogoClientes {

	private ArrayList<Cliente> clientes;

	private Cliente cliente;

	private Timer timer;

	private ControladorFuncionario controladorFuncionario;

        public CatalogoClientes() {
            this.clientes = new ArrayList<>();
        }
	/**
	 *  
	 */
	public void adicionarCliente(Cliente cliente) {
            this.clientes.add(cliente);
	}

	/**
	 *  
	 */
	public void criarMulta() {

	}
        
        /**
	 *  
	 */
	public Cliente buscarClientePorNome(String nome) {
            for(int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).getNome().equals(nome)) {
                    return clientes.get(i);
                }
            }
            return null;
	}

}
