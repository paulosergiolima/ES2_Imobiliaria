package Conceitos;

import java.time.LocalDateTime;
import Catalogos.CatalogoAgendamentos;
import Factory.FactoryAgendamento;

public class Agendamento {

	private Cliente cliente;

	private Funcionario funcionario;

	private Imovel imovel;

	private LocalDateTime data_hora;

	private CatalogoAgendamentos catalogoAgendamentos;

	private FactoryAgendamento factoryAgendamento;

}
