package Factory;

import Conceitos.Funcionario;
import Controle.ControladorGerente;
import Conceitos.Gerente;
import Conceitos.Pessoa;
import Conceitos.PessoaFisica;

public class FactoryFuncionario {

	private Funcionario funcionario;

	private ControladorGerente controladorGerente;

	private FactoryPessoa factoryPessoa;

	private Gerente gerente;
        
        public FactoryFuncionario() {
            this.factoryPessoa = new FactoryPessoa();
        }

	/**
	 *  
	 */
	public Funcionario criarFuncionario(float salario, String senha, String nome, String email, String celular, String cpf) {
            PessoaFisica pessoa = factoryPessoa.criarPessoaFisica(nome, email, celular, cpf);
            Funcionario func = new Funcionario(salario, pessoa);
            return func;
        }

        public Gerente criarGerente(float salario, String senha, String nome, String email, String celular, String cpf) {
            PessoaFisica pessoa = factoryPessoa.criarPessoaFisica(nome, email, celular, cpf);
            Gerente gere = new Gerente(salario, pessoa);
            return gere;
        }

}
