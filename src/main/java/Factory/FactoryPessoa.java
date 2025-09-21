package Factory;

import Conceitos.Pessoa;

public class FactoryPessoa {

	private Pessoa pessoa;

	private FactoryCliente factoryCliente;

	private FactoryFuncionario factoryFuncionario;

	/**
	 *  
	 */
	public Pessoa criarPessoa(String nome, String email, String celular) {
		Pessoa p = new Pessoa(nome, email, celular);
                return p;
	}

}
