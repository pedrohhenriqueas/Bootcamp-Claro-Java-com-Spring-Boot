package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Pedro", 1);
		agendaContatos.adicionarContato("Pedro", 2);
		agendaContatos.adicionarContato("Pedro Henrique", 3);
		agendaContatos.adicionarContato("Pedro Santos", 4);
		agendaContatos.adicionarContato("Maria Eduarda", 5);
		agendaContatos.adicionarContato("Pedro", 222);

		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Pedro Henrique");
		agendaContatos.exibirContatos();
		
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Pedro Santos"));
		
	}
}
