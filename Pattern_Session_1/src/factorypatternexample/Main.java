package factorypatternexample;

public class Main {

	   public static void main(String[] args) {
	 
	      Shape rectangle = ShapeFactory.createShape("Rectangle");
	      Shape triangle = ShapeFactory.createShape("Triangle");
	      Shape square = ShapeFactory.createShape("Square");
	      
	      rectangle.draw();
	      triangle.draw();
	      square.draw();
	   }
}
