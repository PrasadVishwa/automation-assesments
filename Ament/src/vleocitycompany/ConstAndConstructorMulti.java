package vleocitycompany;
//Q. No--> 5
public class ConstAndConstructorMulti {
	int empID;
	String empName;
	int empSalary;
	String companyName;
	char empBand;

	ConstAndConstructorMulti(int empID, String empName, int empSalary, String companyName, char empBand) {
		empID = empID;
		empName = empName;
		empSalary = empSalary;
		companyName = companyName;
		empBand = empBand;

		System.out.println("empId is-" + empID + " EmpName is- " + empName + " empSalary is- " + empSalary
				+ " companyName is- " + companyName + " empBand is- " + empBand);

	}
	// one constructor multi-time with calling with new empDAta

	public static void main(String[] args) 
	{
		ConstAndConstructorMulti x = new ConstAndConstructorMulti(101, "Prasad", 75000, "Velocity", 'A');
		
		ConstAndConstructorMulti x1 = new ConstAndConstructorMulti(102, "Sagar", 80000, "Velocity", 'B');
				
		ConstAndConstructorMulti x2 = new ConstAndConstructorMulti(103, "Omkar", 85000, "Velocity", 'C');
				
		ConstAndConstructorMulti x3 = new ConstAndConstructorMulti(104, "Shweta", 90000, "Velocity", 'D');
				
		ConstAndConstructorMulti x4 = new ConstAndConstructorMulti(105, "Priya", 95000, "Velocity", 'E');
				
		ConstAndConstructorMulti x5 = new ConstAndConstructorMulti(106, "Pooja", 100000, "Velocity", 'F');
	
	
	
	}

}
