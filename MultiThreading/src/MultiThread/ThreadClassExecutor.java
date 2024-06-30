package MultiThread;

public class ThreadClassExecutor 
{
	public static void main(String[] args) 
	{
		ThreadClass t1 = new ThreadClass(12,"First");
		ThreadClass t2 = new ThreadClass(20,"Second");	
		
		t1.run();  //t1.show();   //t1.start();  
		t2.run();   //t2.show();   //t2.start();  //run present in runnable phase of thread class
	}
}