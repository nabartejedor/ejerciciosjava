package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_18 {
	public static void main(String[] args) {
		int numentrada = 5;
		int numsalida = 5;
		int[] tablauno = new int [5];
		int[] tablados = new int [5];
		
		String texto = "";
		Scanner entrada = new Scanner(System.in);
		
		while(numentrada > 0){
			int mientrada = entrada.nextInt();
			tablauno[numentrada-1] = mientrada;
			numentrada--;
		}
		
		while(numsalida > 0){
			int misalida = entrada.nextInt();
			tablados[numsalida-1] = misalida;
			numsalida--;
		}
		
		
		
	}
}
