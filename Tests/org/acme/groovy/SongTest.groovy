package org.acme.groovy;

import static org.junit.Assert.*;
import org.junit.Test;

class SongTest {
	@Test
	void testToString(){
		Song sng = new Song()
		sng.artist = "Fear Factory"
		sng.name = "Archetype"
		sng.genre = "Industrial"
		
		assertEquals("Archetype, Fear Factory, Industrial", sng.toString())
	}

}
