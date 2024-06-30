package BankActivities;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.setAccname("Saving");
		ac.setEmail("john12@gmail.com");
		ac.setBal(5000);
		System.out.println(ac);
		
		BankTranscation b = new  BankTranscation();
		
		b.deposit(ac,4000);
		System.out.println("Deposite"+ac);
		
		b.withdraw(ac,1200);
		System.out.println("Withdraw"+ac);
	} 

}
