package Conceitos;

import java.time.LocalDateTime;
        
public class AgendamentoVisita extends Agendamento {
    public AgendamentoVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
        super(cliente, funcionario, imovel, data_hora);
    }

}
