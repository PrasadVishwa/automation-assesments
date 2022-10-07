package prasad;

public class ClassProgram1 {
	
	int a;           //declaration
	int b;
	int c;
	
	//create constructor
	ClassProgram1()
	{
		a = 50;
		b = 60;	
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
	
	ClassProgram1(int a, int b)
	{
		a = 1000;
		b = 2000;	
		c = a + b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) 
	{
		//its not a good practice better use constructor
		int a =50;
		int b =60;
		int c = a +b ;
		System.out.println(c);
		
		
		int a1 =100;
		int b1 =200;
		int c1 = a1 +b1 ;
		System.out.println(c1);
		
		
		int a2 =1000;
		int b2 =2000;
		int c2 = a2 +b2 ;
		System.out.println(c2);
		
	}


}
