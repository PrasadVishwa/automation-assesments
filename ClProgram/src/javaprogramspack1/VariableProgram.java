package javaprogramspack1;

//class

public class VariableProgram 
{
//	int a; // Global variable
//	static int b = 50; // Global variable
//
//	static boolean m;
	
	// Constructor
	VariableProgram()
	{
		int c = 10;    // Local var.
	}
	
	//Method
	public void method1()
	{
		int d =20;       // Local var.
	}

// main method
	public static void main(String[] args) 
	{
         int x =30;          //local var.

		int i = 1000;
		System.out.println(i);

		for(i=1; i<=5; i++)
		{
			System.out.println(i);      //Local 
		}
		
		
		//Print Global Variable
		
////		System.out.println(a);
//		System.out.println(b);
//		
//		//Boolean
//		System.out.println(m);
//		
		
	}

}
