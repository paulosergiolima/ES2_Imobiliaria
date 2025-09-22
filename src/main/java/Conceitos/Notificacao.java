package Conceitos;

import Factory.FactoryNotificacao;

public class Notificacao {

	private String conteudo;

	private FactoryNotificacao factoryNotificacao;
        public Notificacao(String conteudo) {
            this.conteudo = conteudo;
            
        }

}
