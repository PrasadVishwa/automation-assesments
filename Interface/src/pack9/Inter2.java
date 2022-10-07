package pack9;

public interface Inter2 
{
   // 1.variables
	public static final int a = 50;
	                    int b = 60;
	                    
	 // incomplete method
	public abstract void method1();
	void method2();
	
	

	//3.non-static complete ->not possible
//	  public void method3()
//	  {
//		System.out.println();
//	  }

	//4.static method -->possible but do not use
	static void method4()
	      {
	System.out.println("method4");
	      }
	//5.main method-->possible but do not use

	  public static void main(String[] args) 
	  {
		  //6.not possible
// 		  Inter2 x = new Inter2();
		  Inter2.method4();
		  
	  }

	
	
	
	
}
