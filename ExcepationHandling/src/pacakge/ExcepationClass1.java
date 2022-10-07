package pacakge;

public class ExcepationClass1 
{
	public static void main(String[] args) 
	{
		//checked exception
//		ystem.out.println();
		
		//Un-Checked Exception
		
		//ex-1
//		System.out.println(10/0);               //ArithmeticException
		
		//ex-2
		int a[] = {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		System.out.println(a[3]);                //ArithmeticException
		
		
	}

}
