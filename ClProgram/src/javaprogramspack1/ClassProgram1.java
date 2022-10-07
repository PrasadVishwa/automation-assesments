package javaprogramspack1;

public class ClassProgram1 {
	
	int a;      //deleration
	int b;
	int c;
	
	//create constructor
	ClassProgram1()
	{
		a = 50;
		b =60;
		c = a + b;
			System.out.println(c);
	}
	
	ClassProgram1(int a)
	{
		a = 100;
		b = 200;
		c = a + b;
		System.out.println(c);
	}
	
     ClassProgram1(int a,int b)
     {
    	 a = 1000;
    	 b = 2000;
    	 c = a + b;
    	 System.out.println(c);
     }
	
	public static void main(String[] args) 
	{
		//its not good practice better use constructor
		int a =50;
		int b = 60;
		int c = a + b;
		System.out.println(c);
		
		a = 100;
		b = 200;
		c = a + b;
		System.out.println(c);
		
		 a = 1000;
    	 b = 2000;
    	 c = a + b;
    	 System.out.println(c);
		
		
		
		
		
		
	}
	
	
	
}
