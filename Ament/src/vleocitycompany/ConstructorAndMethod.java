package vleocitycompany;
//Q.No--> 3
public class ConstructorAndMethod 
{
	int empID;
	String empName;
	int empSalary;
	String companyName;
	char empBand;

	public ConstructorAndMethod() 
	{
		empID = 101;
		empName = "Rahul";
		empSalary = 50000;
		companyName = "Velocity";
		empBand = 'A';
	}

	public ConstructorAndMethod(int a) 
	{
		empID = 102;
		empName = "Akshay";
		empSalary = 55000;
		companyName = "Velocity";
		empBand = 'B';
	}

	public ConstructorAndMethod(int a, int b) 
	{
		empID = 103;
		empName = "Prasad";
		empSalary = 60000;
		companyName = "Velocity";
		empBand = 'C';
	}

	public ConstructorAndMethod(int a, int b, int c) 
	{
		empID = 104;
		empName = "Umesh";
		empSalary = 65000;
		companyName = "Velocity";
		empBand = 'D';
	}

	public ConstructorAndMethod(String a, int b) 
	{
		empID = 105;
		empName = "sumit";
		empSalary = 70000;
		companyName = "Velocity";
		empBand = 'E';
	}

	public void empDataPrint() 
	{
		System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
				+ " companyName is- " + companyName + " empBand is- " + empBand);

	}

	public static void main(String[] args) 
	{

		ConstructorAndMethod X = new ConstructorAndMethod();
		X.empDataPrint();

		ConstructorAndMethod X1 = new ConstructorAndMethod(2);
		X1.empDataPrint();

		ConstructorAndMethod X2 = new ConstructorAndMethod(2, 2);
		X2.empDataPrint();

		ConstructorAndMethod X3 = new ConstructorAndMethod(2, 2, 2);
		X3.empDataPrint();

		ConstructorAndMethod X4 = new ConstructorAndMethod("Hii", 2);
		X4.empDataPrint();

	}

}
