package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		//Outra opção
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		//Set<LocalDate> dateSet = eventosMap.keySet();
		//Collection<Evento> values = eventosMap.values();
		//eventosMap.get();
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(var entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
			}
		}
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.adicionarEvento(LocalDate.of(2001, 9, 5), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2002, 9, 5), "Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2003, 9, 5), "Evento 3", "Atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 5), "Evento 4", "Atracao 4");

		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
}
