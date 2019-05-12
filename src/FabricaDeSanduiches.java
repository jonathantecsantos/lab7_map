
public class FabricaDeSanduiches {
	
	public static void main(String[] args) {
		
		Sanduiche sanduicheComum = new Sanduiche();
		Sanduiche sanduicheArtesanal = new SanduicheArtesanal();
		Sanduiche sanduicheFitness = new SanduicheFitness();
		
		System.out.println("Sanduiche Comum:");
		System.out.println(sanduicheComum.criaPao().tipo());
		System.out.println(sanduicheComum.criaPresunto().tipo());
		System.out.println(sanduicheComum.criaQueijo().tipo());
		System.out.println(sanduicheComum.criaOvo().tipo());
		System.out.println();
		
		System.out.println("Sanduiche Artesanal:");
		System.out.println(sanduicheArtesanal.criaPao().tipo());
		System.out.println(sanduicheArtesanal.criaPresunto().tipo());
		System.out.println(sanduicheArtesanal.criaQueijo().tipo());
		System.out.println(sanduicheArtesanal.criaOvo().tipo());
		System.out.println();
		
		System.out.println("Sanduiche Fitness:");
		System.out.println(sanduicheFitness.criaPao().tipo());
		System.out.println(sanduicheFitness.criaPresunto().tipo());
		System.out.println(sanduicheFitness.criaQueijo().tipo());
		System.out.println(sanduicheFitness.criaOvo().tipo());
		
		
	}
	
}
