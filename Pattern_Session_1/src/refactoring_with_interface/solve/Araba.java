package refactoring_with_interface.solve;
public abstract class Araba {
	public abstract String getMarka(String marka);
	
	//kompozisyon.
	private Fren fren;
	private Sunroof sunroof;
	
	
	public Sunroof getSunroof() {
		return sunroof;
	}
	public void setSunroof(Sunroof sunroof) {
		this.sunroof = sunroof;
	}
	public Fren getFren() {
		return fren;
	}
	public void setFren(Fren fren) {
		this.fren = fren;
	}

	
	public void araba_openSunRoof(){
		getSunroof().openSunRoof();
	}
	
	
	public void araba_brake() {
		getFren().brake();
	}
}
