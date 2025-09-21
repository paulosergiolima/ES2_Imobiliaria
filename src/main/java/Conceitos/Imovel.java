package Conceitos;

import Catalogos.CatalogoImoveis;
import Factory.FactoryImovel;

public class Imovel {

	private String nome;

	private Cliente proprietario;

	private boolean ocupacao;

	private int tipo;

	private LaudoTecnico laudo_tecnico;

	private LaudoVistoria laudo_vistoria;

	private Agendamento agendamento;

	private Cliente cliente;

	private Aluguel aluguel;

	private CatalogoImoveis catalogoImoveis;

	private FactoryImovel factoryImovel;

}
