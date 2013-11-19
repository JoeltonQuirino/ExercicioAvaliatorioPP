package br.com.sorvete.tipo;

import br.com.sorvete.impl.FactoryImpl;
import br.com.sorvete.impl.SorveteImpl;
import br.com.sorvete.interfac.Factory;

public class Morango extends SorveteImpl {

	
	Factory f = new FactoryImpl();
	
	public void saborSorvete () {
		f.criarModelagemSorvete().ModelaSorvete("Copo");
		System.out.println("Morango");
	}
	
	
}
