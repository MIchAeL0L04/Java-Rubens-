import javax.swing.JOptionPane;

public class Calculadora {
	
	private double n1;
	private double n2;
	private double result;
	
	public Calculadora() {
		super();
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void lerNumeros() {
		this.n1 = Double.parseDouble( JOptionPane.showInputDialog("Digite o primeiro  numero: "));
		this.n2 = Double.parseDouble( JOptionPane.showInputDialog("Digite o segundo  numero: "));
	}
	
	public void Somar() {
		this.lerNumeros();
		JOptionPane.showMessageDialog(null, "A soma do valor " + this.getN1() + " e " + this.getN2()+ " é: " +(this.getN1() + this.getN2()) );
	}
	
	public void Subtrair() {
		this.lerNumeros();
		JOptionPane.showMessageDialog(null, "A subtração do valor " + this.getN1() + " e " + this.getN2()+ " é: " +(this.getN1() - this.getN2()) );
	}
	
	public void Multiplicar() {
		this.lerNumeros();
		JOptionPane.showMessageDialog(null, "A multiplicação do valor " + this.getN1() + " e " + this.getN2()+ " é: " +(this.getN1() * this.getN2()) );
	}
	
	public void Dividir() {
		this.lerNumeros();
		JOptionPane.showMessageDialog(null, "A divisão do valor " + this.getN1() + " e " + this.getN2()+ " é: " +(this.getN1() / this.getN2()) );
	}
	
	
	
	
}
