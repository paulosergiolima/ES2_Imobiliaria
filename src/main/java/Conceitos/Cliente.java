package Conceitos;

import java.util.ArrayList;
import Catalogos.CatalogoClientes;
import Factory.FactoryCliente;
import Factory.FactoryCobranca;
import Factory.FactoryNotificacao;
import Controle.ControladorCliente;

public class Cliente {

	private Pessoa pessoa;

	private ArrayList<Cobranca> historico_pagamentos;

	private ArrayList<Cobranca> lista_pagamentos;

	private Agendamento agendamento;

	private Imovel imovel;

	private Cobranca cobranca;

	private Aluguel aluguel;

	private CatalogoClientes catalogoClientes;

	private FactoryCliente factoryCliente;

	private FactoryCobranca factoryCobranca;

	private FactoryNotificacao factoryNotificacao;

	private ControladorCliente controladorCliente;
        
        public Cliente(Pessoa pessoa) {
            this.pessoa = pessoa;
        }

	public void notificar(String texto) {
            pessoa.notificar(texto);

	}

	/**
	 *  
	 */
	public void adicionarCobrancaAluguel(CobrancaAluguel cobranca) {

	}

	/**
	 *  
	 */
	public Multa criarMulta() {
		return null;
	}

	/**
	 *  
	 */
	public void adicionarHistoricoPagamento(Cobranca cobranca) {

	}

	public String stringfyCobrancasAtivos() {
		return null;
	}

	/**
	 *  
	 */
	public Cobranca pagarCobranca(int index) {
		return null;
	}
        
        public String getNome() {
            return pessoa.getNome();
        }

}
