package Employee;

public class EmpDemo 
{
			public static void main(String[] args) 
			{
				EmpPersonalInfo epi = new EmpPersonalInfo();			  
		
				epi.setEname("Reeva");
				epi.setEmailId("reev@sdfds.com");
				epi.setResaddr("Botad");
				epi.setMobileno(989899899);		
				System.out.println(epi);  
		
				//System.out.println(epr.getEname() + " " + epr.getEmailId() + " " + epr.getMobileno());	
					
				EmpInfo er = new EmpInfo();
				er.setEname("Hriday");
				er.setEmailId("hriday12@gmail.com");
				System.out.println(er); 	
		
				EmpData ed = new EmpData();
				ed.setName("Keya");
				ed.setDesignation("manager");
				ed.setBasicSalary(50000);	
				System.out.println(ed);
		}
}