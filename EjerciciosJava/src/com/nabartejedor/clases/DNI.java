package com.nabartejedor.clases;

import java.lang.*;

public abstract class DNI {
	
	private static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKET";
	
    
    public static boolean validar(String dni){	
        return comprobarFormato(dni) && ....
       
     //   char letra = juegoCaracteres.charAt(modulo);
      
        int inicio = 0;
        int fin = 7;
        
        int digitos = dni.substring(inicio,fin);
        char letra_entrada = dni.substring(7,1);
         
        int indice = digitos % 23;
        String letra_tabla = juegoCaracteres.substring(indice,1);
        
        return charAt(letra_tabla) == letra_entrada;
        
      } 
    }


private static boolean comprobarFormato(String dni){

  boolean valido = true;
  
  valido = (dni.length() == 9);
  if(valido){
	  char c = dni.charAt(dni..length()-1);
	  
	  
	  
	  
	  
}

  
  private static boolean comprobarLetra(String dni){
	  char letra...
	  int num = Integer.valueOf(dni.substring(0, dni.length()-1));
	  
	  return NIF_STRING_ASOCIATION.charAt(num % 23) == letra;
  }
  }
	
}
