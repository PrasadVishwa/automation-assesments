package javaprogramspack1;

public class ThisKeywordProgram 
{
	int a;

	public ThisKeywordProgram(int a) 
	{
		this.a = a;
		System.out.println(a);

	}

	public static void main(String[] args) 
	{
		ThisKeywordProgram x = new ThisKeywordProgram(5);
		
	}

}
