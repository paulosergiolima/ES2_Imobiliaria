package Factory;

import Conceitos.Aluguel;
import Catalogos.CatalogoAlugueis;
import Controle.ControladorFuncionario;
import Conceitos.Funcionario;
import Conceitos.Imovel;
import Conceitos.Cliente;

public class FactoryAluguel {

	private Aluguel aluguel;

	private CatalogoAlugueis catalogoAlugueis;

	private ControladorFuncionario controladorFuncionario;

	/**
	 *  
	 */
	public Aluguel criarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {
                Aluguel aluguel = new Aluguel(caucao, comissao_imobiliaria, desconto, funcionario_responsavel, imovel, locatario);
		return null;
	}

}
