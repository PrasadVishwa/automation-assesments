package vleocitycompany;
//Q.no-> 4
public class OneMethodCallMulti         //one method call multipal-times
{
	int empID;
	String empName;
	int empSalary;                      //decleration of instances variable
	String companyName;
	char empBand;

	//by using instance method
	public void empData(int empID, String empName, int empSalary, String companyName, char empBand) 
	{  //Initialization of instance variables
		
		 empID = empID;
		 empName =empName;
		 empSalary =empSalary;               
		 companyName =companyName;
		 empBand =empBand;
		
		System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
				+ " companyName is- " + companyName + " empBand is- " + empBand);
	}
	
	public static void main(String[] args) 
	{
		OneMethodCallMulti x = new OneMethodCallMulti();
		x.empData(101, "Prasad", 75000, "Velocity", 'A');
		x.empData(102, "Sagar", 80000, "Velocity", 'B');
		x.empData(103, "Omkar", 85000, "Velocity", 'C');
		x.empData(104, "Shweta", 90000, "Velocity", 'D');
		x.empData(105, "Priya", 95000, "Velocity", 'E');
		x.empData(106, "Pooja", 100000, "Velocity", 'F');
		x.empData(107, "Akash", 100000, "Velocity", 'G');
		
	}
	
	
}
