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
        
        public Agendamento(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            this.cliente = cliente;
            this.funcionario = funcionario;
            this.imovel = imovel;
            this.data_hora = data_hora;
        }

}
