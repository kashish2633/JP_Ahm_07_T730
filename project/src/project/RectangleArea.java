package project;
import java.util.Scanner;

public class RectangleArea {

	public double length,breadth;
	
	public double getLength() 
	{
		return length * breadth;
	}
	
	public void setLength(double length,double breadth)
	{ 
		this.length = length;
		this.breadth = breadth;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		RectangleArea a = new RectangleArea();
		System.out.println("Enter Length : ");
		sc.length = sc.nextInt();
		
		System.out.println("Enter Breadth : ");
		sc.breadth = sc.nextInt();

		a.setLength(length,breadth);		
		System.out.println("Area of rectangle is : "  + a.getLength());
	}
}