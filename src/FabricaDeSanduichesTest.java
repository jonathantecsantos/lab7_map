import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricaDeSanduichesTest {

	@Test
	void testSanduicheComum() {
		
		Sanduiche sanduicheComum = new Sanduiche();
		
		Sanduiche sanduicheFitness = new SanduicheFitness();
		
		assertEquals("Pao Frances", sanduicheComum.criaPao().tipo());
		assertEquals("Presunto de Frango", sanduicheComum.criaPresunto().tipo());
		assertEquals("Queijo Prato", sanduicheComum.criaQueijo().tipo());
		assertEquals("Ovo de Capoeira", sanduicheComum.criaOvo().tipo());
	}
	
	@Test
	void testSanduicheArtesanal() {
		Sanduiche sanduicheArtesanal = new SanduicheArtesanal();
		
		assertEquals("Pao Bola", sanduicheArtesanal.criaPao().tipo());
		assertEquals("Presunto de Peru", sanduicheArtesanal.criaPresunto().tipo());
		assertEquals("Queijo Cheddar", sanduicheArtesanal.criaQueijo().tipo());
		assertEquals("Ovo de Granja", sanduicheArtesanal.criaOvo().tipo());
	}
	
	@Test
	void testSanduicheFitness() {
		Sanduiche sanduicheFitness = new SanduicheFitness();
		
		assertEquals("Pao Integral", sanduicheFitness.criaPao().tipo());
		assertEquals("Presunto de Frango", sanduicheFitness.criaPresunto().tipo());
		assertEquals("Queijo Mussarela", sanduicheFitness.criaQueijo().tipo());
		assertEquals("Ovo de Capoeira", sanduicheFitness.criaOvo().tipo());
	}
	

}
