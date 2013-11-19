package br.com.sorvete.impl;

import br.com.sorvete.interfac.Factory;
import br.com.sorvete.tipo.Casquinha;
import br.com.sorvete.tipo.Chocolate;
import br.com.sorvete.tipo.Copo;
import br.com.sorvete.tipo.Morango;



public class FactoryImpl implements Factory{

	@Override
	public Casquinha criarCasquinha() {
		
		return new Casquinha();
	}

	@Override
	public Copo criarCopo() {
		
		return new Copo();
	}

	@Override
	public FacadeImpl criarFacadeImpl() {
		
		return new FacadeImpl();
	}

	@Override
	public ModelagemSorvete criarModelagemSorvete() {
		
		return new ModelagemSorvete();
	}

	@Override
	public Chocolate criarSorveteChocolate() {
		
		return new Chocolate();
	}

	@Override
	public Morango criarSorveteMorango() {
		
		return new Morango();
	}

	
}