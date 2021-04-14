package editor_command;

import java.awt.Font;

public class NegritoComando {
Font fonteAnterior;
	
	public NegritoComando(Font fonteAnterior) {
		this.fonteAnterior = fonteAnterior;
	}
	public Font executa() {
		//pega o texto e coloca em negrito
		Font trb = new Font("TimesRoman", Font.BOLD, 18);
		return trb;
	}


	public Font desfaz() {
		System.out.println("Chamei desfaz Negrito" + fonteAnterior.getStyle());
		return fonteAnterior;
	}
}
