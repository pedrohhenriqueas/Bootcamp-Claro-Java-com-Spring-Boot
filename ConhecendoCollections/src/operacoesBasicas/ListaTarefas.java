package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> tarefaList;

	public ListaTarefas(List<Tarefa> tarefaList) {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao) ) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas(null);
		
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();
	}
}
