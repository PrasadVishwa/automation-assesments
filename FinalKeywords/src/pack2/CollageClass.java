package pack2;

public class CollageClass extends HomeClass
{
     // not possible to inherit the class
	
	
	
	     String ChildName ="Rahul";
	     
	     public void printName()
	     {
	    	 System.out.println(ChildName);
	    	 System.out.println(super.ChildName);
	     }
	     
	     
	     public static void main(String[] args)
	     {
	    	 CollageClass c = new CollageClass();
	    	 c.printName();
		}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	
	
	
}
