package Ejercicio_final_java;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

	private int nume_adi = 7; 
	public JuegoAdivinaNumero(int vidas, int nume_adi) {
		super(vidas);
		this.nume_adi = nume_adi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void juega() {
		// TODO Auto-generated method stub
		reiniciaPartida();
		String texto = "adivina un numero entre 0 y 10";
		System.out.println(texto);
		
		Scanner entrada = new Scanner(System.in);
		int numerocerodiez = entrada.nextInt();
		
		if(nume_adi == numerocerodiez){
		    texto = "Acertaste!";
			System.out.println(texto);
			actualizaRecord(nume_adi);
		}	
		else{	
			  if(restarVidas()){
				 texto = "No acertaste. Vuelve a jugar";
			     System.out.println(texto);
		  	  }
		}
		
		if(validaNumero(numerocerodiez) == false){
			juega();
		}
		
	}
	
	public boolean validaNumero(int numero){
		return true;
	}
	
	
		
		
}
	


