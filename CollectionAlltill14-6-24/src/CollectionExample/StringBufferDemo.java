package CollectionExample;
//Program to demonstrate StringBuffer Class

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{		
		 //Thread Safe
		 //String buffer is mutable
		
		StringBuffer obj = new StringBuffer("Hello");
		obj = obj.append(" World");
		
		//obj = obj.reverse();	
		
		StringBuffer obj1 = new StringBuffer("Hello");
		int val = obj.compareTo(obj1); // compares two objects
		System.out.println(val); // prints value in integer
		
		System.out.println("Count or length : " +obj.length());
		System.out.println("Character at position 3 is : " +obj.charAt(3));
		System.out.println(obj);		
	}
}