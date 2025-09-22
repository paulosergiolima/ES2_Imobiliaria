package Catalogos;

import java.util.ArrayList;
import Conceitos.Agendamento;
import Factory.FactoryAgendamento;
import Controle.ControladorFuncionario;
import Conceitos.AgendamentoVisita;
import Conceitos.AgendamentoVistoria;

public class CatalogoAgendamentos {

	private ArrayList<Agendamento> agendamentos;

	private Agendamento agendamento;

	private FactoryAgendamento factoryAgendamento;

	private ControladorFuncionario controladorFuncionario;
        
        public CatalogoAgendamentos() {
            this.agendamentos = new ArrayList<>();
        }

	public void adicionarVisita(AgendamentoVisita visita) {
            this.agendamentos.add(visita);
	}

	/**
	 *  
	 */
	public void adicionarVistoria(AgendamentoVistoria vistoria) {
            this.agendamentos.add(vistoria);
	}

}
