
public class Carro {
	private String marca;
	private String modelo;
	private int marchaAtual;
	private int porta;
	
	
	public Carro(String marca, String modelo, int marchaAtual, int porta) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.marchaAtual = marchaAtual;
		this.porta = porta;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getMarchaAtual() {
		return marchaAtual;
	}


	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}


	public int getPorta() {
		return porta;
	}


	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	public void ligar() {
		System.out.println("O carro esta ligado");
	}
	
	public void desligar() {
		System.out.println("O carro esta desligado");
	}
	
	public void subirMarcha() {
		
		this.marchaAtual = this.marchaAtual + 1;
		
	}
	
	public void descerMarcha() {
		this.marchaAtual = this.marchaAtual -1;
	}
	
	
}
