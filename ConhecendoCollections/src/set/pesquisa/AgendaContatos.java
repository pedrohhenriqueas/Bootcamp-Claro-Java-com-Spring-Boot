package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<Contato>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Pedro", 0);
		agendaContatos.adicionarContato("Pedro", 123);		
		agendaContatos.adicionarContato("Pedro Henrique", 1);
		agendaContatos.adicionarContato("Pedro Santos", 2);
		agendaContatos.adicionarContato("Maria Eduarda", 3);
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
		
		System.out.println(agendaContatos.atualizarNumeroContato("Maria Eduarda", 222));
		agendaContatos.exibirContatos();
	}
}
