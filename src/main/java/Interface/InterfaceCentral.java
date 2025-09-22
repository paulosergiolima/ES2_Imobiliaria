package Interface;

import Controle.ControladorCentral;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;
import java.time.LocalDateTime;

public class InterfaceCentral {

	private ControladorCentral controladorCentral;

	private InterfaceCliente interfaceCliente;

	private InterfaceFuncionario interfaceFuncionario;

	private InterfaceGerente interfaceGerente;

	public void agendarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            controladorCentral.agendarVisita(cliente, funcionario, imovel, data_hora);

	}

	public void agendarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            controladorCentral.agendarVistoria(cliente, funcionario, imovel, data_hora);
            

	}

	public void registrarCliente(String nome, String email, String celular) {
            controladorCentral.registrarCliente(nome, email, celular);

	}

	public void registrarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {
            controladorCentral.registrarAluguel(caucao, comissao_imobiliaria, desconto, funcionario_responsavel, imovel, locatario);

	}

	public void registrarFuncionario(float salario, String senha, String nome, String email, String celular) {

	}

	public void registrarGerente(float salario, String senha, String nome, String email, String celular, String cpf) {
            controladorCentral.registrarGerente(salario, senha, nome, email, celular, cpf);

	}

	public void registrarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
            controladorCentral.registrarImovel(nome, proprietario, ocupacao, tipo, laudo_tecnico, laudo_vistoria);

	}

	public void registrarLaudoVistoria(String nome_laudo, String nome_imovel, String descricao) {
            controladorCentral.registrarLaudoVistoria(nome_laudo, nome_imovel, descricao);
	}

	public void registrarLaudoTecnico(String nome_laudo, String nome_imovel, String endereco, float valor_imovel, float area) {
            controladorCentral.registrarLaudoTecnico(nome_laudo, nome_imovel, endereco, valor_imovel, area);

	}

	public void pagarCobranca(Cliente cliente) {

	}

	public int mostrarCobrancas(String texto) {
		return 0;
	}

}
