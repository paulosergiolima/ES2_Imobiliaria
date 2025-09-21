package Factory;

import Conceitos.Laudo;
import Controle.ControladorFuncionario;
import Conceitos.LaudoVistoria;
import Conceitos.LaudoTecnico;

public class FactoryLaudo {

	private Laudo laudo;

	private ControladorFuncionario controladorFuncionario;


	/**
	 *  
	 */
	public LaudoVistoria criarLaudoVistoria(String nome, String descricao) {
		return null;
	}

	/**
	 *  
	 */
	public LaudoTecnico criarLaudoTecnico(String nome, String endereco, float valor_imovel, float area) {
		return null;
	}

}
