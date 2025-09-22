package Catalogos;

import java.util.ArrayList;
import Conceitos.Funcionario;
import Controle.ControladorGerente;

public class CatalogoFuncionario {

	private ArrayList<Funcionario> funcionarios;

	private Funcionario funcionario;

	private ControladorGerente controladorGerente;

        public CatalogoFuncionario() {
            this.funcionarios = new ArrayList<>();
        }
	/**
	 *  
	 */
	public void adicionarFuncionario(Funcionario funcionario) {
            funcionarios.add(funcionario);
	}
        
        /**
	 *  
	 */
	public Funcionario buscarFuncionarioPorNome(String nome) {
            for(int i = 0; i < funcionarios.size(); i++) {
                if(funcionarios.get(i).getNome().equals(nome)) {
                    return funcionarios.get(i);
                }
            }
            return null;
	}

}
