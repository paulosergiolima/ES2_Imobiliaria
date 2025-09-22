package Conceitos;

import java.time.LocalDateTime;

public class Multa extends Cobranca {

	private float juros;
        
        public Multa(float valor, LocalDateTime dia_pagamento, Cliente cliente, float juros) {
            super(valor, dia_pagamento, cliente);
            this.juros = juros;
        }


}
