package project;
	public class Employee()
	{
		private String Name,Designation;
		private int Salary;
		
	
		public Employee(String n,String d,int s ) //Constructor with parameter	
		{
			Name = n;
			Designation = d;
			Salary = s;
		}
	
		publis static void main(String args[])
		{
			Employee e = new Employee("Keya","Manager",45000);			
			e.setName();
			e.setDesignation();
			e.setSalary();
	    }
	}
