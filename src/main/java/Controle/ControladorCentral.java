package Controle;

import Interface.InterfaceCentral;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;
import java.time.LocalDateTime;

public class ControladorCentral {

	private ControladorCliente controladorCliente;

	private ControladorFuncionario controladorFuncionario;

	private ControladorGerente controladorGerente;

	private Timer timer;

	private InterfaceCentral interfaceCentral;
        
        public ControladorCentral() {
            this.controladorFuncionario = new ControladorFuncionario();
            this.controladorCliente = new ControladorCliente();
            this.controladorGerente = new ControladorGerente();
        }

	public void agendarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            controladorFuncionario.agendarVisita(cliente, funcionario, imovel, data_hora);

	}

	/**
	 *  
	 */
	public void agendarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            controladorFuncionario.agendarVistoria(cliente, funcionario, imovel, data_hora);

	}

	/**
	 *  
	 */
	public void registrarCliente(String nome, String email, String celular) {
            controladorFuncionario.registrarCliente(nome, email, celular);
	}

	public void registrarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {
            controladorFuncionario.registrarAluguel(caucao, comissao_imobiliaria, desconto, funcionario_responsavel, imovel, locatario);

	}

	public void registrarFuncionario(float salario, String senha, String nome, String email, String celular, String cpf) {
            controladorGerente.registrarFuncionario(salario, senha, nome, email, celular, cpf);
	}

	public void registrarGerente(float salario, String senha, String nome, String email, String celular, String cpf) {
            controladorGerente.registrarGerente(salario, senha, nome, email, celular, cpf);

	}

	public void registrarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
            controladorFuncionario.registrarImovel(nome, proprietario, ocupacao, tipo, laudo_tecnico, laudo_vistoria);

	}

	public void registrarLaudoVistoria(String nome_laudo, String nome_imovel, String descricao) {
            controladorFuncionario.registrarLaudoVistoria(nome_laudo, nome_imovel, descricao);

	}

	public void registrarLaudoTecnico(String nome_laudo, String nome_imovel, String endereco, float valor_imovel, float area) {
            controladorFuncionario.registrarLaudoTecnico(nome_laudo, nome_imovel, endereco, valor_imovel, area);

	}
        
        public boolean registrarSeguro(String nome, double valor, String descricao) {
            return controladorFuncionario.registrarSeguro(nome, valor, descricao);
        }

	public void pagarCobranca(Cliente cliente) {

	}

	public int mostrarCobrancas(String texto) {
		return 0;
	}
        
        public Cliente buscarClientePorNome(String nome) {
            return controladorFuncionario.buscarClientePorNome(nome);
        }

        public Funcionario buscarFuncionarioPorNome(String nome) {
            return controladorGerente.buscarFuncionarioPorNome(nome);
        }
        
        public Imovel buscarImovel(String nome) {
            return controladorFuncionario.buscarImovel(nome);
        }
        public double consultaGastosMensais() {
            return controladorFuncionario.consultaGastosMensais();
        }

        public String consultaIdentificador(int objetivo, String identificador) {
            return controladorFuncionario.consultaIdentificador(objetivo,identificador);
        }

        public String consultaListagem(int objetivo) {
            return controladorFuncionario.consultaListagem(objetivo);
        }
        
}
