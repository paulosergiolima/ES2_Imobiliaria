package Conceitos;

import Catalogos.CatalogoFuncionario;
import Factory.FactoryFuncionario;
import Controle.ControladorFuncionario;

public class Funcionario {

	private float salario;

	private PessoaFisica pessoa;

	private Agendamento agendamento;

	private Aluguel aluguel;

	private CatalogoFuncionario catalogoFuncionario;

	private FactoryFuncionario factoryFuncionario;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public void notificar(String texto) {
            pessoa.notificar(texto);

	}
        public Funcionario (float salario, PessoaFisica pessoa) {
            this.salario = salario;
            this.pessoa = pessoa;
            
        }

}
