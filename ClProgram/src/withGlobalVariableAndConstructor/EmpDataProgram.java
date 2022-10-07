package withGlobalVariableAndConstructor;

public class EmpDataProgram 
{

	int a = 50;      //global non static
	static int b = 60; //global static
	
	
	
	public static void empDataPrint(int empID, String empName,int empSalary,String companyName,char empBand)
	{
		System.out.println("empId is-"+empID+" EmpName is- "+empName+
		" empSalary is- "+empSalary+" companyName is- "
		           +companyName+" empBand is- "+empBand);
	}

	
	public static void main(String[] args) 
	{
		empDataPrint(101,"rahul",50000,"velocity", 'A');
		
		empDataPrint(102,"akshay",55000,"velocity", 'B');
		//*******************
		
		//non static
		EmpDataProgram  p1 = new EmpDataProgram();
		System.out.println(p1.a);
		
		//static
		System.out.println(b);

	
}
}