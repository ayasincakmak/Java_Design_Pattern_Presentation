package factorypatternexample;

public class Triangle extends Shape {

	   @Override
	   public void draw() {
	      setName("Triangle");
	      System.out.println("Drawing " + getName());
	      System.out.println();
	      System.out.println("      *     ");
	      System.out.println("   *    *   ");
	      System.out.println(" *        * ");
	      System.out.println();
	   }    
	}