import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int s = invocarMenu();
		
	while (s != 5) {
		if (s == 1) {
			calc.Somar();
			s = invocarMenu();
		}
		else if (s == 2) {
			calc.Subtrair();
			s = invocarMenu();
		}
		else if (s == 3) {
			calc.Multiplicar();
			s = invocarMenu();
		}
		else if (s == 4) {
			calc.Dividir();
			s = invocarMenu();
		}
	}
	if (s == 5) {
		JOptionPane.showMessageDialog(null, "Obrigado por usar o programa.");
		System.exit(1);
	}
		
		
		
		

	}
	public static int invocarMenu() {
		int s = Integer.parseInt( JOptionPane.showInputDialog("1 - Somar. \n 2 - Subtrair. \n 3 - Multilicar. \n 4 - Dividir. \n 5 - Sair"));
		return s;
		
	}
}
