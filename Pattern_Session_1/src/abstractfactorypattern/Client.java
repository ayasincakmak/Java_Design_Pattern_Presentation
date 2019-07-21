package abstractfactorypattern;

public class Client {
	public void doSomeClientJob()
	{
		
		
		
//		Tire tire = FactoryMaker.getFactory("audi").makeTire();
//		System.out.println(tire.getTireModel());
//		HeadLight light = FactoryMaker.getFactory("audi").makeHeadLight();
//		System.out.println(light.getHeadLightModel());
		
		Factory f1=Factory.getFactory("audi");
		 //f1.makeTire();
		//light=f1.makeHeadLight();
		
		System.out.println(f1.toString());
	}
}
