package pack5;

public class ChildClass1 extends ParentClass 
{
    int b =25;
    
    public void method2()
    {
    	System.out.println("method2 of ChildClass1");
    }
    
    public static void main(String[] args) 
    {
		ChildClass1 x = new ChildClass1();
		System.out.println(x.b);
    	x.method2();
    	
    	//inheritance -parent class
    	
    	System.out.println(x.a);
    	x.method1();
    	
	}
    
    
    
    
    
}
