import java.util.Scanner;
import java.util.Locale;

public class BancoTerminal {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Seu numero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Sua agencia: ");
		String agencia = scanner.next();
		
		System.out.println("Seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Seu saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Seu nome: "+nome);
		System.out.println("Sua agencia: "+agencia);
		System.out.println("Seu saldo: "+saldo);
		System.out.println("Seu numero: "+numero);

	}
}
