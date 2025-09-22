package Conceitos;

import java.time.LocalDateTime;
import Factory.FactoryCobranca;

public class Cobranca {

	private float valor;

	private LocalDateTime dia_pagamento;

	private Cliente cliente;

	private FactoryCobranca factoryCobranca;
        
        public Cobranca(float valor, LocalDateTime dia_pagamento, Cliente cliente) {
            this.valor = valor;
            this.dia_pagamento = dia_pagamento;
            this.cliente = cliente;
        }

}
