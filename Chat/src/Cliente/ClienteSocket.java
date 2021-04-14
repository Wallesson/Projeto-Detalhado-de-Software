package Cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class ClienteSocket {

	public static void main(String[] args) {
		  try {		    
		      Socket cliente = new Socket("127.0.0.1",12345);
		      
		      Scanner teclado = new Scanner(System.in);
		      Scanner chegada = new Scanner(cliente.getInputStream());
		      
		      PrintStream saida = new PrintStream(cliente.getOutputStream());
		      String respostaConexao = chegada.nextLine();
	    	  System.out.println("Resposta do Servidor:\n" + respostaConexao);
		      String mensagem="";
		      
		      do {
		    	  System.out.println("Qual mensagem voce quer mandar para o Servidor?\n");
		    	  mensagem = teclado.nextLine();
		    	  saida.println(mensagem);
		    	  
		    	  String respostaServidor = chegada.nextLine();
		    	  System.out.println("Resposta do Servidor: " + respostaServidor);
		    	  
			} while (mensagem.length() != 0);
		     cliente.close();
		    
		    }
		    catch(Exception e) {
		      System.out.println("Erro: " + e.getMessage());
		    }
	}

}
