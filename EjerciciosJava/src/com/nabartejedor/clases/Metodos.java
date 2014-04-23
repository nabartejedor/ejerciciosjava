package com.nabartejedor.clases;

import java.util.Vector;

public class Metodos {

	
	public static boolean calcularSiEsPrimo(int numero) {
		boolean noprimo = true;
		int indice = numero;
		while(indice > 2){
			indice--;
			if(numero % indice == 0){
				noprimo = false;
			}	
			
		}
		return noprimo;
	}
	
	public static Object[] calcularListaPrimos(int numero){

		Vector<Integer> v = new Vector<Integer>();
		int indice = numero;
		//System.out.println("Entro en metodo");	
		while(indice > 1){
		 indice--;	
		//System.out.println("Entro en bucle");	
	     if(calcularSiEsPrimo(indice)){
		  v.add(indice);
	     }
	     
		}
		//System.out.println(v.size());
		return v.toArray();
	}
}
