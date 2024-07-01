package Generics;
//Driver Program for generic method

public class GenericMethodTest 
{
	public static void main(String[] args) 
	{
		GenericMethod gm = new GenericMethod();
		Integer[] intarray = { 10, 20, 30, 40 };
		String[] str = { "java", "programming", "learning" };
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		
		//Display Integer Array 
		gm.displayArrayElements(intarray);
		
		//Display String Array
		gm.displayArrayElements(str);
		
		//Display Person Array
		gm.displayArrayElements(p);
	}
}