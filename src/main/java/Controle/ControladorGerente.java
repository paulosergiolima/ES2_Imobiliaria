package Controle;

import Factory.FactoryFuncionario;
import Catalogos.CatalogoFuncionario;
import Conceitos.Gerente;

public class ControladorGerente {

	private ControladorCentral controladorCentral;

	private FactoryFuncionario factoryFuncionario;

	private CatalogoFuncionario catalogoFuncionario;

	public void registrarFuncionario(float salario, String senha, String nome, String email, String celular) {

	}

	public void registrarGerente(float salario, String senha, String nome, String email, String celular) {
            
            Gerente gerente = factoryFuncionario.criarGerente(salario, senha, nome, email, celular);
            catalogoFuncionario.adicionarFuncionario(gerente);

	}

}
