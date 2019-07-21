package refactoring_with_interface.problem;

public interface Araba {

	public abstract String getMarka(String marka);
	//yeni metotlar
	public void brake (int getFrenID);
	public void openSunroof(int getSunroofID);
}
