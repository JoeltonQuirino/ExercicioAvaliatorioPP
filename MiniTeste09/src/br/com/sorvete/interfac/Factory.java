package br.com.sorvete.interfac;

import br.com.sorvete.impl.FacadeImpl;
import br.com.sorvete.impl.ModelagemSorvete;
import br.com.sorvete.tipo.Casquinha;
import br.com.sorvete.tipo.Chocolate;
import br.com.sorvete.tipo.Copo;
import br.com.sorvete.tipo.Morango;

public interface Factory {
	
	public Casquinha criarCasquinha();
	public Copo criarCopo();
	public FacadeImpl criarFacadeImpl();
	public ModelagemSorvete criarModelagemSorvete();
	public Chocolate criarSorveteChocolate();
	public Morango criarSorveteMorango();
	
}
