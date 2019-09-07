import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		int s = invocarmenu();
		
		while(s != 4) {
			if (s ==1) {
				tri.lelados();
				s = invocarmenu();
			}
			else if (s == 2) {
				tri.calculaPerimetro();
				s = invocarmenu();
			}
			else if (s ==3) {
				
				if ( tri.nomeTriangulo() == "Escaleno" || tri.nomeTriangulo() == "Isósceles" || tri.nomeTriangulo() == "Equilátero") {
				JOptionPane.showMessageDialog(null, "O triangulo é: " + tri.nomeTriangulo());
				}else {
					JOptionPane.showMessageDialog(null, "Não é um triangulo");
				}
				
				s = invocarmenu();
				
			}
			
		}
		
		if (s ==4) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar o programa.");
			System.exit(1);
		}
		
		
		
		
		
	}
	public static int invocarmenu() {
		int s = Integer.parseInt( JOptionPane.showInputDialog("1 -Cadastrar Triangulo \n 1- Calcular Perimetro \n 3- Exibir o nome do Triangulo \n 4 - Sair do programa"));
		return s;
	}
}
