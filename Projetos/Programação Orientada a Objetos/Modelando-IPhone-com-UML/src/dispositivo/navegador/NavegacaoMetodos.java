package dispositivo.navegador;

public class NavegacaoMetodos implements Navegador{
	public String url;
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina "+url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		exibirPagina(url);
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		exibirPagina(url);
	}
}
