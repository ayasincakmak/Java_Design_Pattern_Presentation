package refactoring_with_interface.problem;

public class Main {

	public static void main(String arg[]) {
		Araba sahin= new Sahin();
		Araba civic= new Civic();
		
		sahin.getMarka("Sahin");
		civic.getMarka("Civic");
		sahin.brake(1);
		civic.brake(2);
		
		civic.openSunroof(1);
	}
}
