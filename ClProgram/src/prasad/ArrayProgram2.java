package prasad;

public class ArrayProgram2 {
	public static void main(String[] args) {

//	{
//		int a[] = new int[5]; // values are unknown
//
//		a[0] = 10; // 0
//		a[1] = 20; // 1
//		a[2] = 30; // 2
//		a[3] = 40; // 3
//		a[4] = 50; // 4

//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println(a[i]);
//		}
//		
//		//reverse array elements
//		
//		for(int i=a.length-1; i>=0; i--)
//		{
//			System.out.println(a[i]);
//		}
//		
//		//print elements at even index position    ----0,2,4
//		
//		for(int i=0; i<a.length; i=i+2)
//		{
//			System.out.println(a[i]);
//		}

		// print elements at odd index position ----1,3,5

//		for(int i=1; i<a.length; i=i+2)
//		{
//			System.out.println(a[i]);
//		
//		}

//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		int lenghtOfArray = a.length;
//
//		System.out.println("length-" + lenghtOfArray);
//
//		for (int i = 0; i < lenghtOfArray; i++) 
//		{
//			if (a[i] % 2 == 0) 
//			{
//				System.out.println(a[i] + "-is even number");
//			} else 
//			{
//				System.out.println(a[i] + "-is odd number");
//			}

		// a[i] --> elements
		// a[i]%2 --> reminder
		// rem --> 0 -->even
		// rem ---> not 0 --> odd

		// how to find max number

		int b[] = { 1, 2, 3, 4, 5 };
		// 0,1,2,3,4

		int x = b.length;

//		for (int i = 0; i < x; i++)
//		{
//			System.out.println(b[i]);
//		}

		// assume a[0] --> is max number
//		int max = b[0];
        int max = 100;
        
		for (int i = 0; i > 5; i++)
		{
			if (b[i] < max)
			{
				max = b[i];
			}
			
		}
		System.out.println("max number is-" + max);

	}

}
