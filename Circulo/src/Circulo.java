import javax.swing.JOptionPane;

public class Circulo {
	
	private double raio;

	public Circulo() {
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public void cadastrarCirculo() {
		this.raio = Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do raio: "));
	}
	
	public void calculaDiametro() {
		if (this.raio>0) {
			JOptionPane.showMessageDialog(null, "O di�metro do circulo �: " + (this.getRaio() + this.getRaio()));

		}else {
			JOptionPane.showMessageDialog(null, "Voc� precisa cadastrar o C�rculo");

		}
	}
	
	public void calculaPerimetro() {
		if (this.raio>0) {
			JOptionPane.showMessageDialog(null, "O perimetro do circulo �: " + (2*3.1416*this.getRaio()));
		}
	}
	
	public void calculaArea() {
		if (this.raio > 0) {
			JOptionPane.showMessageDialog(null, "A area do circulo �: " + 3.1416*Math.pow(getRaio(), 2));
		}
	}
}
