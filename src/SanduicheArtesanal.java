
public class SanduicheArtesanal extends Sanduiche {

	@Override
	public Pao criaPao() {
		return new PaoBola();
	}
	
	@Override
	public Queijo criaQueijo() {
		return new QueijoCheddar();
	}
	@Override
	public Presunto criaPresunto() {
		return new PresuntoPeru();
	}
	@Override
	public Ovo criaOvo() {
		return new OvoGranja();
	}
	
}
