package package1;

public class ArrayDecement {

	public static void main(String[] args) 
	{
		// Array concept
		int x[] = { 10, 20, 30, 40, 50, 55 };
//		for(int i=4;i>=0;i--)
//		{
//			System.out.println(x[i]);
//		}
//
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(x[i]);
//		}
		//even and odd
		
//		for(int i=0; i<x.length; i++)
//		{
//			if(x[i]%2==0)
//			{
//				System.out.println(x[i]);
//			}
//			else
//			{
//				System.out.println("ODD no-"+x[i]);
//			}
//		
			int max =x[0];
	        
			for (int i = 1; i < x.length; i++)
			{
				if (x[i] > max)
				{
					max = x[i];
				}
				
			}
			System.out.println("max number is-" + max);
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}


