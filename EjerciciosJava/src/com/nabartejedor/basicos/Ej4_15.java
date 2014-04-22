package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_15 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int mientrada = entrada.nextInt();
	int x  = (int) (100*Math.random()+1);
	System.out.println(x);
	int indice = 6;
	Boolean encontrado = false;
	String texto = "";
	
	while(encontrado == false && indice > 0){
	
	  if(mientrada > x && encontrado == false){
		  texto = "El numero tiene que ser menor";
		  System.out.println(texto);
		  entrada = new Scanner(System.in);
		  mientrada = entrada.nextInt();
	  }
	  else{
		if(mientrada < x){
		  texto = "El numero tiene que ser mayor";
		  entrada = new Scanner(System.in);
		  System.out.println(texto);
		  mientrada = entrada.nextInt();
		}
		else{
			texto = "resultado correcto";
			encontrado = true;
			System.out.println(texto);
		}
	  }
	  indice--;
    }
	
	
  }
}
