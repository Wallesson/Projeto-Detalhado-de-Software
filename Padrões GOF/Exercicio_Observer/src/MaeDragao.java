
public class MaeDragao implements IObservador{
	int ovoColetado = 0;
	
	public void mudouEstado() {
		ovoColetado++;
		if(ovoColetado==100) {
			this.acordar();
		}
	}
	public void acordar() {
		System.out.println("O dragao acordou!!!");
	}
}
