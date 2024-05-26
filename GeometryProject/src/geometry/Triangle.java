package geometry;

public class Triangle 
{
	    private double sideA;
	    private double sideB;
	    private double sideC;

	    public Triangle(double a, double b, double c) {
		
	    	this.sideA = a;
	        this.sideB = b;
	        this.sideC = c;
		}

	    public double getArea() 
	    {
	        double s = (sideA + sideB + sideC) / 2;
			return s;
	    }

	    public double getPerimeter() 
	    {
	        return sideA + sideB + sideC;
	    }
	}