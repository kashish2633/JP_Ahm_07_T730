package Employee;

public class EmpData 
{	
	private String Name, Designation;
	private int BasicSalary;
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public String getDesignation() 
	{
		return Designation;
	}
	public void setDesignation(String designation) 
	{
		this.Designation = designation;
	}
	public int getBasicSalary() 
	{
		return BasicSalary;
	}
	public void setBasicSalary(int basicSalary) 
	{
		this.BasicSalary = basicSalary;
	}
	@Override
	public String toString() 
	{
		return "\n1]EmployeeData [ Name=" + Name  + ", Designation=" + Designation + ", Basic Salary=" + BasicSalary + "]";
	}	
}