package BankActivities;

public class Account 
{
	private String Accname,Email;
	private int Bal;
	public String getAccname() 
	{
		return Accname;
	}
	public void setAccname(String Accname) 
	{
		this.Accname = Accname;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String Email) 
	{
		this.Email = Email;
	}
	public int getBal() 
	{
		return Bal;
	}
	public void setBal(int Bal) 
	{
		this.Bal = Bal;
	}
	@Override
	public String toString() 
	{
		return "Account [Account name =" + Accname +
				",\n Email =" + Email +
				",\n Balance =" + Bal + 
				",\n GetAccname()=" + getAccname()+
				",\n GetEmail()=" + getEmail() + ""+ 
				",\n GetBal()=" + getBal() + 
				",\n GetClass()=" + getClass() + 
				",\n HashCode()=" + hashCode() + 
				",\n toString()=" + super.toString() + "]";
	}
}