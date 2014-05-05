package Ejercicio_final_java;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class Ejercico_final_test {
    
	private static Scanner entrada;
	public static Jugable eligeJuego()
	{
		
		JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3,3);
		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3,2);
		JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3,5);
		
		Jugable[] juegos= new Jugable[3];
		
		juegos[0]=juego;
		
		juegos[1]=juegoPar;
		
		juegos[2]=juegoImpar;
		
		
		Jugable juegoElegido = null;
		boolean numeroDeLista=false;
		while(numeroDeLista==false)
		{
		  System.out.println("Selecciona 1 si quieres jugar al juego normal, Selecciona 2 si quieres jugar al juego par, selecciona 3 si quieres jugar al juego impar: ");
		  entrada = new Scanner(System.in);
		
	      int numero = entrada.nextInt();
			
		  switch(numero) {
		  case 1: 
		     juegoElegido=juegos[0];
		     numeroDeLista=true;
		     break;
		  case 2: 
		     juegoElegido=juegos[1];
			 numeroDeLista=true;
		     break;
		  case 3: 
			 juegoElegido=juegos[2];
			 numeroDeLista=true;
		     break;
		  default: 
		     System.out.println("introduce un numero de la lista");
		     numeroDeLista=false;
		     break;
		}
		
	  }
		    
	  return juegoElegido;
		
		
	}
	
	
	
	Juego juego;
	Juego juego2;

	JuegoAdivinaNumero numero;
	JuegoAdivinaImpar numero_impar;
	JuegoAdivinaPar numero_par;

	@Before
	public void setUp() throws Exception {
		//juego = new Juego(5);
		//juego2 = new Juego(5);	
	}

	@Test
	public void testEjer_final() {
		//assertEquals(5, 5, juego.muestraVidasRestantes());	
		//juego.restarVidas();	
		//assertEquals(5, 4, juego.muestraVidasRestantes());	
		//juego = new Juego(5);	
		//assertEquals(5, 5, juego.muestraVidasRestantes());		
	}

	@Test
	public void testEjer_final_record(){
		//assertEquals(5, 5, juego.actualizaRecord(5));

	}
    
	@Test
	
	public void testValidaNumeros(){
		numero = new JuegoAdivinaNumero(3,3);
		numero_impar = new JuegoAdivinaImpar(3,5);
		numero_par = new JuegoAdivinaPar(3,2);
	    assertTrue(numero.validaNumero(5));	
	    assertTrue(numero.validaNumero(6));
		assertTrue(numero_impar.validaNumero(5));	
	    assertFalse(numero_impar.validaNumero(6));
		assertFalse(numero_par.validaNumero(5));	
		assertTrue(numero_par.validaNumero(6));
	}
	
	@Test
	public void testEjer_final_parimpar(){
		//assertEquals(5, 5, juego.actualizaRecord(5));
		numero = new JuegoAdivinaNumero(3,3);
		numero_impar = new JuegoAdivinaImpar(3,5);
		numero_par = new JuegoAdivinaPar(3,2);

		
		
        Jugable juego= eligeJuego();
		
		juego.muestraNombre();
		
	    juego.muestraInfo();
		
		juego.juega();
		
		
        boolean seguirJugando=true;
		
		while(seguirJugando==true)
		{
		   System.out.println("¿Quieres seguir jugando? (si/no)");
		
		   entrada = new Scanner(System.in);
			
		   String texto = entrada.next();
		
		   if(texto.equals("si"))
		   {
			seguirJugando=true;
			Jugable juego2= eligeJuego();
			
			juego2.muestraNombre();
			
		    juego2.muestraInfo();
			
			juego2.juega();
		   }
		   else
		    {
			seguirJugando=false;
		    }
		}
		
	//	numero.muestraNombre();
	//	numero.muestraInfo();
	//	numero.juega();

		
	//	numero_impar.muestraNombre();
	//	numero_impar.muestraInfo();
	//	numero_impar.juega();

		
	//	numero_par.muestraNombre();
	//	numero_par.muestraInfo();
	//	numero_par.juega();	
	}

	@Test
	public void testEjer_final_entero(){

	}



}
