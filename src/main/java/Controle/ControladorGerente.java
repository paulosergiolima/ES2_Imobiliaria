package Controle;

import Factory.FactoryFuncionario;
import Catalogos.CatalogoFuncionario;
import Conceitos.Gerente;
import Conceitos.Funcionario;

public class ControladorGerente {

	private ControladorCentral controladorCentral;

	private FactoryFuncionario factoryFuncionario;

	private CatalogoFuncionario catalogoFuncionario;
        
        public ControladorGerente() {
            this.factoryFuncionario = new FactoryFuncionario();
            this.catalogoFuncionario = new CatalogoFuncionario();
        }

	public void registrarFuncionario(float salario, String senha, String nome, String email, String celular) {
            Funcionario funcionario = factoryFuncionario.criarFuncionario(salario, senha, nome, email, celular);
            catalogoFuncionario.adicionarFuncionario(funcionario);

	}

	public void registrarGerente(float salario, String senha, String nome, String email, String celular) {
            
            Gerente gerente = factoryFuncionario.criarGerente(salario, senha, nome, email, celular);
            catalogoFuncionario.adicionarFuncionario(gerente);

	}
        
        public Funcionario buscarFuncionarioPorNome(String nome) {
            return catalogoFuncionario.buscarFuncionarioPorNome(nome);
        }

}
