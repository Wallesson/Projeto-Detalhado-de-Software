import java.util.ArrayList;

public class Pedido {

	ArrayList<Produto> produtos;
	IFrete frete;
	
	public Pedido(IFrete frete){
		this.produtos = new ArrayList<Produto>();
		this.frete = frete;
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public float calculaFrete() {
		return this.frete.calculaFrete(this.produtos);	
	}
	
	public void defineFrete(IFrete frete) {
		this.frete = frete;
	}
}
