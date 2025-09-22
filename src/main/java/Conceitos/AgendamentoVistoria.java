package Conceitos;

import java.time.LocalDateTime;

public class AgendamentoVistoria extends Agendamento {
    public AgendamentoVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
        super(cliente, funcionario, imovel, data_hora);
    }

}
