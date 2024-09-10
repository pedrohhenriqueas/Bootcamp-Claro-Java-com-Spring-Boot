package dispositivo.reprodutorMusical;

public class ReprodutorMetodos {
	public String musica;

	public void tocar() {
		System.out.println("Tocando musica");
	}
	
	public void pausar() {
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Selecionando "+ musica);
		tocar();
	}

}
