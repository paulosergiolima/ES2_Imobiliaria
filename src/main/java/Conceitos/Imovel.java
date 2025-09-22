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
        public Imovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
            this.nome = nome;
            this.proprietario = proprietario;
            this.ocupacao = ocupacao;
            this.tipo = tipo;
            this.laudo_tecnico = laudo_tecnico;
            this.laudo_vistoria = laudo_vistoria;
        }

}
