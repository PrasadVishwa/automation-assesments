package pack3;

public class ParentClass 
{
	int a = 50;

	public void method1() 
	{

		System.out.println("PatrentClass-method1-non-ststic");

	}

	public static void main(String[] args) 
	{
		//Object creation
		
		ParentClass x = new ParentClass();
		
		System.out.println(x.a);
		x.method1();

	}

}
