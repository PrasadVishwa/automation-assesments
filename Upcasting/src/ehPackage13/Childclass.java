package ehPackage13;

public class Childclass extends ParentClass
{
  public void method3()
  {
	  System.out.println("Child-method3");
  }
  
  public void method4()
  {
	  System.out.println("Child-method4");
  }
  
  public void commanMethod()
  {
	  System.out.println("ChildClass-CommanMethod");
  }
  
  public static void main(String[] args) 
  {
	//Upcasting
	  
	  ParentClass x = new ParentClass();
	  x.method1();
	  x.method2();
//	  x.method3();
//	  x.method4();
	  
	  //common
	  x.commanMethod();
	  
	  
}
  
  
  
  
  
}
