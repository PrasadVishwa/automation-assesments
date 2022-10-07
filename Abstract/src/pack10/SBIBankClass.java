package pack10;

//concrete class- > Will complete the abstract class

public class SBIBankClass extends ATMMakingCompClass
{

	public void method3()
	{
		System.out.println("Complete method-SBIClass method but originated for ATM making Class");
	}
	
	public static void main(String[] args) 
	{
		SBIBankClass x = new SBIBankClass();
		
		
		// incomplete method 
		x.method3();
		
		// Complete Method non static 
		x.method1();
		
		//Complete static method 
		ATMMakingCompClass.method2();
		
		
		
		
	}
	
	
	
	
	
	
	
}
