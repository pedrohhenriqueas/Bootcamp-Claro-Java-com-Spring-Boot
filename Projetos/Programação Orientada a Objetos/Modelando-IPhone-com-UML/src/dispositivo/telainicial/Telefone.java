package dispositivo.telainicial;

import dispositivo.aparelhoTelefonico.Ligacao;
import dispositivo.navegador.Navegador;
import dispositivo.reprodutorMusical.ReprodutorMusical;

public class Telefone implements Ligacao, Navegador, ReprodutorMusical{

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
	
	
	public String url;
	public void exibirPagina(String url) {
		this.url = url;
		System.out.println("Exibindo pagina "+ url);
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		exibirPagina(url);
	}
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		exibirPagina(url);
	}
	
	
	public String musica;
	public void tocar() {
		System.out.println("Tocando musica");
	}
	public void pausar() {
		System.out.println("Pausando música");
	}
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Tocando "+ musica);
		tocar();
	}

}
