package dispositivo.telainicial;

public class TelaInicial {
	public static void main(String[] args) {
		Telefone telefone1 = new Telefone();
		
		telefone1.ligar("40028922");
		telefone1.iniciarCorreioVoz();
		System.out.println("=======================");
		telefone1.ligar("40028922");
		telefone1.atender();
		
		System.out.println("=======================");
		telefone1.exibirPagina("Facebook");
		telefone1.adicionarNovaAba();
		telefone1.atualizarPagina();
		
		System.out.println("=======================");
		telefone1.selecionarMusica("Burguesinha");
		telefone1.pausar();
		telefone1.tocar();
	}
}
