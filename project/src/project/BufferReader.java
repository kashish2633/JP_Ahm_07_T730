package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class BufferReader {

	public static void main(String args[])
	{
		int Salary;
		String Name;
		
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.println("Enter Name : ");
			 
			 Name= br.readLine();
			 
			 System.out.println("Enter Salary : ");
			 
			 
			 Salary = Integer.parseInt(br.readLine());
			 
			 System.out.println(Name + " " +Salary);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}	
}