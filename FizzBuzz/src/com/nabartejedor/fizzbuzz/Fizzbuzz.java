package com.nabartejedor.fizzbuzz;

import java.util.ArrayList;

import com.nabartejedor.validador.Buzz;
import com.nabartejedor.validador.Fizz;
import com.nabartejedor.validador.FizzBuzz;
import com.nabartejedor.validador.InterfazFizzBuzz;

public class Fizzbuzz {
	
	Fizz miFizz = new Fizz();
	Buzz miBuzz = new Buzz();
	FizzBuzz miFizzBuzz = new FizzBuzz();
	String sep = " ";
	
	ArrayList<InterfazFizzBuzz> validadores = new ArrayList<InterfazFizzBuzz>();
	
	public Fizzbuzz() {
		validadores.add(miFizz);
		validadores.add(miBuzz);
		validadores.add(miFizzBuzz);
	}

	public String calcular(int num) {
		int i;
		String salida = "";
		for (i = 1; i <= num; i++) {
			
			validadores.listIterator(i);

			if (i == 1) {
				salida += " ";
					
			}
			
			
			/*if (this.validar(i))
				salida += this.FizzBuzz();
			else if (miBuzz.validar(i))
				salida += miBuzz.Buzz();
			else if (miFizz.validar(i))
				salida += miFizz.Fizz();
			else {
				salida += (Integer.toString(i));
			}*/

		}
		return salida;

	}

	public String separador(String sep) {
		return sep;
	}

}
