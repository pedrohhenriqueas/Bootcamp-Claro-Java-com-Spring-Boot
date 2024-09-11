package equipamentos.multiguncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMF implements Copiadora, Digitalizadora, Impressora{
	
	public void copiar() {
		System.out.println("Copiando MF");
	}

	public void digitalizar() {
		System.out.println("Digitalizando MF");
		
	}

	public void imprimir() {
		System.out.println("Imprimindo MF");
	}

}
