package pack9;

public class Imp3Class implements Iter3 
{
     //incomplete method
	@Override
	public void method1() 
	{
		System.out.println("method1");
		
	}

	
	//complete default method-need to override always
	
		public void method2()
		{
			System.out.println("method2-impclass");
		}
		
		public static void main(String[] args) 
		{
			Imp3Class x = new Imp3Class();
			x.method2();
			
		}

	
	
	 
}
