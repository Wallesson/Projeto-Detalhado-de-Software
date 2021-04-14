
public interface ISujeito {
	public void adicionaObserver(IObservador observador);
	public void removeObserver(IObservador observador);
	public void notifique();
}
