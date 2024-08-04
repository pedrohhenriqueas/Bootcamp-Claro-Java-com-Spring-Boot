package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	public List<Integer> inteirosList;
	
	
	
	public SomaNumeros() {
		this.inteirosList = new ArrayList<Integer>();
	}

	public void adicionarNumero(int numero) {
		inteirosList.add(numero);
	}
	
	public int calcularSoma() {
		int somaTotal = 0;
		for(int i : inteirosList) {
			somaTotal += i;
		}
		return somaTotal;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = 0;
		for(int i : inteirosList) {
			if(i >= maiorNumero) {
				maiorNumero = i;
			}
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero(){
		int menorNumero = 0;
		for(int i : inteirosList) {
			if(i <= menorNumero) {
				menorNumero = i;
			}
		}
		return menorNumero;
	}
	
	public void exibirNumeros(){
		for(int i : inteirosList) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(0);
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(2);
		somaNumeros.adicionarNumero(3);
		somaNumeros.adicionarNumero(4);
		
		somaNumeros.exibirNumeros();
		System.out.println("--------");
		System.out.println(somaNumeros.encontrarMaiorNumero());
		System.out.println("--------");
		System.out.println(somaNumeros.encontrarMenorNumero());
		System.out.println("--------");
		System.out.println(somaNumeros.calcularSoma());
		
	}
}
