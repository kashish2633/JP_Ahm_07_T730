package MultiThread;

//To define method present in thread class 
public class DemoforMethod  
{
	public DemoforMethod()
	{
	}

	public static void main(String[] args) 
	{
			ThreadClass t1 = new ThreadClass(5,"First");
			ThreadClass t2 = new ThreadClass(2,"Second");
			
			System.out.println("Current Thread"+ Thread.currentThread());
			
			t1.start();
			t2.start();
			
			Thread.currentThread().setName("Parent Thread"); //assign the name to current thread
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);   //setting the thread priority
			System.out.println("Current Thread"+ Thread.currentThread());

			try
			{
				t1.join();   //wait current thread until the t1 is dead
				t2.join();   //wait current thread until the t2 is dead
			}
			catch(Exception e)
			{
				System.out.println("Thread is Interrupted");
			}
			System.out.println("== End of main ==");
	}

}
