package com.nabartejedor.clases;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class Primos {
	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		//Metodos m = new Metodos();
		
		System.out.println("El numero es primo: " + Metodos.calcularSiEsPrimo(numero));
		System.out.println("La lista de numeros primos es: " + Arrays.toString(Metodos.calcularListaPrimos(numero)));
	    
	}
	
}
