package geometry;

public class Rectangle 
{
	    private double Length;
	    private double Width;

	    public Rectangle(double l, double w) 
	    {
	        this.Length = l;
	        this.Width = w;
	    }

	    public double getArea() 
	    {
	        return Length * Width;
	    }

	    public double getPerimeter() 
	    {
	        return 2 * (Length + Width);
	    }
	}