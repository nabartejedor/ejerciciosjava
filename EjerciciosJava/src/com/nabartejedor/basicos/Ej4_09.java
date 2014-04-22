package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_09 {
	public static void main(String[] args) {
		
		float acum;
		Scanner entrada = new Scanner(System.in);
		
		int factorial = entrada.nextInt();
		acum = factorial;
		
		while(factorial > 1){
			factorial--;
			acum = factorial * acum;
			
		}
		System.out.println("El resultado es " + acum);
	}
}
