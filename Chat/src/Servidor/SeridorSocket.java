package Servidor;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SeridorSocket {

	public static void main(String[] args) {
	   
		try {

			ServerSocket servidor = new ServerSocket(12345);
			System.out.println("Servidor ouvindo a porta 12345");
	    	Socket cliente = servidor.accept();
		    System.out.println("Cliente conectado no servidor: " + cliente.getInetAddress().getHostAddress());
		    
		    
		    
		    PrintStream saida = new PrintStream(cliente.getOutputStream());
		    String respostaConexao = "Voce está Conectado ao Servidor";
	    	saida.println(respostaConexao);
		    
			Scanner teclado = new Scanner(System.in);
		    Scanner chegada = new Scanner(cliente.getInputStream());
		    
		    
		    
		    while(chegada.hasNextLine()) {
		    	String respostaCliente = chegada.nextLine();
		    	System.out.println("Resposta do Cliente: " + respostaCliente);
		    	
		    	System.out.println("Qual mensagem voce quer mandar para o Cliente?\n");
		    	String resposta = teclado.nextLine();
		    	saida.println(resposta);
		    	
		    	
		    }
		      
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {}
	}
}


