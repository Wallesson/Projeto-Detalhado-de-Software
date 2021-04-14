import java.util.ArrayList;

public class ExemploDeUsoExerc {

	public static void main(String[] args) {
		ArrayList<OvoDragao> ovosDeDragao = new ArrayList<OvoDragao>();
		MaeDragao maeDragao = new MaeDragao();
		for(int i = 0;i<100; i++) {
			OvoDragao ovoDragao = new OvoDragao();
			ovoDragao.adicionaObserver(maeDragao);
			ovosDeDragao.add(ovoDragao);
		}
		
		int contadorOvos = 1;
		for(OvoDragao ovoDragao:ovosDeDragao) {
			ovoDragao.ovoColetado();
			System.out.println("Ovo coletado: "+contadorOvos);
			contadorOvos++;
		}

	}

}
