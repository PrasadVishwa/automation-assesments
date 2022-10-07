package javaprogramspack1;

public class StaticNonstaticProgram 
{
		  String empName;
		  static String companyName = "veloComp";

		  public StaticNonstaticProgram()
		    {
		  	empName = "Mohit";
//		  	companyName = "velocity";
		    }

		  public StaticNonstaticProgram(int a)
		    {
		  	empName = "Akshay";
//		  	companyName = "velocity";
		    }

		  public void printEMpData()
		    {
		  	System.out.println(empName);
		  	System.out.println(companyName);
		    }


		  public static void main(String[] args) 
		    {
		  	//rahul
		  	StaticNonstaticProgram p1 = new StaticNonstaticProgram();
		  	p1.printEMpData();
		  	
		  	//akshay
		  	StaticNonstaticProgram p2 = new StaticNonstaticProgram(5);
		  	p2.printEMpData();
		  	
		    }

	}


