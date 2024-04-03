package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPremio {
	@Test
	void testGetNombre() {
		Premio p1 = new Premio("Pelicula del anio");
		assertEquals(p1.getNombre(), "Pelicula del anio");
	}
	
	@Test
	void testGetNominadas() {
		Premio p1 = new Premio("Pelicula del anio");
		p1.addNominada(new Pelicula("Avatar", null));
	    p1.addNominada(new Pelicula("Oppenheimer", null));
	    
		Premio p2 = new Premio("Pelicula del anio");
		p2.addNominada(new Pelicula("Guardianes de la galaxia", null));
	    p2.addNominada(new Pelicula("Barbie", null));
		assertEquals(p1.getNominadas(),p2.getNominadas());
	}
}
