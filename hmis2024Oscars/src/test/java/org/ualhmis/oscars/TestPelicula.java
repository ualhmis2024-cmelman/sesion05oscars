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
	
	@Test
	void testGetActrizProtagonista() {
		Actriz ap1 = new Actriz("Emma Watson", "m", "15/04/1990");
		Director d1 = new Director ("Chris Columbus", "h", "10/09/1958");
		Pelicula peli1 = new Pelicula("Harry Potter", d1);
		peli1.setActrizProtagonista(ap1);
		assertEquals(peli1.getActrizProtagonista().getNombre(), "Emma Watson");
	}
	
	@Test
	void testGetActoresSecundarios() {
		Actor as1 = new Actor("Robert Downey Jr.", "h", "04/04/1965");
		Actor as2 = new Actor("Matt Damon", "h", "08/10/1970");
		Director d1 = new Director ("Christopher Nolan", "h", "30/07/1970");
		Pelicula peli1 = new Pelicula("Oppenheimer", d1);
		peli1.addActorSecundario(as1);
		peli1.addActorSecundario(as2);
		
		Actor as3 = new Actor("Rupert Grint", "h", "24/08/1988");
		Director d2 = new Director ("Chris Columbus", "h", "10/09/1958");
		Pelicula peli2 = new Pelicula("Harry Potter", d2);
	    peli2.addActorSecundario(as3);
	    
		assertEquals(peli1.getActoresSecundarios().get(0).getNombre(), "Robert Downey Jr.");
		assertEquals(peli1.getActoresSecundarios().get(1).getNombre(), "Matt Damon");
		assertEquals(peli2.getActoresSecundarios().get(0).getNombre(), "Rupert Grint");
	}
	
	@Test
	void testGetActricesSecundarias() {
		Actriz as1 = new Actriz("Florence Pugh", "m", "03/01/1996");
		Director d1 = new Director ("Christopher Nolan", "h", "30/07/1970");
		Pelicula peli1 = new Pelicula("Oppenheimer", d1);
		peli1.addActrizSecundaria(as1);
		
		Actriz as2 = new Actriz("Bonnie Wright", "m", "17/02/1991");
		Director d2 = new Director ("Chris Columbus", "h", "10/09/1958");
		Pelicula peli2 = new Pelicula("Harry Potter", d2);
	    peli2.addActrizSecundaria(as2);
	    
		assertEquals(peli1.getActricesSecundarias().get(0).getNombre(), "Florence Pugh");
		assertEquals(peli2.getActricesSecundarias().get(0).getNombre(), "Bonnie Wright");
	}

}
