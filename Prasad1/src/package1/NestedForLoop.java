package package1;

public class NestedForLoop {

	public static void main(String[] args) {
		
//		int totalSocity = 5;
//		int TotalFlatPerSocity = 5;
//		
//		for(int i=1; i<=totalSocity; i++)
//		{
//			System.out.println("SocityNumber"+i );
//			
//			for(int j=1; j<=TotalFlatPerSocity; j++)
//			
//			{
//			System.out.println("FlatNumber"+j);	
//			}	
//		}
//		
		//star pattarn
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.print(" ");
			System.out.println();
		}
		
		
		
		
	}
}
