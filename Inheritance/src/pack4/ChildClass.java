package pack4;

public class ChildClass extends ParentClass 
{
   int C = 75;
   
   public void method3()
   {
	   System.out.println("ChildClass-method3-non-staticS");
   }
   
   public static void main(String[] args) 
   {
	   ChildClass x = new ChildClass();
	  
	   System.out.println(x.C);
	   
	   x.method3();
	   
	   //parentclass properties
	   
	   System.out.println(x.b);
	
	   x.method2();
	   
	   //GrandParentClass properties
	   
	   System.out.println(x.a);
	   
	   x.method1();
	   
	   
	   
	   
	   
}
   
   
   
   
   
}
