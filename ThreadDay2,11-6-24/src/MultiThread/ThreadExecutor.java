package MultiThread;

public class ThreadExecutor {

	public static void main(String[] args) 
	{
		Thread t = new Thread() ;
			
		System.out.println("Before runnable stage Thread is alive or not? "+ t.isAlive());//checks the thread state before starts
		t.start(); //prints the statement which is present in Thread class 
			
			try 
			{
				Thread.sleep(4000);
			}
			
			catch(Exception e) 
			{
				System.out.println("Thread is Interrupted");
			}
			
			System.out.println("After Complete execution of Thread, is alive or not? "+ t.isAlive());//checks the thread state after it ends
		}
	}
