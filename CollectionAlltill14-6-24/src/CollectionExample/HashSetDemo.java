package CollectionExample;

//Program to demonstrate HashSet Collection

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo 
{
	static void addElements(HashSet<Integer> numberHashSet) 
	{
		numberHashSet.add(10);
		numberHashSet.add(20);
		numberHashSet.add(40);
		numberHashSet.add(30);
		numberHashSet.add(50);
		numberHashSet.add(70);
		numberHashSet.add(80);
		System.out.println(numberHashSet.add(50)); //returns false - not allow to insert duplicate element
	}

	public static void main(String[] args) 
	{
		 //Unordered and unsorted set
		HashSet<Integer> numberHashSet = new HashSet<Integer>();
		addElements(numberHashSet);

		HashSet<Integer> numberHashSet1 = new HashSet<Integer>();
		numberHashSet1.add(20);
		numberHashSet1.add(40);
		numberHashSet1.add(50);
		numberHashSet1.add(80);
		numberHashSet1.add(60);
		numberHashSet1.add(90);
		numberHashSet1.add(54);

		System.out.println("Set 1 : " + numberHashSet);
		System.out.println("Set 2 : " + numberHashSet1);

		HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
		addElements(numberHashSet2);

		 // Union of two sets

		numberHashSet2.addAll(numberHashSet1);
		System.out.println("Resultant Set : " + numberHashSet2);

		numberHashSet2.clear();
		addElements(numberHashSet2);

		 // Intersection of two SETs

		numberHashSet2.retainAll(numberHashSet1);
		System.out.println("Resultant Set : " + numberHashSet2);

		numberHashSet2.clear();
		addElements(numberHashSet2);

		 // SET Difference

		numberHashSet2.removeAll(numberHashSet1);
		System.out.println("Resultant Set : " + numberHashSet2);

		 //SplitIterator 

		Spliterator<Integer> spit=numberHashSet.spliterator();
		spit.forEachRemaining(System.out::println);
	}
}