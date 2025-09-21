package Factory;

import Conceitos.Funcionario;
import Controle.ControladorGerente;
import Conceitos.Gerente;

public class FactoryFuncionario {

	private Funcionario funcionario;

	private ControladorGerente controladorGerente;

	private FactoryPessoa factoryPessoa;

	private Gerente gerente;

	/**
	 *  
	 */
	public Funcionario criarFuncionario(float salario, String senha, String nome, String email, String celular) {
		return null;
	}

	public Gerente criarGerente(float salario, String senha, String nome, String email, String celular) {
		return null;
	}

}
