package operacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	double valorTotal = 0;

	private List<Item> listaCompras; 
	
	public CarrinhoDeCompras(List<Item> listaCompras){
		this.listaCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<Item>();
		for(Item i : listaCompras) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				this.valorTotal -= i.getPreco();
				itensRemover.add(i);
				
			}
		}
		listaCompras.removeAll(itensRemover);
	}
	
	public void calcularValorTotal() {
		this.valorTotal = 0;
		for(Item i : listaCompras) {
			this.valorTotal += i.getPreco();
		}
		System.out.println("Valor total: " + valorTotal);
	}
	
	public void exibirItens() {
		System.out.println(listaCompras);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras listaCompras = new CarrinhoDeCompras(null);
		
		listaCompras.adicionarItem("maca", 10.00, 20);
		listaCompras.exibirItens();
		listaCompras.calcularValorTotal();
		
		listaCompras.adicionarItem("maca", 10.00, 20);
		listaCompras.adicionarItem("goiaba", 20.00, 30);
		
		listaCompras.calcularValorTotal();
		listaCompras.removerItem("maca");
		listaCompras.calcularValorTotal();
	}
}
