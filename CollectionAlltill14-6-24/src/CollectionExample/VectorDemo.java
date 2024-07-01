package CollectionExample;
//Program to demonstrate Vector Class

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args) 
	{
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		
		System.out.println("\nInitial Vector : " + animals);
		
		// Using get()
		String element = animals.get(2);
		System.out.println("\nElement at index 1 : " + element);

		// Using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.print("\nVector : ");
		while (iterate.hasNext()) 
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		
		// Using remove()
		element = animals.remove(1);
		System.out.println("\nRemoved Element : " + element);
		System.out.println("\nNew Vector : " + animals);

		// Using clear()
		animals.clear();
		System.out.println("\nVector after clear() : " + animals);
	}

}