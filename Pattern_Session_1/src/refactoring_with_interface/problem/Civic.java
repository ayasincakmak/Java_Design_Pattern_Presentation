package refactoring_with_interface.problem;


public class Civic implements Araba {

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return null;
	}

	@Override
	public void brake(int getFrenID) {
		if (getFrenID==1) {
			System.out.println("Fren Yap");
		}else if (getFrenID==2) {
			System.out.println("abs fren yap");
		}
		//.....
	}

	@Override
	public void openSunroof(int getSunroofID) {
		if (getSunroofID==1) {
			System.out.println("Tavan Camýný Aç");
		}else if (getSunroofID==2) {
			System.out.println("Tavan camýný açma");
		}
		
	}

}
