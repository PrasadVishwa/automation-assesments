package pack5;

public class ChildClass2 extends ParentClass
{
    int c = 75;
    
    public void method3()
    {
    	System.out.println("ChildClass2-method3-non-static");
    }
	
    public static void main(String[] args) 
    {
	
    	//child class perperties
    	
    	ChildClass2 x = new ChildClass2();
    	
    	System.out.println(x.c);
    	x.method3();
    	
    	//inheritance-parent class
    	
    	System.out.println(x.a);
    	x.method1();
    	
	}
    
    
    
    
}
