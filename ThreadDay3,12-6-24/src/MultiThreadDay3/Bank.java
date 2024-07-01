package MultiThreadDay3;

public interface Bank 
{
	int MINBAL=2000; //fields are static and final
	static final int DAILY_LIMIT=22000;
	public abstract void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException; //public and abstract

}
