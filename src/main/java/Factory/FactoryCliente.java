package Factory;

import Conceitos.Cliente;
import Conceitos.Pessoa;
import Controle.ControladorFuncionario;

public class FactoryCliente {

	private Cliente cliente;

	private ControladorFuncionario controladorFuncionario;

	private FactoryPessoa factoryPessoa;

	/**
	 *  
	 */
	public Cliente criarCliente(String nome, String email, String celular) {
            Pessoa p = factoryPessoa.criarPessoa(nome, email, celular);
            Cliente c = new Cliente(p);
            return c;
	}

}
