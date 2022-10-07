 package prasad;

public class MethodProgram3 {
	
	// non-return type method

//	public static void additionMethod() {
//		int a = 40;
//		int b = 50;
//		int c = a + b;
//		System.out.println(c);
//	}
//
//	public static void main(String[] args) 
//	{
//		additionMethod();
//	}

	// return type method
	
	public static int additionMethod1()
	{
	int a = 50;
	int b = 60;
	int z = a + b;
//	double d = 10.45;
	 return z;
	}
	//we need to return the value which will have same data type as like return type of method
	
	public static void main(String[] args) 
		{
		additionMethod1();
		System.out.println(additionMethod1());
	}

	//non-return type method calling
	
//	additionMethod();
//	System.out.println(additionMethod());
	
	//or
	
	//u can call static method with class name also
	
//	MethodPrograms3.additionMethod();
	
	
	//return type method calling
	
//	additionMethod1();
//System.out.println(additionMethod1());

//or
	
//int x = additionMethod1();	
//System.out.println(x);
	
	
//	public static char printMethod()
//	{
//	int a1 = 50;
//	int b = 60;
//	int c =a1 + b;
//	char a ='Q';
//	return a;
//
//	}
//	public static void main(String[] args) 
//	{
//	printMethod();
//	System.out.println(printMethod());
//	}

	//char method
	
	
//	System.out.println(printMethod());	
//	char z = printMethod();	
//	System.out.println(z);   
	
// Method with parenthesis/signiture body

//	public static void additionMethod2(int a)
//	{
//		System.out.println("Method with Parenthesis");
//	}
//	public static void main(String[] args)
//	{
//	additionMethod2(1);
//	System.out.println();
//	}

	// Method with parenthesis/signature body
	
//	MethodPrograms3.additionMethod2(70);
	
	
	// Method with parenthesis/signiture body double argument
//	public static void additionMethod3(int a, int b) {
//		int x = a;
//		int y = b;
//		int z = a + b;
//		System.out.println("Addition result is-" + z);
//	}
//
//	public static void main(String[] args) {
//		additionMethod3(22, 24);
//	}

	//2 argument method	
//	MethodPrograms3.additionMethod3(50, 60);
	
	
//	public static void method1(String a)
//	{
//	System.out.println(a);
//	}
//	public static void main(String[] args) 
//	{
//		
//	MethodProgram3.method1("Rahul");	
//		
//	}

}
	
	

