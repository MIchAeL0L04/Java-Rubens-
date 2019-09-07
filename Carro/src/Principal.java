
public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro("Chevrolet", "Michael", 4, 0);
		
		carro.Ligar();
		
		while (carro.getMarchaAtual() <5) {
			carro.subirMarcha();
		}
		
		while (carro.getMarchaAtual() >0) {
			carro.descerMarcha();
			
		}
		carro.Desligar();
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " +  carro.getModelo());
		System.out.println("Número de portas: " + carro.getNportas());
		System.out.println("Marcha atual: " + carro.getMarchaAtual());
		
	}

}
