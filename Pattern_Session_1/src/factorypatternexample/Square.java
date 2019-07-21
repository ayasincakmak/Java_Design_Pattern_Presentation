package factorypatternexample;

public class Square extends Shape {
	   
	   @Override
	   public void draw() {
	      setName("Square");
	      System.out.println("Drawing " + getName());
	      System.out.println();
	      System.out.println("****");
	      System.out.println("*  *");
	      System.out.println("*  *");
	      System.out.println("****");
	      System.out.println();
	   }    
	}