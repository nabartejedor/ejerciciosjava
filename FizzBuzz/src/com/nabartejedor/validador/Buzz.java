package com.nabartejedor.validador;

public class Buzz implements InterfazFizzBuzz  {

	 private final String output="Buzz";
	 
	 public boolean validar(int num){
    	 return (num % 5 == 0);
     }
	 
	public String getTexto(){
   	 	return output;
    }
	
	
	 
     
	 
	 
}
