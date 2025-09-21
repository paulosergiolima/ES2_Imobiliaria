package Conceitos;

import Factory.FactoryFuncionario;

public class Gerente extends Funcionario {

	private FactoryFuncionario factoryFuncionario;

    public Gerente(float salario, PessoaFisica pessoa) {
        super(salario, pessoa);
    }

}
