package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPelicula {
	
	@Test
	void testGetDirector() {
		Director d1 = new Director ("Christopher Nolan", "h", "30/07/1970");
		Pelicula peli1 = new Pelicula("Oppenheimer", d1);
		assertEquals(peli1.getDirector().getNombre(), "Christopher Nolan");
	}
	
	@Test
	void testGetActorProtagonista() {
		Actor ap1 = new Actor("Cillian Murphy", "h", "25/05/1976");
		Director d1 = new Director ("Christopher Nolan", "h", "30/07/1970");
		Pelicula peli1 = new Pelicula("Oppenheimer", d1);
		peli1.setActorProtagonista(ap1);
		assertEquals(peli1.getActorProtagonista().getNombre(), "Cillian Murphy");
	}

}
