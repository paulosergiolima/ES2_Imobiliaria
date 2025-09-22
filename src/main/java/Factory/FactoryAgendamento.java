package Factory;

import Conceitos.Agendamento;
import Catalogos.CatalogoAgendamentos;
import Controle.ControladorFuncionario;
import Conceitos.AgendamentoVisita;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.AgendamentoVistoria;
import java.time.LocalDateTime;

public class FactoryAgendamento {

	private Agendamento agendamento;

	private CatalogoAgendamentos catalogoAgendamentos;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public AgendamentoVisita criarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
                AgendamentoVisita visita = new AgendamentoVisita(cliente, funcionario, imovel, data_hora);
		return visita;
	}

	/**
	 *  
	 */
	public AgendamentoVistoria criarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
                AgendamentoVistoria vistoria = new AgendamentoVistoria(cliente, funcionario, imovel, data_hora);
		return vistoria;
	}

}
