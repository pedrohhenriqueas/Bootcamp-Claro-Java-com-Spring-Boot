package set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, double preco, long cod, int quantidade) {
		produtoSet.add(new Produto(nome, preco, cod, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	class ComparatorPorPreco implements Comparator<Produto>{

		@Override
		public int compare(Produto p1, Produto p2) {
			return Double.compare(p1.getPreco(), p2.getPreco());
		}

	}
	
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto("Produto 1", 50.00, 1L, 5);
		cadastroProdutos.adicionarProduto("Produto 2", 45.00, 2L, 15);
		cadastroProdutos.adicionarProduto("Produto 3", 30.00, 1L, 35);
		cadastroProdutos.adicionarProduto("Produto 4", 40.00, 4L, 25);
		
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}
}