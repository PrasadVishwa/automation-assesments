package pack3;

public class ChildClass extends ParentClass
{
	int b = 60;

	public void method2() 
	{
System.out.println("ChildClass-method2-non-ststic");
	}
	
	public static void main(String[] args) 
	{
	
		ChildClass c =new ChildClass();
		
		//child
		System.out.println(c.b);
		c.method2();
		
		//parent
		System.out.println(c.a);
		c.method1();
		
		
	}
	
	
	
	
	
	

}
