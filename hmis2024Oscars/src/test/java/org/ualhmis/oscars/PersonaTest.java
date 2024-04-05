package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testEqualsObject() {
		Persona p1 = new Persona ("Pepe", "h", "01/01/2000");
		Persona p2 = new Persona ("Pepe", "h", "01/01/2000");
		Persona p3 = p1; 
		Persona p4 = null; 
		Persona p5 = new Persona (null, null, null);
		Persona p6 = new Persona ("Pepa", "m", "05/03/2010");
		Persona p7 = new Persona ("Pepe", null, null);
		Persona p8 = new Persona ("Pepe", "h", null);
		Persona p9 = new Persona (null, "m", "05/03/2010");
		Persona p10 = new Persona (null, "m", "05/03/2010");
		Persona p11 = new Persona ("Manolo", "h", "01/01/2000");
		Persona p12 = new Persona ("Manolo", null, "01/01/2000");
		Director d1 = new Director ("Dire", "m", "01/01/2000");
		Pelicula peli1 = new Pelicula("Maven mola !!!", d1);
		
		assertTrue(p1.equals(p2));
		assertTrue(p1.equals(p3));
		assertFalse(p1.equals(p4));
		assertFalse(p1.equals(p5));
		assertFalse(p5.equals(p1));
		assertFalse(p1.equals(p6));
		assertFalse(p6.equals(p1));
		assertFalse(p7.equals(p1));
		assertFalse(p8.equals(p1));
		assertFalse(p1.equals(p7));
		assertFalse(p1.equals(p8));
		assertEquals(false, p1.equals(p4), "El parametro no es null.");
		
		assertFalse (p1.equals(peli1));
		
		assertFalse(p1.equals(p9));
		assertTrue(p9.equals(p10));
		assertFalse(p5.equals(p7));
		assertFalse(p5.equals(p8));
		assertFalse(p1.equals(p11));
		assertFalse(p12.equals(p11));
		assertFalse(p11.equals(p12));
	}
	
	@Test
	void testGetNombre() {
		Persona p1 = new Persona ("Pepe", "h", "01/01/2000");
		assertEquals(p1.getNombre(), "Pepe");
	}
	
	@Test
	void testGetSexo() {
		Persona p1 = new Persona ("Pepe", "h", "01/01/2000");
		assertEquals(p1.getSexo(), "h");
	}
	
	@Test
	void testGetNacimiento() {
		Persona p1 = new Persona ("Pepe", "h", "01/01/2000");
		assertEquals(p1.getFechaNacimiento(), "01/01/2000");
	}
	
	@Test
	void testHash() {
		Persona p1 = new Persona ("Pepe", "h", "01/01/2000");
		Persona p2 = new Persona ("Pepe", "h", "01/01/2000");
		Persona p3 = new Persona (null, null, null);
		assertEquals(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1.hashCode(), p3.hashCode());
	}
}
