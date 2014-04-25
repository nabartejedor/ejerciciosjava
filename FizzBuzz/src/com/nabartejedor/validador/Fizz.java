package com.nabartejedor.validador;

public class Fizz implements InterfazFizzBuzz  {
	
	private final String output = "Fizz";
	  
	 public boolean validar(int num){
    	 return (num % 3 == 0);
     }
     
	  public  String getTexto(){
	    	 return output;
	  }
	  
}
