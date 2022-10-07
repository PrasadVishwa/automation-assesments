package withGlobalVariableAndConstructor;

public class ConstProgram3 {
	// concept 2

	int empID;
	String empName;
	int empSalary;
	String companyName;
	char empBand;

	// 1st emp
	public ConstProgram3() {
		empID = 101;
		empName = "Rahul";
		empSalary = 50000;
		companyName = "Velocity";
		empBand = 'A';

	}

	public ConstProgram3(int a) {
		empID = 102;
		empName = "Akshay";
		empSalary = 55000;
		companyName = "Velocity";
		empBand = 'B';
	}

	public ConstProgram3(int empID, String empName, int empSalary, String companyName, char empBand) {
		empID = empID;
		empName = "empName";
		empSalary = empSalary;
		companyName = "companyName";
		empBand = 'C';
	}

	public ConstProgram3(String a, int b) {
		empID = 103;
		empName = "Himanshu";
		empSalary = 60000;
		companyName = "Velocity";
		empBand = 'C';
	}

	public void printEmpData() {
		System.out.println("empID is-" + empID + "empName is-" + empName + "empSalary is-" + empSalary
				+ "companyName is-" + companyName + "empBand is-" + empBand);
	}

	public static void main(String[] args) {
		// second scenario
		// first emp
		ConstProgram3 p1 = new ConstProgram3();
		p1.printEmpData();

		ConstProgram3 p2 = new ConstProgram3(30);
		p2.printEmpData();

		ConstProgram3 p3 = new ConstProgram3("Hii", 2);
		p3.printEmpData();

	}

}
