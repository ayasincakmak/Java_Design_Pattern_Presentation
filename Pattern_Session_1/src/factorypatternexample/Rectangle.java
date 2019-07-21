package factorypatternexample;

public class Rectangle extends Shape {
	   
	   @Override
	   public void draw() {
	      setName("Rectangle");
	      System.out.println("Drawing " + getName());
	      System.out.println();
	      System.out.println("****");
	      System.out.println("*  *");
	      System.out.println("****");
	      System.out.println();
	   }    
	}