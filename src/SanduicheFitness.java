
public class SanduicheFitness extends Sanduiche {

	@Override
	public Pao criaPao() {
		return new PaoIntegral();
	}
	
	@Override
	public Queijo criaQueijo() {
		return new QueijoMussarela();
	}
	@Override
	public Presunto criaPresunto() {
		return new PresuntoFrango();
	}
	@Override
	public Ovo criaOvo() {
		return new OvoCapoeira();
	}
}
