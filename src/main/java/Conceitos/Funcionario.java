package Conceitos;

import Catalogos.CatalogoFuncionario;
import Factory.FactoryFuncionario;
import Controle.ControladorFuncionario;

public class Funcionario extends PessoaFisica {

	private float salario;

	private PessoaFisica pessoa;

	private PessoaFisica pessoaFisica;

	private Agendamento agendamento;

	private Aluguel aluguel;

	private CatalogoFuncionario catalogoFuncionario;

	private FactoryFuncionario factoryFuncionario;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public void notificar(String texto) {

	}

}
