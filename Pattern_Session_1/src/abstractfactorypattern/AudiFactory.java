package abstractfactorypattern;
public class AudiFactory extends Factory 
{
	@Override
	public Tire makeTire() 
	{
		return new AudiTire();
	}

	@Override
	public HeadLight makeHeadLight() 
	{
		return new AudiHeadLight();
	}
	
	public String toString(){
		return makeHeadLight().getHeadLightModel() +" " +makeTire().getTireModel();
		
	}
}