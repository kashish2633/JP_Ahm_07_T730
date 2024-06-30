/*  *lambda expression is treated as a function (@functionalinterface)
*Lambda expression provides implementation of functional interface
*Less coding
*Java 8 feature

*Syntax: () -> {   }  
		* Argument-list ()
	* Arrow-token ->
	* body {}
*/
//Lambda without parameter

package LambdaExp;

public class LambdaExp {
	@FunctionalInterface
	interface IStatement {
	    String show();
	}

	public class Main {
	    public static void main(String[] args) {
	        IStatement s = () -> { return "Hello World"; };
	        System.out.println(s.show());
	    }
	}
}