package br.com.sorvete.impl;

import br.com.sorvete.interfac.ISorvete;

public abstract class SorveteImpl implements ISorvete{
	
	public void colocarRecheio() {
		System.out.println("Colocar Recheio");
	}

	public abstract void saborSorvete();
	
	@Override
	public void prepararSorvete() {
		colocarRecheio();
		saborSorvete();
		
	}

}
