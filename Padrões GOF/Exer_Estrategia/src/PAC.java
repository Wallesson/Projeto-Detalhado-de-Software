import java.util.ArrayList;

public class PAC implements IFrete{
	
	float frete = 0f;

	public void determinaFrete(float valorFrete) {
		this.frete = valorFrete;
	}
	public float calculaFrete(ArrayList<Produto> produtos) {
		return this.frete;
	}

}
