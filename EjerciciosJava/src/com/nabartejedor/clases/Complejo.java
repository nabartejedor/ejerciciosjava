package com.nabartejedor.clases;

import java.util.Scanner;

public class Complejo {
	
	private double pReal;
	private double pComplex;
	private static int pContador = 0;
	
	public Complejo(){
		this.pReal = 1.0;
		this.pComplex = 1.0;
		pContador++;
	}
	
	public Complejo(double pReal, double pComplex){
		// llamar a constructor (actualiza el 
		this();
		this.pReal = pReal;
		this.pComplex = pComplex;
		
	}
	

	public void asignar(float numero_x,float numero_y) {
		this.pReal=numero_x;
		this.pComplex=numero_y;
	}
	
    public void sumar(Complejo b) {
		this.pReal = this.pReal + b.pReal;
		this.pComplex = this.pComplex + b.pComplex;
	}
    
    public boolean esIgual(Complejo b){
    	if(this.pReal == b.pReal && this.pComplex == b.pComplex){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    
   // public static void sumar(c1,c2){
   // 	Complejo c = new Complejo();
   // 	c.setpReal(c1.getpReal() + c.setPReal(c2.getpReal());	
   // }
    
    public void imprimir() {
    	System.out.println("el resultado es,parte real: " + this.pReal);
    	System.out.println("el resultado es,parte imaginaria: " + this.pComplex);
    	System.out.println("numero de instancias: " + this.pContador);
	}
    
    // public String toString(){
    // return "(" + this.pReal + "," this.pComplex + ")";
    //}
    
    
    
    
    
}
