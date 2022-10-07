package pack3inheritance;

public class ChildClass extends ParentClass    //inheritance  keyword- "extends"
{
	int b = 60;

	public void method2() 
	{

		System.out.println("ChildClass-method2-non-ststic");
		
	}
	
	public static void main(String[] args) 
	{
	
		ChildClass c = new ChildClass();
		
		//child
		
		System.out.println(c.b);
		c.method2();
		
		//Parent
		System.out.println(c.a);
		c.method1();
		
		
	}
	
	
	
}
