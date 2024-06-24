package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo 
{
	public static void main(String args[])
	{
		//create stream from set of values 
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60);
		
		//counting the values
		System.out.println(stream.count());
		
		//stream.foreach(System.out::println);//printing stream value -----> another 
	
		//creating array
		Integer[] values = new Integer[] {10,20,30,40,50,60};
		
		//creating the stream from array
		stream = Arrays.stream(values);
		
		//map
		System.out.println("Square of : "+Arrays.toString(values)+" is as follows: ");
		
		//1] stream.map(num -> num * num).forEach(System.out::println);
		//2]
		stream = stream.map(num->num*num);
		stream.forEach(System.out::println);
		
		//limit 
		System.out.println("First 2 elements are : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);;
		
		//Skip
		System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(4).forEach(System.out::println);;
		
		//Distinct
		System.out.println("Distinct Elements : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello","Stream","Learining");
		//words.add("Happy");//immutable list not add any values inside asList method  : No , it is fixed array so does not add any value
		
		//creates stream from list
		
		//toUpperCase
		//toLowerCase
		//Collect --->Collectors --->applicable in list and set
		
		Stream<String> stream1 = words.stream();
		System.out.println(words);
	}
}