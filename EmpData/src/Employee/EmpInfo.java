package Employee;

public class EmpInfo 
{
	private	String EName,EmailId; 
	private int Mobileno;


	public EmpInfo()
	{
		EName = "defaultName";
		EmailId = "defaultEmail";
		Mobileno = 00 ;
	}
	
	//Parameterized constructor
	
	public EmpInfo(String name, String email, int mobileNo) 
	{
		this.EName = name;
		this.EmailId = email;
		this.Mobileno = mobileNo;
	}
	
    public String getEName() 
    {
		return EName;
	}

	public void setEname(String ename) 
	{
		this.EName = ename;
	}

	public String getEmailId() 
	{
		return EmailId;
	}

	public void setEmailId(String emailId) 
	{
		this.EmailId = emailId;
	}

	public int getMobileno() 
	{
		return Mobileno;
	}

	public void setMobileno(int mobileno) 
	{
		this.Mobileno = mobileno;
	}

	@Override
	public String toString() 
	{
		return "\n2]Emp Info [Employee Name=" + EName + ", Email Id=" + EmailId  + ", Mobile no=" + Mobileno + "]";
	}
}
