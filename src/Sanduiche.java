
public class Sanduiche {
	
	public Pao criaPao() {
		return new PaoFrances();
	}
	
	public Queijo criaQueijo() {
		return new QueijoPrato();
	}
	
	public Presunto criaPresunto() {
		return new PresuntoFrango();
	}
	
	public Ovo criaOvo() {
		return new OvoCapoeira();
	}
	
	public Tomate criaTomate() {
		return new Tomate();
	}
	
	
	
}
