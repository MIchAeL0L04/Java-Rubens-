
public class Caneta {

	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	private boolean tampada;
	
	
	public void status() {
		
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Esta tampada? " + this.tampada);
		System.out.println("Qual a ponta da caneta? " + this.ponta);
		System.out.println("Qual a carga da caneta? " + this.carga);
		System.out.println("Modelo da caneta: " + this.modelo);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!!");
		}
		
	}
	
	public void tampar() {
		this.tampada=true;
	}
	
	public void destampar() {
		this.tampada=false;
	}

}
