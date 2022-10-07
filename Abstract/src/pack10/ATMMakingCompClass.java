package pack10;

public abstract class ATMMakingCompClass 
{
//complete non-static method
	public void method1()
	{
		System.out.println("hello non-static complete");
	}
	
	//complete static method
	public static void method2()
	{
		System.out.println("Hello-Static-complete");
	}
	
	//incomplete non-static method
	public abstract void method3();
	
	//incomplete static method
	//public static abstract void method4();      //NOT possible
	
	public static void main(String[] args) 
	{
//		ATMMakingCompClass x = new ATMMakingCompClass();
	}
	
	
	
	
	
}
