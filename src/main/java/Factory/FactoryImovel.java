package Factory;

import Conceitos.Imovel;
import Controle.ControladorFuncionario;
import Conceitos.Cliente;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;

public class FactoryImovel {

	private Imovel imovel;

	private ControladorFuncionario controladorFuncionario;

	public Imovel criarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
                Imovel imovel = new Imovel(nome, proprietario, ocupacao, tipo, laudo_tecnico, laudo_vistoria);
		return imovel;
	}

}
