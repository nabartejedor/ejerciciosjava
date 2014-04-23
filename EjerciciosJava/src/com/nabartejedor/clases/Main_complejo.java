package com.nabartejedor.clases;

import java.util.Scanner;

public class Main_complejo {
	public static void main(String[] args) {
		System.out.println("Introduce el numero x: ");
		Scanner entrada_x = new Scanner(System.in);
		double numero_x = entrada_x.nextInt();
		
		System.out.println("Introduce el numero y: ");
		Scanner entrada_y = new Scanner(System.in);
		double numero_y = entrada_y.nextInt();
		
		Complejo nuevo_compl = new Complejo(numero_x, numero_y); 
		//nuevo_compl.asignar(numero_x,numero_y);
	}
	
	
	
}
