package MultiThread;

//To define method present in thread class 

public class DemoforMethod {

	public static void main(String[] args) 
	{
			Thread t1 = new Thread(5,"First");
			Thread t2 = new Thread(8,"Second");  //object of ThreadClass two
			System.out.println("Current Thread: "+Thread.currentThread());// return the current thread
			
			t1.start();
			t2.start();
			
			Thread.currentThread().setName("Parent Thread"); //assign the name to current thread
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
			System.out.println("Current Thread: "+Thread.currentThread());
			
			try{
				t1.join();//wait current thread until the t1 is dead
				t2.join();//wait current thread until the t2 is dead or time period is over
			}
			
			catch(Exception e) {
				System.out.println("Thread is Interrupted");
			}
			
			System.out.println("---End of Main---");			
	}
}