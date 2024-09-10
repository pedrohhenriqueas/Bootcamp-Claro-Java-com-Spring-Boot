package set.ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	private long cod;
	private int quantidade;
	
	public Produto(String nome, double preco, long cod, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.cod = cod;
		this.quantidade = quantidade;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public long getCod() {
		return cod;
	}
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto Nome:" + nome + "/ Preco: " + preco + "/ Cod: " + cod + "/ Quantidade: " + quantidade
				+ "\n";
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
}
