package Conceitos;

import Factory.FactoryLaudo;

public class Laudo {

	private String nome_responsavel;

	private FactoryLaudo factoryLaudo;
        public Laudo(String nome) {
            this.nome_responsavel = nome;
        }

}
