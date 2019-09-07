import javax.swing.JOptionPane;

public class Carroo {
	
	private String modelo;
	private String marca;
	private int portas;
	private int marcha;
	
	public Carroo(String modelo, String marca, int portas, int marcha) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.portas = portas;
		this.marcha = marcha;
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

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	//Métodos
	
	public void ligar() {
		JOptionPane.showMessageDialog(null, "Carro Ligado");
	}
	
	public void desligar () {
		JOptionPane.showMessageDialog(null, "Carro desligado");
	}
	
	public void subirmarcha() {
		
		this.marcha = this.marcha + 1;
		System.out.println("Marcha atual:"+ this.marcha);
		
	}
	
	public void descermarcha() {
		this.marcha = this.marcha - 1;
		System.out.println("Marcha atual: " + this.marcha);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
