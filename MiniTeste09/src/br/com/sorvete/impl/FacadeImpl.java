package br.com.sorvete.impl;

import br.com.sorvete.interfac.Factory;
import br.com.sorvete.interfac.IFacade;
import br.com.sorvete.interfac.ISorvete;

public class FacadeImpl implements IFacade{
	
	Factory fabrica = new FactoryImpl();
	ISorvete chocolate = fabrica.criarSorveteChocolate();
	ISorvete morango = fabrica.criarSorveteMorango();
	
	@Override
	public void fazerSorveteChocolate() {
		
		chocolate.prepararSorvete();
		
	}

	@Override
	public void fazerSorveteMorando() {
		morango.prepararSorvete();
		
	}
	
	
	

}
