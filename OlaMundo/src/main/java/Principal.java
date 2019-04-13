import javax.swing.JOptionPane;

public class Principal {
	static String seuNome;
	public static void main(String[] args) {
		seuNome = Solicitar();
		JOptionPane.showMessageDialog(null, "Olá " + seuNome);

	}
	
	public static String Solicitar() {
		return JOptionPane.showInputDialog("Digite seu nome: ");
	}
}
