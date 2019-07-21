package factorypatternexample;

public class ShapeFactory {

	   public static Shape createShape(String shape) {
	      if (shape.equals(Rectangle.class.getSimpleName()))
	         return new Rectangle();
	      else if (shape.equals(Square.class.getSimpleName()))
	         return new Square();
	      else if (shape.equals(Triangle.class.getSimpleName()))
	         return new Triangle();
	      else
	         return null;
	   }
}
