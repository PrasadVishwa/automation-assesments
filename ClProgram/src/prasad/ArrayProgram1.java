package prasad;

public class ArrayProgram1 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		int d = 40;
//		int e = 50;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);

		// Array concept
		int x[] = { 10, 20, 30, 40, 50 };

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);

		for (int i = 0; i <= 4; i++) {
			System.out.println(x[i]); // X
		}

		for (int i = 0; i <= 4; i++) {
			System.out.println("Value at index-" + i + "is-" + x[i]);
		}

//Length of arrey

		System.out.println("Arrey lenght is-" + x.length);
		System.out.println();

		for (int i = 0; i < x.length; i++) // 0 ,1 ,2 ,3 ,4
		{
			System.out.println("Value at index-" + i + "is-" + x[i]);
		}

		System.out.println("Rahul"); // name

		int a = 10;
		System.out.println(a); // variable

// msg + variable

		System.out.println("Rahul" + a);
		System.out.println("Rahul" + a + "Hello");

//Arrey syntax-2

		int c[] = { 10, 20, 30, 40, 50 }; // values are known

//if values not defined/given

		int b[] = new int[5]; // values are unknown
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
