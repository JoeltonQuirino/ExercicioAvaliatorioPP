package br.com.sorvete.impl;

import br.com.sorvete.interfac.Factory;
import br.com.sorvete.interfac.ModelaSorvete;



public class ModelagemSorvete {
	
	Factory fabrica = new FactoryImpl();
	
	ModelaSorvete modelar;
	
	public void ModelaSorvete (String sorvete){
		sorvete.toLowerCase();
		if (sorvete.equals("copo")){
			modelar  = fabrica.criarCopo();
		} else if (sorvete.equals("casquinha")){
			modelar = fabrica.criarCasquinha();
			
		}else {
			System.out.println("Digite uma referencia correta");
		}
	}
	
}
