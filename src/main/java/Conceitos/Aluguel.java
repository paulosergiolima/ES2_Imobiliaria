package Conceitos;

import Catalogos.CatalogoAlugueis;
import Factory.FactoryAluguel;
import Factory.FactoryCobranca;

public class Aluguel {

	private int caucao;

	private float comissao_imobiliaria;

	private float desconto;

	private Funcionario funcionario_responsavel;

	private Imovel imovel;

	private Cliente locatario;

	private LaudoVistoria laudoVistoria;

	private LaudoTecnico laudoTecnico;

	private CatalogoAlugueis catalogoAlugueis;

	private FactoryAluguel factoryAluguel;

	private FactoryCobranca factoryCobranca;

	/**
	 *  
	 */
	public CobrancaAluguel criarCobrancaAluguel() {
                CobrancaAluguel cobranca = factoryCobranca.criarCobrancaAluguel(desconto);
                this.locatario.adicionarCobrancaAluguel(cobranca);
		return cobranca;
	}
        public Cliente getCliente() {
            return this.locatario;
        }
        public Aluguel (int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {
                this.caucao = caucao;
                this.comissao_imobiliaria = comissao_imobiliaria;
                this.desconto = desconto;
                this.funcionario_responsavel = funcionario_responsavel;
                this.imovel = imovel;
                this.locatario = locatario;
	}

}
