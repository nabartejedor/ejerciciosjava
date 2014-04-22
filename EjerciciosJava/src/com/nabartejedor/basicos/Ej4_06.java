package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradados = new Scanner(System.in);
		
		int altura = entrada.nextInt();
		int peso = entradados.nextInt();
		
		float masacorp;
		String texto;
		
		masacorp = altura / (peso * peso);
		
		if(masacorp < 16){
			texto = "Criterio de ingreso en hospital";
		}
		else{
			if(masacorp < 19){
			 texto = "Infrapeso";
			}
			else{
				if(masacorp < 26){
					texto = "Bajo peso";
				}
				else{
					if(masacorp < 31){
						texto = "Peso normal (saludable)";
					}else
					{
						if(masacorp < 40){
							texto = "Sobrepeso cr—nico";
						}
						else{
							texto = "Obesidad morbida";
						}
					}
				}
			}
		}
		
		
		
		
		
		System.out.println("Indice masa corporal es: " + texto);
		
		
		
	}
}
