package ehPackage;

public class ChildClass extends ParentClass
{
	public void method3()
	{
		System.out.println("ChildClass-Method3");
	}
	
	public void method4()
	{
		System.out.println("ChildClass-method4");
	}
	public static void main(String[] args) 
	{
//		//1. normal object calling
//		//ParentClass
//		
//		ParentClass x = new ChildClass();
//		x.method1();
//		x.method2();
//		
//		//ChildClass
//		ChildClass y = new ChildClass();
//		y.method3();
//		y.method4();
//		
//		//2. Inheritance
//		
//		ChildClass z = new ChildClass();
//		//Parent
//		z.method1();
//		z.method2();
//		//Child
//		z.method3();
//		z.method4();
		
		
		//Upcasting
		ParentClass r = new ChildClass();
		r.method1();
		r.method2();

		//1.--> Upcasting--> First inheritance then only upcasting
		//2.--> Upcasting--> only those methods will be upcasted which are inherited
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
