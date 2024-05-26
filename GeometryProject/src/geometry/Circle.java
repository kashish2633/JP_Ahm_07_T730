/*Area: 
Area = 𝜋 *r*r
Perimeter : 2𝜋*r
*/
package geometry;

public class Circle 
{	
	    private double Radius;

	    public Circle(double r) 
	    {
	        this.Radius = r;
	    }

	    public double getArea() 
	    {
	        return Math.PI * Radius * Radius;
	    }

	    public double getPerimeter() 
	    {
	        return 2 * Math.PI * Radius;
	    }
}