package geometry;

public class GeometryPackageDemo 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5.0);
        System.out.println("Circle :");
        System.out.println("Area : " + c.getArea());
        System.out.println("Perimeter : " + c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle :");
        System.out.println("Area : " + r.getArea());
        System.out.println("Perimeter : " + r.getPerimeter());

        Triangle t = new Triangle(3.0, 4.0, 5.0);
        System.out.println("\nTriangle : ");
        System.out.println("Area : " + t.getArea());
        System.out.println("Perimeter : " + t.getPerimeter());
    }
}