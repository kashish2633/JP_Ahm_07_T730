package throwable;

public class Throw 
{	
		int num;
		
		int getnum() 
		{
			return num;
		}
		
		public void setnum(int n)
		{
			try {
				if(num%2==0) 
				{
					throw new Exception();
				}
				this.num = n;
			}
			catch(Exception e)
			{
				System.out.println("Number can't be even..");
			}
		}
		public static void main(String args[]) {
			Throw t = new Throw();
			t.getnum();
			t.setnum(10);			
		}
}