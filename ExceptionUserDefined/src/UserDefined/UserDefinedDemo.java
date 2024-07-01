package UserDefined;

public class UserDefinedDemo 
{
	public static boolean validateMark(int[] Marks) throws InvalidMarkException
	{		
		for(int value : Marks)
	    {
			if(value<0 || value>100)
			{
				throw new InvalidMarkException("Mark must be between 0 - 100");
			}
	    }		
		return true;
	}
	
	public static float calculatePercentage(int[] Marks)
	{
		int Total = 0;
		float per ;
		
		for(int result : Marks )
		{
			Total+= result;
			per = Total/Marks.length*100;
			return per;	
		}		
	}
}