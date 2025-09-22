package Conceitos;
import java.time.LocalDateTime;
public class CobrancaAluguel extends Cobranca {

	/**
	 *  
	 */
	public void criarMulta() {

	}
        public CobrancaAluguel(float valor, LocalDateTime dia_pagamento, Cliente cliente) {
            super(valor, dia_pagamento, cliente);
        }

}
