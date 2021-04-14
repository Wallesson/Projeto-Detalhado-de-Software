package editor_command;

import java.awt.Font;
import java.util.LinkedList;

public class Invocador {
	public static int Negrito = 1;
	public static int Italico = 2;

	LinkedList<Comando> comandos;
	static Invocador invocador;
	
	private Invocador() {
		comandos = new LinkedList<Comando>();
	}
	
	public static Invocador getInstance() {
		if(invocador == null) {
			invocador = new Invocador();
		}
		return invocador;
	}
	
	public Font executaComando(int tipoComando, Font fonteAnterior) {
		Comando comando = null;
		if(tipoComando == Invocador.Negrito) {
			comando = (Comando) new NegritoComando(fonteAnterior);
			this.comandos.add(comando);
		}
		else if(tipoComando == Invocador.Italico) {
			comando = new ItalicoComando(fonteAnterior);
			this.comandos.add(comando);
		}
		if(comando!=null) {
			return comando.executa();
		}else {
			return new Font("Garamond", Font.PLAIN,32);
		}
	}
	
	public Font desfaz() {
		Comando comando = this.comandos.pollLast();
		if(comando != null) {
			return comando.desfaz();
		}else {
			return new Font("Garamond", Font.PLAIN,32);
		}
	}
}
