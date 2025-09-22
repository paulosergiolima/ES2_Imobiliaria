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

	private Cliente cliente;

	private Funcionario funcionario;

	private CatalogoAlugueis catalogoAlugueis;

	private FactoryAluguel factoryAluguel;

	private FactoryCobranca factoryCobranca;

	/**
	 *  
	 */
	public CobrancaAluguel criarCobrancaAluguel() {
                CobrancaAluguel cobranca = factoryCobranca.criarCobrancaAluguel(desconto);
                this.cliente.adicionarCobrancaAluguel(cobranca);
		return cobranca;
	}
        public Cliente getCliente() {
            return cliente;
        }

}
