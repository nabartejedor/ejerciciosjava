package com.nabartejedor.basicos;

public class Empleado {
	private Empresa empresa;
	private String nombre;
	private double sueldo;
	private int numempleado;
	
	
	protected Empleado(Empresa empresa, String nombre, double sueldo){
		this.empresa = empresa;
		Empresa.incrementaContador();
	    this.numempleado = Empresa.getContador();
		this.nombre = nombre;
		this.sueldo = sueldo;
    }

	public String getNombre(){
   	    return this.nombre;
    }
	public double getSueldo(){
	    return this.sueldo;
	}
	public int getNumEmpleado(){
		return this.numempleado;
	}
	public void setNombre(String nombre){
   	   this.nombre = nombre;
    }
	
	
	public void setSueldo(double sueldo){
   	     this.sueldo = sueldo;
    }
	public void imprimir(){
		System.out.println("datos empleado " + this.numempleado + " " + this.nombre + " " + this.sueldo);
	}
	
	public double aumentarSueldo(int porcentaje){
		return this.sueldo + (this.sueldo / porcentaje);
	}
	
	public void despedir(int numempleado){
		Empresa.decrementaContador();
		empresa.despideEmpleado(this.numempleado);
	}
	
}
