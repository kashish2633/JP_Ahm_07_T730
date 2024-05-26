
public class AreaOfRectangle {

	    private double length;
	    private double breadth;

	    
	    public void setDim(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double getArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        AreaOfRectangle r = new AreaOfRectangle();	        
	        r.setDim(5.5, 8);  	        
	        double area = r.getArea();
	        System.out.println("The area of the rectangle is: " + area);
	    }
	}