package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class TestGestorPremios {
	
	@Test
	void testNominarPelicula() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		GestorPremios p = new GestorPremios();
		p.crearPremio("Aventura del año");
		p.nominarPelicula(null, null);
		
		String salida = "El premio 'null' no existe.";
		assertEquals(salida + System.lineSeparator(), bos.toString(), "La salida por consola no es exactamente igual a la esperada.");

		System.setOut(originalOut);
	}
	
	@Test
	void testAsignarGanadora() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		GestorPremios p = new GestorPremios();
		p.crearPremio("Aventura del año");
		p.asignarGanadora(null, null);;
		
		String salida = "El premio 'null' no existe.";
		assertEquals(salida + System.lineSeparator(), bos.toString(), "La salida por consola no es exactamente igual a la esperada.");

		System.setOut(originalOut);
	}

}
