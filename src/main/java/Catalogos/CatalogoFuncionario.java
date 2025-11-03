package Catalogos;

import java.util.ArrayList;
import Conceitos.Funcionario;
import Controle.ControladorGerente;

public class CatalogoFuncionario {

	private ArrayList<Funcionario> funcionarios;

	private Funcionario funcionario;

	private ControladorGerente controladorGerente;

        public CatalogoFuncionario() {
            this.funcionarios = new ArrayList<>();
        }
	/**
	 *  
	 */
	public void adicionarFuncionario(Funcionario funcionario) {
            funcionarios.add(funcionario);
	}
        
        /**
	 *  
	 */
	public Funcionario buscarFuncionarioPorNome(String nome) {
            for(int i = 0; i < funcionarios.size(); i++) {
                if(funcionarios.get(i).getNome().equals(nome)) {
                    return funcionarios.get(i);
                }
            }
            return null;
	}
        public double calcularGastos() {
            double gasto = 0;
            for(int i = 0;i < funcionarios.size();i++) {
                gasto = gasto + funcionarios.get(i).getSalario();
            }
            return gasto;
        }

        public String listar() {
            StringBuilder value = new StringBuilder("");
            for(int i = 0;i < funcionarios.size();i++) {
                funcionario = funcionarios.get(i);
                value.append("Nome: ").append(funcionario.getNome()).append(";Salário:").append(funcionario.getSalario()).append("\n");
            }
            return value.toString();
        }

}
