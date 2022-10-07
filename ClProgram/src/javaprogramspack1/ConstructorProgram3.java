package javaprogramspack1;

public class ConstructorProgram3 
{
//	// static method
//	public static void method1() 
//	{
//		System.out.println("in method 1- static method");
//	}
//
//public static void main(String[] args) 
//{
//	//static method calling
////	method1();
//	//or
//	ConstructorProgram3.method1();


	// Non- static method
	public  void method2()
	{
		System.out.println("in method 2-non static");
	}
	public static void main(String[] args) 
	{
		// non- static method calling
	// method2();               // Not possible
	
		//we need to create the object
		
		ConstructorProgram3 x = new ConstructorProgram3();
		x.method2();
		x.method2();
		x.method2();
		x.method2();
		
		ConstructorProgram3 x1 = new ConstructorProgram3();  
		x.method2();
	}
}

