package pack9;

public interface Iter3 
{
	//incomplete
		void method1();
		
		//complete
		default void method2()
		{
			System.out.println("hello");
		}

}
