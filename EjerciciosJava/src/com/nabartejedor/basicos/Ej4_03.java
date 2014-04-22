package com.nabartejedor.basicos;

import java.util.Scanner;

public class Ej4_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int radio = entrada.nextInt();
		
		double volumen, superficie;
        volumen = (4/3) * Math.PI * Math.pow(radio, 3);
        superficie = (float) (4 * Math.PI * Math.pow(radio, 2));
        
        System.out.println("El volumen de la esfera es: " + volumen);
        System.out.println("La superficie de la esfera es: " + superficie);
	}

}