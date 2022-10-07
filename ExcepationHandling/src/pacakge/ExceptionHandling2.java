package pacakge;

public class ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		int a= 20;
		int b= 0;
		
		try 
		{
			
			int c =a/b;
			System.out.println(c);          // program stop      //ArithmeticException
		}
	
		catch(Exception e)
		{
			System.out.println("can not divide the value by zero / change the value b var");
		}
		
		System.out.println("Continue the program");        //next line
		System.out.println("end of program");
		
	}

}
