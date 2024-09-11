import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem da exceção
            System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            terminal.close();
        }
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: "+ i);
		}
	}
}