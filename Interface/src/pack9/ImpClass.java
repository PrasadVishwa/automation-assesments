package pack9;

public class ImpClass implements Inter1
{

	@Override
	public void method1() 
	{
		System.out.println("method1");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("method2");
		
	}

	public static void main(String[] args) 
	{
		ImpClass x = new ImpClass();
		x.method1();
		x.method2();
		
		
		
	}


	
	
	
	
	
}
