import javax.swing.JOptionPane;

public class Carro {
	
	String modelo;
	String marca;
	int nportas;
	int marchaAtual;
	
	
	
	
	public Carro(String modelo, String marca, int nportas, int marchaAtual) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.nportas = nportas;
		this.marchaAtual = marchaAtual;
	}
	
	
	

	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getNportas() {
		return nportas;
	}




	public void setNportas(int nportas) {
		this.nportas = nportas;
	}




	public int getMarchaAtual() {
		return marchaAtual;
	}




	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}




	public void Ligar() {
		JOptionPane.showMessageDialog(null, "O carro esta ligado");
	}
	
	public void Desligar() {
		JOptionPane.showMessageDialog(null, "O carro esta desligado");
	}
	
	public void subirMarcha() {
		this.marchaAtual += 1;
	}
	
	public void descerMarcha() {
		this.marchaAtual -= 1;
	}
	
}
