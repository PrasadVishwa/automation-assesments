package vleocitycompany;
//Q.No--> 2
public class ConstructorAll 
{
	int empID;
	String empName;
	int empSalary;
	String companyName;
	char empBand;

	public ConstructorAll() 
	{
		empID = 101;
		empName = "Rahul";
		empSalary = 50000;
		companyName = "Velocity";
		empBand = 'A';

		System.out.println("empID is-" + empID + " empName is-" + empName + " empSalary is-" + empSalary
				+ " companyName is-" + companyName + " empBand is-" + empBand);
	}

	public ConstructorAll(int a) 
	{
		empID = 102;
		empName = "Akshay";
		empSalary = 55000;
		companyName = "Velocity";
		empBand = 'B';

		System.out.println("empID is-" + empID + " empName is-" + empName + " empSalary is-" + empSalary
				+ " companyName is-" + companyName + " empBand is-" + empBand);
	}

	public ConstructorAll(int a, int b) 
	{
		empID = 103;
		empName = "Prasad";
		empSalary = 60000;
		companyName = "Velocity";
		empBand = 'C';

		System.out.println("empID is-" + empID + " empName is-" + empName + " empSalary is-" + empSalary
				+ " companyName is-" + companyName + " empBand is-" + empBand);
	}

	public ConstructorAll(int a, int b, int c) 
	{
		empID = 104;
		empName = "Umesh";
		empSalary = 65000;
		companyName = "Velocity";
		empBand = 'D';

		System.out.println("empID is-" + empID + " empName is-" + empName + " empSalary is-" + empSalary
				+ " companyName is-" + companyName + " empBand is-" + empBand);
	}

	public ConstructorAll(String a, int b) 
	{
		empID = 105;
		empName = "sumit";
		empSalary = 70000;
		companyName = "Velocity";
		empBand = 'E';

		System.out.println("empID is-" + empID + " empName is-" + empName + " empSalary is-" + empSalary
				+ " companyName is-" + companyName + " empBand is-" + empBand);
	}

	

	public static void main(String[] args)
	{
		ConstructorAll X = new ConstructorAll();
	
		ConstructorAll X1 = new ConstructorAll(2);
		
		ConstructorAll X2 = new ConstructorAll(2, 2);
		
		ConstructorAll X3 = new ConstructorAll(2, 2, 2);
	
		ConstructorAll X4 = new ConstructorAll("Hii", 2);
		

	}
}
