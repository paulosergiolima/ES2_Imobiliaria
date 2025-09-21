package Factory;

import Conceitos.Agendamento;
import Catalogos.CatalogoAgendamentos;
import Controle.ControladorFuncionario;
import Conceitos.AgendamentoVisita;
import Conceitos.Cliente;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.AgendamentoVistoria;

public class FactoryAgendamento {

	private Agendamento agendamento;

	private CatalogoAgendamentos catalogoAgendamentos;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public AgendamentoVisita criarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel) {
		return null;
	}

	/**
	 *  
	 */
	public AgendamentoVistoria criarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel) {
		return null;
	}

}
