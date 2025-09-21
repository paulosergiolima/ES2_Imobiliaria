package Controle;

import Interface.InterfaceCentral;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;

public class ControladorCentral {

	private ControladorCliente controladorCliente;

	private ControladorFuncionario controladorFuncionario;

	private ControladorGerente controladorGerente;

	private Timer timer;

	private InterfaceCentral interfaceCentral;

	public void agendarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel) {

	}

	/**
	 *  
	 */
	public void agendarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel) {

	}

	/**
	 *  
	 */
	public void registrarCliente(String nome, String email, String celular) {
            controladorFuncionario.registrarCliente(nome, email, celular);
	}

	public void registrarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {

	}

	public void registrarFuncionario(float salario, String senha, String nome, String email, String celular) {

	}

	public void registrarGerente(float salario, String senha, String nome, String email, String celular) {
            controladorGerente.registrarGerente(salario, senha, nome, email, celular);

	}

	public void registrarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {

	}

	public void registrarLaudoVistoria(String nome_laudo, String nome_imovel, String descricao) {

	}

	public void registrarLaudoTecnico(String nome_laudo, String nome_imovel, String endereco, float valor_imovel, float area) {

	}

	public void pagarCobranca(Cliente cliente) {

	}

	public int mostrarCobrancas(String texto) {
		return 0;
	}

}
