package Ejercicio_final_java;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	private int nume_adi = 0;
	private Scanner entrada; 
	public JuegoAdivinaNumero(int vidas, int nume_adi) {
		super(vidas);
		this.nume_adi = nume_adi;
		// TODO Auto-generated constructor stub
	}

	public void juega() {
		// TODO Auto-generated method stub
	   	  reiniciaPartida();
		  boolean acertado = false;
		  while(muestraVidasRestantes() > 0 && acertado == false){
		    String texto = "Selecciona un numero:";
		    System.out.println(texto);

	        entrada = new Scanner(System.in);
		    int numerocerodiez = entrada.nextInt();

    		if(nume_adi == numerocerodiez){
    		  acertado = true;
		      texto = "Acertaste!";
			  System.out.println(texto);
			  actualizaRecord(muestraVidasRestantes());
		    }	
	    	else{	
	    		 texto = "No acertaste.";
			     System.out.println(texto);
			     if(restarVidas()){
			    	mostrarFinJuego(); 
			     }
			     else{
			    	 texto = "Vuelve a jugar.";
				     System.out.println(texto);
			     }
		    }
		  }
		//if(validaNumero(numerocerodiez) == false){
		//	juega();
	//	}

	}
    

	public boolean validaNumero(int numero){
		return true;
	}

	@Override
	public void muestraNombre() {
		String texto = "adivina un numero entre 0 y 10.";
		System.out.println(texto);
	}

	@Override
	public void muestraInfo() {
		String texto = "Tienes que adivinar un numero entre 0 y 10. Para ello tienes 3 intentos que equivalen a 3 vidas.";
		System.out.println(texto);

	}




}


	


