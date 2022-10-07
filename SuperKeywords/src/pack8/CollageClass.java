package pack8;

public class CollageClass extends HomeClass 
{
       String childName = "Rahul";
       
       public void printname()
       {
    	   System.out.println(childName);
    	   System.out.println(super.childName);
       }
       
       public static void main(String[] args) 
       {
    	   
    	   CollageClass x = new CollageClass();
    	   x.printname();
    	   
		
	}
       
       
       
       
       
       
       
       
}

