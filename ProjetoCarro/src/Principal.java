
public class Principal {

	public static void main(String[] args) {
		Carroo car = new Carroo("corvette", "chevrolet", 4, 0 );
		
		car.ligar();
		
		while (car.getMarcha() < 5) {
			car.subirmarcha();
		}
		
		while (car.getMarcha() > 0) {
			car.descermarcha();
		}
		
		car.desligar();
		System.out.println(car.getMarca());
		System.out.println(car.getModelo());
		System.out.println(car.getPortas());
		System.out.println(car.getMarcha());
		
		

	}

}
