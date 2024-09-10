
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta investimento = new CarteiraCorretora(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(200);
		cc.investir(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
