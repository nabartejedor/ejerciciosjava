package com.nabartejedor.clases;

import java.lang.*;

public class DNI {
	
    {
      public class boolean calculoDni(String dni){	
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
       
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

	
}
