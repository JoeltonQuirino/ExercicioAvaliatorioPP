package br.com.sorvete.principal;

import br.com.sorvete.impl.FactoryImpl;
import br.com.sorvete.interfac.Factory;
import br.com.sorvete.interfac.IFacade;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Factory fabrica = new FactoryImpl();
		IFacade facade = fabrica.criarFacadeImpl();
		facade.fazerSorveteChocolate();
	}

}
