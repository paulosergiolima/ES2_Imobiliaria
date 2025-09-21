package Factory;

import Conceitos.Cobranca;
import Controle.Timer;
import Conceitos.Aluguel;
import Conceitos.Cliente;
import Conceitos.CobrancaAluguel;
import Conceitos.Multa;

public class FactoryCobranca {

	private Cobranca cobranca;

	private Timer timer;

	private Aluguel aluguel;

	private Cliente cliente;

	/**
	 *  
	 */
	public CobrancaAluguel criarCobrancaAluguel(float valor) {
		return null;
	}

	/**
	 *  
	 */
	public Multa criarMulta(float valor) {
		return null;
	}

}
