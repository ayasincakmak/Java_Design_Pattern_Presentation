package adapter_pattern_ex1;

public class USPowerSource {

	public void providePowerAt110V() {
		System.out.println("110 V");
	}

	public void pushSwitch() {
		System.out.println("Swith");
	}

	
	public USPowerSource () {
		System.out.println("USA adapter 110V");
	}
}
