package UserDefined;

public class ExceptionExample 
{
	   public ExceptionExample() 
	   {
	   }

	   public static void main(String[] args) 
	   {
	      int a = 12;
	      int b = 0;

	      try 
	      {
	         int var = a / b;
	         System.out.println("will not be printed");
	      } 
	      
	      /*catch (ArithmeticException e) 
	      {
	         System.out.println(e.getMessage());
	      } */
	      
	      catch (Exception e) 
	      {
	         System.out.println("can not divide number " + e.getMessage());
	      } 
	      
	      finally 
	      {
	         System.out.println("bye... bye.....");
	      }
	   }
}