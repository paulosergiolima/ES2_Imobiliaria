package Conceitos;

public class LaudoVistoria extends Laudo {

	private String descricao;

	private Aluguel aluguel;
        public LaudoVistoria(String nome, String descricao) {
                super(nome);
                this.descricao = descricao;
	}

}
