package pack10;

public class GrandChildClass extends ChildClass
{
	//not possible
//  public abstract void method5();
	

	@Override
	public void method3() 
	{
		System.out.println("method3");
	}
	
	public static void main(String[] args) 
	{
		GrandChildClass x = new GrandChildClass();
		x.method1();
		x.method2();
		x.method3();
		x.method4();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
