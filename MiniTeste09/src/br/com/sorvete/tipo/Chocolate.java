package br.com.sorvete.tipo;

import br.com.sorvete.impl.FactoryImpl;
import br.com.sorvete.impl.SorveteImpl;
import br.com.sorvete.interfac.Factory;


public class Chocolate extends SorveteImpl{

	
	Factory f = new FactoryImpl();
	
	@Override
	public void saborSorvete() {
		System.out.println("Chocolate");
		f.criarModelagemSorvete().ModelaSorvete("Copo");
			
	}
	
	
	
	
	
	

}
