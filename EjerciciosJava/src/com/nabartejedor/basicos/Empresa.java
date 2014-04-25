package com.nabartejedor.basicos;

public class Empresa {
	private String nombre;
	private int tamaino;
	private Empleado empleado[];
	private static int contador = 0;
	
	public static int getContador() {
		return contador;
	}

	public static void incrementaContador() {
		Empresa.contador++;
	}
	
	public static void decrementaContador() {
		Empresa.contador--;
	}

	public Empresa(String nombre, int tamaino){
		this.nombre = nombre;
		this.tamaino = tamaino;
    }
	
	public String getNombre(){
   	    return this.nombre;
    }
	 
	public int getTamaino(){
	    return this.tamaino;
	}
	
	public Empleado getEmpleado(int entero){
	    return this.empleado[entero];
	}
	
	public void despideEmpleado(int entero){
		this.empleado[entero] = null;
	}
	
	public void nuevoEmpleado(String nombre, double sueldo){
		incrementaContador();
		empleado[this.contador - 1].nombre = nombre;
		empleado[this.contador - 1].sueldo = sueldo;	
	}
	
}
