import javax.swing.JOptionPane;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;


	public Triangulo() {
		super();
	}

	//Getters and Setters 
	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	private boolean eTriangulo() {

		if ((this.getLado1() + this.getLado2() > this.getLado3()) && ( this.lado2 + this.getLado3() > this.lado1) && (this.lado3 + this.getLado1() > this.getLado2()) ) {
			return true;
		}else {
			return false;
		}

	}

	public String nomeTriangulo() {
		if (eTriangulo()) {
			if (this.getLado1() == this.getLado2() && this.getLado2() == this.getLado3()) {

				return "Equilátero";

			}
			else if (this.getLado1() == this.getLado2() || this.getLado3() == this.getLado1()) {

				return "Isósceles";

			}else {

				return "Escaleno";

			}

		}else {return "Erro";}
		

	}
	public void calculaPerimetro() {
		if (eTriangulo()) {
			JOptionPane.showMessageDialog(null, " O perimetro do triangulo " + nomeTriangulo() + " é: " + (this.getLado1() + this.getLado2() + this.getLado3()));
		}else {JOptionPane.showMessageDialog(null, "Erro");}
		
	}
	public void lelados() {
		this.lado1 = Double.parseDouble( JOptionPane.showInputDialog("Digite o lado 1"));
		this.lado2 = Double.parseDouble( JOptionPane.showInputDialog("Digite o lado 2"));
		this.lado3 = Double.parseDouble( JOptionPane.showInputDialog("Digite o lado 3"));
	}

}
	
	
	
