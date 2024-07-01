package Generics;

//Driver Program for generic interface

public class GenericInterfaceDemo 
{
	public static void main(String[] args) 
	{
		Float arr[] = { 25.22f, 6.8f, 22.8f, 80.9f, 65.0f };
		MinMaxImpl<Float> m1 = new MinMaxImpl<Float>(arr);
		//retrieving Minimum and Maximum element from float array
		System.out.println("Minimum value is : " + m1.min());
		System.out.println("Maximum value is : " + m1.max());
		
	
		String arrOne[] = { "Anki", "Pooja", "Neha", "Sakshi", "Ami" };
		MinMaxImpl<String> m2 = new MinMaxImpl<String>(arrOne);
		//retrieving Minimum and Maximum element from String array
		System.out.println("Minimum value is : " + m2.min());
		System.out.println("Maximum value is : " + m2.max());
		
		Person p[]=new Person[] {new Person("Niya", "Pune"), new Person("Moni", "Mumbai"),new Person("Maisha", "Delhi")};
		MinMaxImpl<Person> m3 = new MinMaxImpl<Person>(p);
		//retrieving Minimum and Maximum element from array of person objects
		System.out.println("Minimum value is : " + m3.min());
		System.out.println("Maximum value is : " + m3.max());
	}
}
