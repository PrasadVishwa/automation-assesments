package javaprogramspack1;

public class ConstProgram3 
{
//2.static element
//	static int x = 10;
//	static int y = 20;
//	static int z = x + y;
	
	//3. non static element
	int p = 50;
	int q = 10;
	int r = p + q;
	
	
	public static void main(String[] args) 
	{
	//First
//		int a = 50;
//		int b = 60;
//		int c = a + b;
//		System.out.println(c);
		
	  //2. second
	
//	System.out.println(z);
//	System.out.println(ConstProgram3.z);
	
	//3.
//	System.out.println(r);   //not possible
	
	//we need to create object
	
		ConstProgram3 x1 = new ConstProgram3();
		
		System.out.println(x1.r);
	}
}
    