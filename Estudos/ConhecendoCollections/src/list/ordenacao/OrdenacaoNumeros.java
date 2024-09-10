package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	public List<Integer> inteirosList;
	
	
	
	@Override
	public String toString() {
		return "OrdenacaoNumeros InteirosList: " + inteirosList;
	}

	public OrdenacaoNumeros() {
		this.inteirosList = new ArrayList<Integer>();
	}

	public void adicionarNumero(int numero) {
		inteirosList.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> ordenacaoAscendente = new ArrayList<>(inteirosList);
		Collections.sort(ordenacaoAscendente);
		return ordenacaoAscendente;
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> ordenacaoDescendente = new ArrayList<>(inteirosList);
		Collections.sort(ordenacaoDescendente, Collections.reverseOrder());
		return ordenacaoDescendente;
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		
		ordenacaoNumeros.adicionarNumero(10);
		ordenacaoNumeros.adicionarNumero(4);
		ordenacaoNumeros.adicionarNumero(14);
		ordenacaoNumeros.adicionarNumero(30);
		
		System.out.println(ordenacaoNumeros.ordenarAscendente());
		System.out.println(ordenacaoNumeros.ordenarDescendente());
	}
}
