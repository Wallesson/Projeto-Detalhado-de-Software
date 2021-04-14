
public abstract class IngredienteSanduiche extends SanduicheAbstrato{
	SanduicheAbstrato sanduiche;
	
	public IngredienteSanduiche(SanduicheAbstrato sanduiche) {
		super();
		this.sanduiche = sanduiche;
	}
	public float lerPreco() {
		return this.preco + this.sanduiche.lerPreco();
	}
	
}
