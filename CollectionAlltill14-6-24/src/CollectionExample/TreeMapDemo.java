package CollectionExample;

//Program to demonstrate TreeMap

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		 // Sorted Map - sort on keys
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		courses.put("Core Java", 25);
		courses.put("Python", 30);
		courses.put("Hibernate", 6);
		courses.put("C++", 15);
		courses.put("Springboot", 15);
		courses.put("RDBMS", 20);
		// courses.put(null,null); //RTE - null keys not allowed
		courses.put("HTML", null);

		System.out.println("Courses are : " + courses);

		 // Adding user defined objects
		TreeMap<Student, String> students = new TreeMap<Student, String>();
		students.put(new Student(101, "Harshi", 70), "TY");
		students.put(new Student(102, "Shiv", 60), "FY");
		students.put(new Student(104, "Perl", 78), "SY");
		students.put(new Student(103, "Ani", 90), "BSC");
		System.out.println(students);

		 //Sort using Comparator object with Lambda Expression 

		Comparator<Student> comp = (s2,s1) -> (int) (s1.getPer() - s2.getPer());
		
		TreeMap<Student, String> t = new TreeMap<>(comp);
		t.put(new Student(101, "Harshi", 67), "TY");
		t.put(new Student(102, "Shiv", 72), "FY");
		t.put(new Student(104, "Perl", 71), "SY");
		t.put(new Student(103, "Ani", 87), "BSC");
		System.out.println(t);
	}
}