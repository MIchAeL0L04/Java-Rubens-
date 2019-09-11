import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta ();
		int s = invocarmenu();
		conta.poupado = 0;
		
		while (s!=4) {
			if (s == 1) {
				conta.criarConta();
				s = invocarmenu();
			}
			else if (s == 2) {
				conta.sacar();
				s = invocarmenu();
			}
			else if (s == 3) {
				conta.depositar();
				s = invocarmenu();
			}
		}
		
		if (s == 4) {
			System.exit(1);
		}
		
		
		
		
		
		}
		public static int invocarmenu() {
		int s =Integer.parseInt( JOptionPane.showInputDialog("1 - Criar Conta no banco \n 2 - Fazer saque \n 3 - Fazer deposito \n 4 - Sair do programa"));
		return s;
		
		
		
		
		
	}

}
