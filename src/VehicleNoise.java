import model.Car;
import model.Minivan;

public class VehicleNoise {
	//add your vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
	
		
		Minivan toyota = new Minivan();
		System.out.println(toyota.makeNoise());
	}

}
