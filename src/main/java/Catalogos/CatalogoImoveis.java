package Catalogos;

import java.util.ArrayList;
import Conceitos.Imovel;
import Controle.ControladorFuncionario;

public class CatalogoImoveis {

	private ArrayList<Imovel> imoveis;

	private Imovel imovel;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public void adicionarImovel(Imovel imovel) {

	}

	/**
	 *  
	 */
	public Imovel buscarImovel(String nome) {
            for(int i = 0; i < imoveis.size(); i++) {
                if(imoveis.get(i).getNome().equals(nome)) {
                    return imoveis.get(i);
                }
            }
            return null;
	}

}
