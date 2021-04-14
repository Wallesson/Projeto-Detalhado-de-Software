import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jogo Pedra, Papel e Tesoura");
		PPT_implements_jogo jogo = new PPT_implements_jogo();
		ControladorPlacar cp = new ControladorPlacar();
		Jogador jg = new Jogador();
		
		boolean repete = true;
		do {
			System.out.println("Informe sua jogada");
			System.out.println("1 - Pedra, 2 - Papel, 3 - Tesoura, 0 - Sair");
			
			int jogada = sc.nextInt();
			if(jogada == 0) {
				System.out.println("Obrigado por Jogar!!!");
				System.out.println("Voce ganhou "+jg.getVit_jogador() + " e perdeu " + jg.getDerrota_jogador());
				repete = false;
			}
			else if((jogada != 0) && (jogada != 1) && (jogada!= 2) && (jogada != 3)){
				System.out.println("Jogada Invalida!!!");
				System.out.println("Tente Novamente!!!");
			}
			else {
				int resultado = jogo.Jogar(jogada);
				switch(resultado) {
					case 1:
						System.out.println("Jogador");
						cp.setVitorias_jogador(1);
						jg.setVit_jogador(1);
						System.out.println("Jogador "+cp.getVitorias_jogador() +"X" + cp.getVitorias_computador() + "Computador");
						break;
					case 2:
						System.out.println("Computador");
						cp.setVitorias_computador(1);
						jg.setDerrota_jogador(1);
						System.out.println("Jogador "+cp.getVitorias_jogador() +"X" + cp.getVitorias_computador() + "Computador");
						break;
					case -1:
						System.out.println("Empate");
						System.out.println("Jogador "+cp.getVitorias_jogador() +"X" + cp.getVitorias_computador() + "Computador");
						break;
				}
			}
		}while(repete);
	}

}
