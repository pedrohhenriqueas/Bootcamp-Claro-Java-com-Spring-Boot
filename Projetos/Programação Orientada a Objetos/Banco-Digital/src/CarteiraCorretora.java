
public class CarteiraCorretora extends Conta{
	
	public CarteiraCorretora(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();		
	}

}
