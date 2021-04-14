import java.util.ArrayList;

public class OvoDragao implements ISujeito {
	ArrayList<IObservador> observadores;
	
	public OvoDragao() {
		this.observadores = new ArrayList<IObservador>();
	}
	
	public void ovoColetado() {
		this.notifique();
	}
	
	public void adicionaObserver(IObservador observador) {
		this.observadores.add(observador);
	}
	
	public void removeObserver(IObservador observador) {
		this.observadores.remove(observador);
	}
	
	public void notifique() {
		for(IObservador obs:this.observadores) {
			obs.mudouEstado();
		}		
	}
	
}
