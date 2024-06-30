package LambdaExp;

//import java.util.stream.Stream;

public class LambdaExpWithParameter 
{
	public static void main(String args[])
	{
		//using lambda expression
		Message m = (Name)->{
			System.out.println("Hello "+Name);
		};
		m.greet("Kashish");
	
		Cube c = (a)->{
			System.out.println("Ans "+c);		
		};
		System.out.println("Cube of 5 is : " + c.calculate(5));
	
		//Cube c1 = (a)-> a*a*a;
		System.out.println("Cube of 4 is : "+c1.calculate(4));
		
		/*Stream<Integer> stream = Stream.of(10,20,30,40,50,60);
		Function<Integer, Integer> sqr=(n)->n * n;
		stream.map(sqr).forEach(System.out::println);
		*/
		//IsOdd
		
		IsOdd i = (a)->a%2 != 0 ? true : false;
		System.out.println("Check if 7 odd Number : "+i.checkOdd(7));
		System.out.println("Check if 8 odd Number : "+i.checkOdd(8));

	}
}	