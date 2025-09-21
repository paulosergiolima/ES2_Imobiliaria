package Conceitos;

import java.util.ArrayList;
import Factory.FactoryPessoa;
import Factory.FactoryNotificacao;

public class Pessoa {

	private String nome;

	private String email;

	private String celular;

	private ArrayList notificacoes;

	private String senha;

	private Cliente cliente;

	private Notificacao notificacao;

	private FactoryPessoa factoryPessoa;

	private FactoryNotificacao factoryNotificacao;

	/**
	 *  
	 */
	public void notificar(String text) {

	};
        public String getNome() {
            return nome;
        };
        public String getEmail() {
            return email;
        };
        public String getCelular() {
            return celular;
        };
        public Pessoa(String nome, String email, String celular) {
		this.nome = nome;
                this.email = email;
                this.celular = celular;
	}
        
        

}
