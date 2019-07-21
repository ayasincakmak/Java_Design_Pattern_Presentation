package liskov_problem;

class Rectangle
{
    private int height;
    private int width;
 
    
    public Rectangle(int height, int width) {
    	this.height=height;
    	this.width=width;
    }
    
    public int CalculateArea()
    {
        return height*width;
    }

}