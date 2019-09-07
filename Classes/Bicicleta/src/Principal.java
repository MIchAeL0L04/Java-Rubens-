
public class Principal {

	public static void main(String[] args) {
		Ciclismo bike = new Ciclismo();
		bike.cor = "Preta";
		bike.modelo = "Canoi";
	
		
		bike.parado();
		bike.Status();
		bike.Andar();
		
		Ciclismo bike2 = new Ciclismo();
		
		bike2.cor = "Laranja";
		bike2.modelo = "Canoi";
		
		bike2.andando();
		bike2.Status();
		bike2.Andar();
		
	 
	}
	
}
	



