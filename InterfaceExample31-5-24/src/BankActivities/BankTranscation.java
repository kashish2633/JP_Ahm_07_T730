package BankActivities;

public class BankTranscation extends Demo
{
	
	public void deposit(Account acc,int amt)
	{
		acc.setBal(acc.getBal()+amt);
		System.out.println("Balance Updated");
	}
	public void withdraw(Account acc,int amt)
	{
		acc.setBal(acc.getBal()-amt);
		System.out.println("Balance Updated");
	}
}
