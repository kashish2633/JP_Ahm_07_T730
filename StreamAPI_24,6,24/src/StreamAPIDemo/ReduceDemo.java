package StreamAPIDemo;

//Program to demonstrate Stream API Reduce() 
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 12, -3, 4, 15, -6, 7, 8);

		 // retrieve the stream
		Stream<Integer> stream = intList.stream();

		 // Filtered Stream of Positive numbers
		stream = stream.filter((a) -> a > 0);
		stream.forEach(System.out::println);

//		stream = intList.stream().filter((a) -> a > 0);

		// stream=Stream.of();
		 // reduce to return maximum number
		Optional<Integer> result = stream.reduce((a, b) -> a > b ? a : b);

		if (result.isPresent())
			System.out.println("Maximum element is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");

		 // Filtered Stream of Positive numbers
		stream = intList.stream().filter((a) -> a > 0);

		 // reduce to sum of all positive numbers
		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) 
			System.out.println("sum of all positive elements is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");

		 // Filtered Stream of even numbers
		stream = intList.stream().filter((a) -> a % 2 == 0);

		 // reduce to sum of even numbers
		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) 
			System.out.println("sum of all even elements is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");
	}

}
/* Mine
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String args[])
	{
		List<Integer>intList = Arrays.asList(1,12,-4,15,-6,7,8);
		
		//Retrieve the stream
		
		Stream<Integer> stream = intList.stream();
		
		//Filtered stream of positive numbers
		//stream = stream.filter((a)-> a>0);
		//stream.forEach(System.out::println);
		
		stream = intList.stream().filter((a)->a>0);
		stream.forEach(System.out::println);
		//Reduce to return maximum numbers
		Optional<Integer> result = stream.reduce((a,b) -> a > b ? a:b);
		
		if(result.isPresent())
			System.out.println("Maximum number is : "+result.get());
	
		else
			System.out.println("Stream is empty for given operation");
			
		//Filtered the even numbers
		
		stream = intList.stream().filter((a)-> a % 2 == 0);
		
		//reduce to sum of even numbers
		if(result.isPresent())
		{
			result  = stream.reduce((a,b)->a + b);
			System.out.println("Sum of all even number is : "+result.get());
		}
		else
			System.out.println("String is empty for given operation");
	}		
}*/
