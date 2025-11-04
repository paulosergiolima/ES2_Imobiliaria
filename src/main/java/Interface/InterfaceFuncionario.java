package Interface;

import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;
import java.time.LocalDateTime;

public class InterfaceFuncionario {

	private InterfaceCentral interfaceCentral;

	public void agendarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            interfaceCentral.agendarVisita(cliente, funcionario, imovel, data_hora);

	}

	public void agendarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            interfaceCentral.agendarVistoria(cliente, funcionario, imovel, data_hora);

	}

	public void registrarCliente(String nome, String email, String celular) {
            interfaceCentral.registrarCliente(nome, email, celular);

	}

	/**
	 *  
	 */
	public void registrarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {
            interfaceCentral.registrarAluguel(caucao, comissao_imobiliaria, desconto, funcionario_responsavel, imovel, locatario);

	}

	public void registrarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
            interfaceCentral.registrarImovel(nome, proprietario, ocupacao, tipo, laudo_tecnico, laudo_vistoria);

	}

	public void registrarLaudoVistoria(String nome_laudo, String nome_imovel, String descricao) {
            interfaceCentral.registrarLaudoVistoria(nome_laudo, nome_imovel, descricao);

	}

	public void registrarLaudoTecnico(String nome_laudo, String nome_imovel, String endereco, float valor_imovel, float area) {
            interfaceCentral.registrarLaudoTecnico(nome_laudo, nome_imovel, endereco, valor_imovel, area);

	}
        
        public boolean registrarSeguro(String nome, double valor, String descricao) {
            return interfaceCentral.registrarSeguro(nome, valor, descricao);
        }
        
        public double consultaGastosMensais() {
            return interfaceCentral.consultaGastosMensais();
        }
        public String consultaIdentificador(int objetivo, String identificador) {
            return interfaceCentral.consultaIdentificador(objetivo, identificador);
        }
        public String consultaListagem(int objetivo) {
            return interfaceCentral.consultaListagem(objetivo);
        }

}
