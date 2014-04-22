package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_16 {
	public static void main(String[] args) {
		int numentrada = 5;
		int[] tabla = new int [5];
		String texto = "";
		int mayor = 0;
		int menor = 99999;
		
		Scanner entrada = new Scanner(System.in);
		while(numentrada > 0){
			int mientrada = entrada.nextInt();
			if(mientrada > mayor){
				mayor = mientrada;
			}
			if(mientrada < menor){
				menor = mientrada;
			}
			tabla[numentrada-1] = mientrada;
			numentrada--;
		}
		texto = "tabla introducida";
		System.out.println(texto);
		
		texto = "numero menor: " + menor;
		System.out.println(texto);
		
		texto = "numero mayor: " + mayor;
		System.out.println(texto);
		
	}
}
