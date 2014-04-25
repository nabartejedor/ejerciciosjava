package com.nabartejedor.validador;

public class FizzBuzz implements InterfazFizzBuzz {
	
	final private String output = "FizzBuzz";
	
	@Override
	public boolean validar(int valor) {
		return (valor % 3 == 0) && (valor % 5 == 0);
	}

	@Override
	public String getTexto() {
		return output;
	}

}
