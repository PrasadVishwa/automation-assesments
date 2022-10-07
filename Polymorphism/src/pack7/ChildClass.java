package pack7;

public class ChildClass 
{
    public void method1()
    {
    	System.out.println("Childclass-Hello");
    }
    
    public static void main(String[] args) 
    {
	//Normal Object Creation and Method calling
    	ChildClass x = new ChildClass();
    	x.method1();
    	
    	ParentClass y = new ParentClass();
    	y.method1();
    	
    	// Overriding
    	
    	ChildClass z = new ChildClass();
    	z.method1();                                     // child class method display
    	
    	
    	
    	
	}
    
    
}
