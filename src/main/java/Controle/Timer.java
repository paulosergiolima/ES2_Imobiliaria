package Controle;

import Catalogos.CatalogoAlugueis;
import Factory.FactoryCobranca;
import Catalogos.CatalogoClientes;
import java.util.Calendar;

public class Timer {

	private ControladorCentral controladorCentral;

	private CatalogoAlugueis catalogoAlugueis;

	private FactoryCobranca factoryCobranca;

	private CatalogoClientes catalogoClientes;

	/**
	 *  
	 */
	public void timerDiario() {
            Calendar cal = Calendar.getInstance();
            if(cal.get(Calendar.DAY_OF_MONTH) == 1) {
                catalogoAlugueis.criarCobrancaAluguel();
            }
            

	}

}
