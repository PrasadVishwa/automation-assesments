package prasad;

public class ConstructorProgram1 {
	
	int a;
	int b;
	int c;
	
//	ConstructorProgram1() //By default Constructor//can not be seen
//	{
//		
//	}
	
	//or
	
	//User Defined Constructor
	
	ConstructorProgram1()      //1.User Defined Constructor -without argument
	{
		a = 50;
		b = 60;
		c = a + b;
		System.out.println(c);
	}
	
	ConstructorProgram1(int p)      //2.User Defined Constructor -with argument
	{
		a = 150;
		b = 160;
		c = a + b;
		System.out.println(c);
	}
	
	ConstructorProgram1(int  x, int y)      //3.User Defined Constructor -with argument
	{
		a = 250;
		b = 360;
		c = a + b;
		System.out.println(c);
	}
	
	ConstructorProgram1(int x, int y,int z)      //4.User Defined Constructor -with argument
	{
		a = 450;
		b = 560;
		c = a + b;
		System.out.println(c);
	}
	
	ConstructorProgram1(String m)      //5.User Defined Constructor -with argument
	{
		a = 50;
		b = 50;
		c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		//How to create a object
		
		// ClassName refVarName = new ConstructorOfClass
		//1.
		ConstructorProgram1 p1 = new ConstructorProgram1();
		
		
		
		ConstructorProgram1 p2 = new ConstructorProgram1();
		
		//2.
		ConstructorProgram1 p3 = new ConstructorProgram1(5000000);
		
		//3. 
		
		ConstructorProgram1 p4 = new ConstructorProgram1(5, 5);
		
		//4. 
		ConstructorProgram1 p5 = new ConstructorProgram1(5, 15, 555);
		
		
		//5
		ConstructorProgram1 p6 = new ConstructorProgram1("rahul");
		
	}


}
