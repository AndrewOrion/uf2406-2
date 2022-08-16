package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import utilidades.Funciones;

class FuncionesTest {
	
	private static Funciones func;

	@BeforeAll
	static void inicioFunciones() {
		func = new Funciones();
	}


	@Test
	void devuelveCentralTest() {
		assertEquals(5,func.devuelveCentral(1, 5, 9), "Error del n�mero central");
		assertEquals(2,func.devuelveCentral(1, 4, 2), "Error del n�mero central");
		assertEquals(15,func.devuelveCentral(7, 15, 19), "Error del n�mero central");
		assertEquals(20,func.devuelveCentral(20, 5, 39), "Error del n�mero central");
		assertEquals(-2,func.devuelveCentral(-2, 0, -5), "Error del n�mero central");
		
	}
	
	@Test
	void esBisiestoTest() {
		assertTrue(func.esBisiesto(2000), "El a�o 2000 8 deber�a devolver true");
		assertFalse(func.esBisiesto(1800), "El a�o 1800 deber�a devolver false");
		assertFalse(func.esBisiesto(1900), "El a�o 1900 deber�a devolver false");
		assertFalse(func.esBisiesto(1953), "El a�o 1953 deber�a devolver false");
		assertFalse(func.esBisiesto(1600), "El a�o 1600 deber�a devolver error");

	}

}
