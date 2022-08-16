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
		assertEquals(5,func.devuelveCentral(1, 5, 9), "Error del número central");
		assertEquals(2,func.devuelveCentral(1, 4, 2), "Error del número central");
		assertEquals(15,func.devuelveCentral(7, 15, 19), "Error del número central");
		assertEquals(20,func.devuelveCentral(20, 5, 39), "Error del número central");
		assertEquals(-2,func.devuelveCentral(-2, 0, -5), "Error del número central");
		
	}
	
	@Test
	void esBisiestoTest() {
		assertTrue(func.esBisiesto(2000), "El año 2000 8 debería devolver true");
		assertFalse(func.esBisiesto(1800), "El año 1800 debería devolver false");
		assertFalse(func.esBisiesto(1900), "El año 1900 debería devolver false");
		assertFalse(func.esBisiesto(1953), "El año 1953 debería devolver false");
		assertFalse(func.esBisiesto(1600), "El año 1600 debería devolver error");

	}

}
