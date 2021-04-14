
public class Decorator {

	public static void main(String[] args) {
			SanduicheAbstrato pao = new PaoFrances();
			SanduicheAbstrato paoOvo = new Ovo(pao);
			SanduicheAbstrato paoOvoQueijo = new Queijo(paoOvo);
			System.out.println( paoOvoQueijo.lerPreco());
	}

}
