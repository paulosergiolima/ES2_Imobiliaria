package Factory;

import Conceitos.Notificacao;
import Conceitos.Cliente;
import Conceitos.Pessoa;

public class FactoryNotificacao {

	private Notificacao notificacao;

	private Cliente cliente;

	private Pessoa pessoa;

	/**
	 *  
	 */
	public Notificacao criarNotificacao(String texto) {
                Notificacao noti = new Notificacao(texto);
		return noti;
	}

}
