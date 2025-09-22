package Controle;

import Conceitos.Funcionario;
import Factory.FactoryAgendamento;
import Catalogos.CatalogoAgendamentos;
import Factory.FactoryCliente;
import Catalogos.CatalogoClientes;
import Factory.FactoryAluguel;
import Catalogos.CatalogoAlugueis;
import Factory.FactoryImovel;
import Factory.FactoryLaudo;
import Catalogos.CatalogoImoveis;
import Conceitos.Cliente;
import Conceitos.Imovel;
import Conceitos.LaudoTecnico;
import Conceitos.LaudoVistoria;
import Conceitos.AgendamentoVisita;

import java.time.LocalDateTime;

public class ControladorFuncionario {

	private ControladorCentral controladorCentral;

	private Funcionario funcionario;

	private FactoryAgendamento factoryAgendamento;

	private CatalogoAgendamentos catalogoAgendamentos;

	private FactoryCliente factoryCliente;

	private CatalogoClientes catalogoClientes;

	private FactoryAluguel factoryAluguel;

	private CatalogoAlugueis catalogoAlugueis;

	private FactoryImovel factoryImovel;

	private FactoryLaudo factoryLaudo;


	private CatalogoImoveis catalogoImoveis;

	/**
	 *  
	 */
	public void agendarVisita(Cliente cliente, Funcionario funcionario, Imovel imovel, LocalDateTime data_hora) {
            AgendamentoVisita visita = factoryAgendamento.criarVisita(cliente, funcionario, imovel, data_hora);
            catalogoAgendamentos.adicionarVisita(visita);
            cliente.notificar("Agendamento feito");
            funcionario.notificar("Agendamento feito");
            
            

	}

	/**
	 *  
	 */
	public void agendarVistoria(Cliente cliente, Funcionario funcionario, Imovel imovel) {

	}

	/**
	 *  
	 */
	public void registrarCliente(String nome, String email, String celular) {
            Cliente cliente = factoryCliente.criarCliente(nome, email, celular);
            catalogoClientes.adicionarCliente(cliente);
	}

	public void registrarAluguel(int caucao, float comissao_imobiliaria, float desconto, Funcionario funcionario_responsavel, Imovel imovel, Cliente locatario) {

	}

	public void registrarImovel(String nome, Cliente proprietario, boolean ocupacao, int tipo, LaudoTecnico laudo_tecnico, LaudoVistoria laudo_vistoria) {
            Imovel imovel = factoryImovel.criarImovel(nome, proprietario, ocupacao, tipo, laudo_tecnico, laudo_vistoria);
            catalogoImoveis.adicionarImovel(imovel);

	}

	public void registrarLaudoVistoria(String nome_laudo, String nome_imovel, String descricao) {

	}

	public void registrarLaudoTecnico(String nome_laudo, String nome_imovel, String endereco, float valor_imovel, float area) {

	}

}
