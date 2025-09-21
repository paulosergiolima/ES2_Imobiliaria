package Conceitos;


public class PessoaFisica extends Pessoa {

	private String CPF;

	private Funcionario funcionario;

    public PessoaFisica(String nome, String email, String celular, String CPF, Funcionario funcionario) {
        super(nome, email, celular);
        this.CPF = CPF;
        this.funcionario = funcionario;
    }

}
