package MultiThreadDay3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		List l1 = new ArrayList();  // created empty ArrayList(allow heterogeneous elements)
		
		System.out.println("Size:"+l1.size());
		
		System.out.println("Is list empty :"+l1.isEmpty());

		l1.add(10);
		l1.add(20);
		l1.add(true);
		l1.add(false);
		l1.add(20);
		l1.add("Hello");
		l1.add(50,40);
		l1.add('A');
		 
		System.out.println("List : "+l1);   //list includes duplicate values 
		
		System.out.println("Is List conatains 15 :  "+l1.contains(20));
		l1.remove(false);
		System.out.println("List : "+l1); 
		
		System.out.println("Element at 5th position is :"+l1.get(5));     //last occurence of list
		System.out.println("Element removed : "+l1.remove(l1.indexOf(20)));   //Particular occurence 
		System.out.println("Element removed: "+l1.remove(l1.lastIndexOf(10))); //last occurence of list

		System.out.println("List : "+l1); 

		Collections.sort(l1);
		System.out.println("List : "+l1); 

		l1.clear();
	} 
}

//Generic ,iterator ,process last topic
