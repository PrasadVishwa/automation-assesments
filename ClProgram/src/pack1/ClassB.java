package pack1;

public class ClassB 
{
	public static void main(String[] args) 
	{
		//static variable call from ClassA
		System.out.println(ClassA.b);
		
		//static method call from ClassA	
		ClassA.method2();
		
		//non-static variable call from ClassA
		ClassA x = new ClassA();
		
		System.out.println(x.a);
		
		//non-static method call from ClassA	
		x.method1();
		
		
	}

	
}
