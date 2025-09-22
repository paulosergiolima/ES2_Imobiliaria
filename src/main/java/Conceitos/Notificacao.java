package Conceitos;

import Factory.FactoryNotificacao;

public class Notificacao {

	private String conteudo;

	private Pessoa pessoa;

	private FactoryNotificacao factoryNotificacao;
        public Notificacao(String conteudo, Pessoa pessoa) {
            this.conteudo = conteudo;
            this.pessoa = pessoa;
            
        }

}
