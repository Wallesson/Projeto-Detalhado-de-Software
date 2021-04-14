package editor_command;

import java.awt.Font;

public interface Comando {
	public Font executa();
	public Font desfaz();
}
