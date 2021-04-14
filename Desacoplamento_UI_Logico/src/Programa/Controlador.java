package Programa;

public class Controlador {
	RepositorioPosts repositorioPosts;
	void Acao(String titulo, String corpo){
		repositorioPosts = new RepositorioPosts();
		Post post = new Post();
		post.setTitulo(titulo);
		post.setCorpoTexto(corpo);
		
		repositorioPosts.adicionar(post); 
	}

}
