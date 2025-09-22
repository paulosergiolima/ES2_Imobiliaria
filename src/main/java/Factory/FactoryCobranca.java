package Factory;

import Conceitos.Cobranca;
import Controle.Timer;
import Conceitos.Aluguel;
import Conceitos.Cliente;
import Conceitos.CobrancaAluguel;
import Conceitos.Multa;

import java.time.YearMonth;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class FactoryCobranca {

	private Cobranca cobranca;

	private Timer timer;

	private Aluguel aluguel;

	private Cliente cliente;

	/**
	 *  
	 */
	public CobrancaAluguel criarCobrancaAluguel(float valor) {
                LocalDateTime now = LocalDateTime.now();
                YearMonth yearMonth = YearMonth.from(now);
        
                LocalDate lastDay = yearMonth.atEndOfMonth();
                LocalDateTime lastDayDateTime = lastDay.atTime(now.toLocalTime());
                CobrancaAluguel cobranca = new CobrancaAluguel(valor, lastDayDateTime, this.cliente);
		return cobranca;
	}

	/**
	 *  
	 */
	public Multa criarMulta(float valor) {
		return null;
	}

}
