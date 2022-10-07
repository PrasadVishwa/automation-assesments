package pack3;

public class ChildClass 
{

	int b =60;
	public void method2()
	{
		
		System.out.println("ChildClass-method2-non-ststic");
		
	}
	
	public static void main(String[] args) 
	{
		//child class properties calling
		
		//Object of child class
		ChildClass c = new ChildClass();
		System.out.println(c.b);
		c.method2();
		
		//parent class properties calling
		
		//object of parent class
		ParentClass p = new ParentClass();
		System.out.println(p.a);
		p.method1();
		
	}
	
	
	
}
