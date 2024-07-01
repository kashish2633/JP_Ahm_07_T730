package Exceptions;

public class Exception 
{
	public static void main(String args[])
	{
			int a,b,c;
	    	a= 12;
	    	b=0;
	    	
	    	try
	    	{
		    	c=a/b;   
		    	System.out.println("Output"+c);
	    	}	
	    	
	    	catch(Exception e)
	    	{
		    	System.out.println("error");	    	
		    	System.out.println(((e)).getMessage());
	    	}
	    	finally 
	    	{
		    	System.out.println("bye");	 	
	    	}
	}
}
