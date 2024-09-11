package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multiguncional.EquipamentoMF;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.copiadora.Copiadora;

public class Loja {
	public static void main(String[] args) {
		EquipamentoMF em = new EquipamentoMF();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
