import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		int s = invocarMenu();
		
		while (s != 5) {
			if (s ==1) {
				circulo.cadastrarCirculo();
				s = invocarMenu();
			}
			else if (s == 2) {
				circulo.calculaDiametro();
				s = invocarMenu();
			}
			else if (s == 3) {
				circulo.calculaPerimetro();
				s = invocarMenu();
			}
			else if (s == 4) {
				circulo.calculaArea();
				s = invocarMenu();
			}
		}
		
		if (s == 5 ) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar o programa");
			System.exit(1);
		}
		
		
		
		
		

	}
	public static int invocarMenu() {
	 int s = Integer.parseInt(	JOptionPane.showInputDialog("1 - Cadastrar circulo. \n 2 - Calcular Diametro. \n 3 - Calcular Perimetro. \n 4 - Calcular Area. \n 5 - Sair do programa  "));
	 return s;
	}

}
