package MultiThread;

public class Thread extends ThreadExecutor
{
	public void run()
	{
		System.out.println("Inside run()  thread alive or not :" +this.isAlive());
		int No = 0;
		while(No < 4)			
		{
			No++;
			System.out.println("Number : "+ No);
			
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("Thread error");
			}
		}
	}
	public String isAlive() {
		return null;
	}
}