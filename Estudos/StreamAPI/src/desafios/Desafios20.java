package desafios;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafios20 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Desafio 1 - Mostre a lista na ordem numérica:
		List<Integer> numerosOrdenados = numeros.stream()
												.sorted()
												.toList();
		//numerosOrdenados.forEach(System.out::println);
		
		
		//Desafio 2 - Imprima a soma dos números pares da lista:
		int somaNumerosPares = numeros.stream()
					  			  	  .filter(n -> n%2==0)
					  			  	  .mapToInt(Integer::intValue)
					  			      .sum();
		//System.out.println(somaNumerosPares);
		
		
		//Desafio 3 - Verifique se todos os números da lista são positivos:
		boolean todosPositivos = numeros.stream()
										.allMatch(n -> n>0);
		//System.out.println(todosPositivos);
		
		
		//Desafio 4 - Remova todos os valores ímpares:
		List<Integer> imparesRemovidos = numeros.stream()
										 .filter(n -> n%2==0)
										 .toList();
		//imparesRemovidos.forEach(System.out::println);
		
		
		//Desafio 5 - Calcule a média dos números maiores que 5:
		var mediaDosMaioresQue5 = numeros.stream()
										 .filter(n -> n > 5)
										 .mapToInt(i -> i)
										 .average();
		//System.out.println(mediaDosMaioresQue5);
		
		
		//Desafio 6 - Verificar se a lista contém algum número maior que 10:
		boolean existeNumeroMaiorQue10 = numeros.stream()
												.allMatch(n -> n>10);
		//System.out.println(existeNumeroMaiorQue10);
		
		
		//Desafio 7 - Encontrar o segundo número maior da lista:
		var segundoMaior = numeros.stream()	
								  .sorted(Comparator.reverseOrder())
								  .distinct()
								  .skip(1)
								  .findFirst();
		//System.out.println(segundoMaior);
		
		
		//Desafio 8 - Somar os dígitos de todos os números da lista:
		int somaDeTodosOsDigitos = numeros.stream()	
										  .map(n -> n%10 + n/10)
										  .mapToInt(Integer::intValue)
										  .sum();
		//System.out.println(somaDeTodosOsDigitos);
		
		
		//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
		boolean todosOsNumerosSaoDistintos = numeros.size() == numeros.stream()
																	  .distinct()
																	  .count();
		//System.out.println(todosOsNumerosSaoDistintos);
		
		
		//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
		List<Integer> valoresImparesAgrupados = numeros.stream()
													   .filter(n -> n%3==0 && n%2!=0)
													   .toList();
		//valoresImparesAgrupados.forEach(System.out::println);
		
		
		//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
		int somaDosQuadrados = numeros.stream()
									  .map(n -> n*n)
									  .mapToInt(Integer::intValue)
									  .sum();
		//System.out.println(somaDosQuadrados);
		
		//Desafio 12 - Encontre o produto de todos os números da lista:
		int produtoDeTodosOsNumeros = numeros.stream()
											 .reduce(1, (x, y) -> x * y)
											 .intValue();
		//System.out.println(produtoDeTodosOsNumeros);
	
	
		//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
		List<Integer> numerosEntre5e10Filtrados = numeros.stream()	
														 .filter(n -> n>5 && n<10)
														 .toList();
		//numerosEntre5e10Filtrados.forEach(System.out::println);
		
		
		//Desafio 14 - Encontre o maior número primo da lista:
		var maiorNumeroPrimoDaLista = numeros.stream()
											 .filter(i -> BigInteger.valueOf(i).isProbablePrime(10))
											 .max(Comparator.naturalOrder());
		//System.out.println(maiorNumeroPrimoDaLista);
		
		
		//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
		boolean temPeloMenosUmNumeroNegativo = numeros.stream()
												   .allMatch(n -> n<0);
		//System.out.println(temPeloMenosUmNumeroNegativo);
		
		
		//Desafio 16 - Agrupe os números em pares e ímpares:
		List<Integer> numerosPares = numeros.stream()
											.filter(n-> n%2==0)
											.toList();
		//numerosPares.forEach(System.out::println);
		List<Integer> numerosImares = numeros.stream()
											 .filter(n-> n%2!=0)
											 .toList();
		//numerosImares.forEach(System.out::println);
		
		
		//Desafio 17 - Filtrar os números primos da lista:
		List<Integer> numerosPrimos = numeros.stream()		
											 .filter(i -> BigInteger.valueOf(i).isProbablePrime(10))
											 .toList();
		//numerosPrimos.forEach(System.out::println);
		
		
		//Desafio 18 - Verifique se todos os números da lista são iguais:
		boolean todosOsNumerosSaoIguais = numeros.stream()
												 .distinct()
												 .count() ==1;		 
		//System.out.println(todosOsNumerosSaoIguais);
		
		
		//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
		int somaDosDivisiveisPor3e5 = numeros.stream()		
											 .filter(n-> n%3==0 || n%5==0)
											 .mapToInt(Integer::intValue)
											 .sum();
		//System.out.println(somaDosDivisiveisPor3e5);
	}
}







