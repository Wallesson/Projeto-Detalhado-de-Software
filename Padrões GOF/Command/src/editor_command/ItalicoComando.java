package editor_command;

import java.awt.Font;

public class ItalicoComando implements Comando {
	Font fonteAnterior;
	
	public ItalicoComando(Font fonteAnterior) {
		this.fonteAnterior = fonteAnterior;
	}
	public Font executa() {
		//pega o texto e coloca em italico
		Font trb = new Font("TimesRoman", Font.ITALIC, 18);
		return trb;
	}


	public Font desfaz() {
		System.out.println("Chamei desfaz Italico" + fonteAnterior.getStyle());
		return fonteAnterior;
	}

}
