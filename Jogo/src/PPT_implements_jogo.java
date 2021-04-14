import java.util.Random;

public class PPT_implements_jogo {

	public int Jogar(int jogador) {
		Random rd= new Random(); 
		int computador = rd.nextInt(3)+1;
		int resultado = -1;
		
		if(((jogador == 1) && (computador == 2))|| ((jogador == 2) && (computador == 3))||((jogador == 3) && (computador == 1))) {
			return 2;
		}else if(((jogador == 1) && (computador == 3))|| ((jogador == 2) && (computador == 1))||((jogador == 3) && (computador == 2))) {
			return 1;
		}
		else {
		return resultado;
		}
	}
}
