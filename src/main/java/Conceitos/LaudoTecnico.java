package Conceitos;


public class LaudoTecnico extends Laudo {

	private String endereco;

	private float valor_imovel;

	private float area;

	private Aluguel aluguel;
        
        public LaudoTecnico(String nome, String endereco, float valor_imovel, float area) {
                super(nome);
                this.endereco = endereco;
                this.valor_imovel = valor_imovel;
                this.area = area;
	}

}
