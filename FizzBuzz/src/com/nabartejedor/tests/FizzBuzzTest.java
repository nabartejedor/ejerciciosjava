package com.nabartejedor.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nabartejedor.fizzbuzz.Fizzbuzz;
import com.nabartejedor.validador.Buzz;
import com.nabartejedor.validador.Fizz;

public class FizzBuzzTest {
    
	Fizzbuzz fb;
	Fizz fizz;
	Buzz buzz;
	
	
	@Before
	public void setUp() throws Exception {
		fb = new Fizzbuzz();
		fizz = new Fizz();
		buzz = new Buzz();
	}
	
//	@Test
//	public void testDivisores3() {
//		assertTrue(fb.multiploTres(3));
//		assertTrue(fb.multiploTres(6));
//		assertTrue(fb.multiploTres(9));
//		assertFalse(fb.multiploTres(1));
//		
//	}
//	
//	@Test
//	public void testDivisores5() {
//		assertTrue(fb.multiploCinco(5));
//		assertTrue(fb.multiploCinco(10));
//		assertTrue(fb.multiploCinco(15));
//		assertFalse(fb.multiploCinco(1));
//		
//	}
//	
//	@Test
//	public void testDivisores15() {
//		assertTrue(fb.multiploQuince(15));
//		assertFalse(fb.multiploCinco(1));
//		assertFalse(fb.multiploCinco(5));
//		assertFalse(fb.multiploCinco(3));
//	}
	
	@Test
	public void testFizzDivisores3() {
		assertTrue(fizz.validar(3));
		assertTrue(fizz.validar(6));
		assertTrue(fizz.validar(9));
		assertFalse(fizz.validar(1));
	}
	
	@Test
	public void testFizz() {
		assertEquals("Fizzbuzz 1", "Fizz", fizz.getTexto());
	}
	
	//@Test
	//public void testFizzBuzzDivisores15() {
	//	assertTrue(fb.validar(15));
	//	assertTrue(fb.validar(30));
	//	assertFalse(fb.validar(10));
	//}
	
	//@Test
	//public void testFizzBuzz() {
	//	assertEquals("Fizzbuzz 1", "FizzBuzz", fb.FizzBuzz());
	//}
	
	@Test
	public void testBuzz() {
		assertEquals("Fizzbuzz 1", "Buzz", buzz.getTexto());
	}
	
	
	@Test
	public void testBuzzDivisores5() {
		assertTrue(buzz.validar(5));
		assertTrue(buzz.validar(10));
		assertTrue(buzz.validar(15));
		assertFalse(buzz.validar(6));
	}
	

	
	@Test
	public void test() {
		assertEquals("Fizzbuzz 1", "1", fb.calcular(1));
		assertEquals("Fizzbuzz 1", "1 2", fb.calcular(2));
		assertEquals("Fizzbuzz 1", "1 2 Fizz", fb.calcular(3));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7", fb.calcular(7));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8", fb.calcular(8));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz", fb.calcular(9));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", fb.calcular(10));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11", fb.calcular(11));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz", fb.calcular(12));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13", fb.calcular(13));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14", fb.calcular(14));
		assertEquals("Fizzbuzz 1", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.calcular(15));
	}

}
