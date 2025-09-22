package Factory;

import Conceitos.Pessoa;
import Conceitos.PessoaFisica;

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
        
        public PessoaFisica criarPessoaFisica(String nome, String email, String celular, String cpf) {
            return new PessoaFisica(nome, email, celular, cpf, null);
        }
}
