package pack7;      // Static method

public class ClassB 
{
   public static void method1()
   {
	   System.out.println("Static- method1");
   }
   
   public static void method1(int a)
   {
	   System.out.println("Static- method1- with argument");
	   
   }
   public void method2()           // Non-Static
   {
	   System.out.println("Non-Static - method2");
   }
   
   public void method2(int b)           // Non-Static
   {
	   System.out.println("Non-Static - method2");
   }
   public static void main(String[] args) 
   {
	ClassB.method1();
	ClassB.method1(5);
	ClassB x = new ClassB();
	x.method2();
	x.method2(1);
}
     
}
