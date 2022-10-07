package pack6;

public class ChildClass extends ParentClass1 , ParentClass2
{
   int c =75;
   
   public void method3()
   {
	   System.out.println("ParentClass2-method2-non-static");
   }
   
   public static void main(String[] args) 
   {
	   ChildClass x = new ChildClass();
	   System.out.println(x.c);
	   x.method3();
	
}
   
   
   
   
   
   
   
	
}
