package dispositivo.aparelhoTelefonico;

public class LigacaoMetodos implements Ligacao{

	public String numero;
	public boolean atendido = false;
	public void ligar(String numero) {
		System.out.println("Tocando...");
		
	}
	
	public void atender() {
		System.out.println("Ligação atendida");
		if(atendido == false) {
			atendido = true;
		}
	}
	
	public void iniciarCorreioVoz() {
		if(atendido == false) {
			System.out.println("Correio de voz iniciado");
		}
	}

}
