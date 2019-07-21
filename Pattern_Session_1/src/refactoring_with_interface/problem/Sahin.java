package refactoring_with_interface.problem;

public class Sahin implements Araba {

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return marka;
	}

	@Override
	public void brake(int getFrenID) {
		if (getFrenID==1 ){
			System.out.println("fren yap");
		}else if (getFrenID==2) {
			System.out.println("abs fren");
		}
	}

	@Override
	public void openSunroof(int getSunroofID) {
		//sahinde boyle ozellik ne gezer.
		
	}

}
