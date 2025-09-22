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
                LaudoVistoria laudo_vistoria = new LaudoVistoria(nome, descricao);
		return laudo_vistoria;
	}

	/**
	 *  
	 */
	public LaudoTecnico criarLaudoTecnico(String nome, String endereco, float valor_imovel, float area) {
                LaudoTecnico laudo_tecnico = new LaudoTecnico(nome, endereco, valor_imovel, area);
		return laudo_tecnico;
	}

}
