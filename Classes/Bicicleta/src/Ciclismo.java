
public class Ciclismo {
	
	String cor;
	String modelo;
	boolean pedalar;
	
	void Status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Eu estou andando? " + this.pedalar);
	}
	
	
	void Andar() {
		if (this.pedalar == true ) {
			System.out.println("Eu posso te levar onde você quiser");
		}else{
			System.out.println("Eu não posso te levar a lugar nenhum");
		}
	}
	
	void parado() {
		this.pedalar = false;
	}
	
	void andando() {
		this.pedalar = true;
	}
}


