package Ejercicio_final_java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ejercico_final_test {
    
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
		assertEquals(5, 5, juego.muestraVidasRestantes());	
		juego.restarVidas();	
		assertEquals(5, 4, juego.muestraVidasRestantes());	
		//juego = new Juego(5);	
		assertEquals(5, 5, juego.muestraVidasRestantes());		
	}
	
	@Test
	public void testEjer_final_record(){
		//assertEquals(5, 5, juego.actualizaRecord(5));
		
	}
	
	@Test
	public void testEjer_final_parimpar(){
		//assertEquals(5, 5, juego.actualizaRecord(5));
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
	
	
}
