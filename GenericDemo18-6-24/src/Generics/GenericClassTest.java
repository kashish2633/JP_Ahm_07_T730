package Generics;
//Driver Program for user defined generic class

public class GenericClassTest 
{
	public static void main(String[] args) 
	{
		 //GenericClass with String type of data member
		GenericClass<String> st=new GenericClass<String>();
		st.set("Hello");
		System.out.println(st.get());

		 //GenericClass with Integer type of data member
		GenericClass<Integer> inte=new GenericClass<Integer>();
		inte.set(10);
		System.out.println(inte.get());
		
		 //GenericClass with Person object of data member
		GenericClass<Person> per=new GenericClass<Person>();
		per.set(new Person("Ajay","Chennai"));
		System.out.println(per.get());
	}
}