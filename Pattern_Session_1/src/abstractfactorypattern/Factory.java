package abstractfactorypattern;

public abstract class Factory 
{
	public abstract Tire makeTire();
	
	public abstract HeadLight makeHeadLight();
	
	
	public static Factory getFactory(String factoryName)
	{
		if(factoryName.equals("audi"))
			return new AudiFactory();
		else if(factoryName.equals("mercedes"))
			return new MercedesFactory();
		else
			return null;
	}
	
}