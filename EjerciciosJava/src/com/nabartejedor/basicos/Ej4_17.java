package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_17 {
	public static void main(String[] args) {
		int numentrada = 5;
		int numsalida = 5;
		int[] tabla = new int [5];
		Boolean nopalin = false;
		
		String texto = "";
		Scanner entrada = new Scanner(System.in);
		while(numentrada > 0){
			int mientrada = entrada.nextInt();
			tabla[numentrada-1] = mientrada;
			numentrada--;
		}
		
		System.out.println(texto);
		
		while(numsalida > 0){
			if(tabla[numsalida-1] != tabla[5-numsalida]){
				nopalin = true;
			}
			numsalida--;
		}
		
		if(nopalin){
			texto = "la tabla no es capicua";
		}
		else{
			texto = "la tabla es capicua";
		}
		System.out.println(texto);
	}
}
