package vleocitycompany;
//Q.No --> 1 
public class MainMethod 
{
	
	public static void additionMethod1()
	{
	int empID =101;
	String empName ="Prasad";
	int empSalary = 75000;
	String companyName ="Velocity";
	char empBand = 'A';
	
	System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
			+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void additionMethod1(int a)
	{
	int empID =102;
	String empName ="Omkar";
	int empSalary = 80000;
	String companyName ="Velocity";
	char empBand = 'B';
	
	System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
			+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void additionMethod1(int a,int b)
	{
	int empID =103;
	String empName ="Sagar";
	int empSalary = 85000;
	String companyName ="Velocity";
	char empBand = 'C';
	
	System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
			+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void additionMethod1(int a, int b, int c)
	{
	int empID =104;
	String empName ="Avinash";
	int empSalary = 90000;
	String companyName ="Velocity";
	char empBand = 'D';
	
	System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
			+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void additionMethod1(String M)
	{
	int empID =105;
	String empName ="Manisha";
	int empSalary = 95000;
	String companyName ="Velocity";
	char empBand = 'E';
	
	System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
			+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void main(String[] args) 
	{
		additionMethod1();
		additionMethod1(2);
		additionMethod1(2,21);
		additionMethod1(2,2,2);
		additionMethod1("Manisha");
			
	}
}
