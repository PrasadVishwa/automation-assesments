package pacakge;

public class ExceptionHandling3 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		            
		
		//exception
		try
		{
			System.out.println(a[2]);               //ArrayIndexOutOfBoundsException
		}
		
		catch(Exception e)
		{
			System.out.println("do not pass index value greater than 1");
		}
		
		finally
		{
			System.out.println(100+200);
			System.out.println("end of program");
			
		}
		
	
		
		
		
		
	}

}
