package editor_command;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Janela extends JFrame implements ActionListener{
	JButton negrito;
	JButton italico;
	JButton desfaz;
	JTextArea corpo;
	
	public Janela() {
		corpo = new JTextArea("Texto");
		this.add(corpo,BorderLayout.CENTER);
		
		negrito = new JButton("Negrito");
		negrito.addActionListener(this);
		this.add(negrito, BorderLayout.EAST);
		
		italico = new JButton("Italico");
		italico.addActionListener(this);
		this.add(negrito, BorderLayout.WEST);
		
		desfaz = new JButton("Desfaz");
		desfaz.addActionListener(this);
		this.add(desfaz, BorderLayout.SOUTH );
		
	}
	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.mostrar();

	}private void mostrar() {
		this.setSize(400,400);
		this.setLocation(100,100);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent publicarPost) {
		System.out.println(publicarPost.getActionCommand());
		System.out.println(corpo.getFont().getStyle());
		Invocador invocar = Invocador.getInstance();
		Font fonte = null;
		switch (publicarPost.getActionCommand()) {
		case "Negrito":
			fonte = invocar.executaComando(Invocador.Negrito, corpo.getFont());
			corpo.setFont(fonte);
			break;
		case "Italico":
			fonte = invocar.executaComando(Invocador.Italico, corpo.getFont());
			corpo.setFont(fonte);
			break;
		case "Desfazer":
			fonte = invocar.desfaz();
			corpo.setFont(fonte);
			break;
		default:
			System.out.println("Botão Invalido");
			break;
		}
		this.repaint();
	}
	

}