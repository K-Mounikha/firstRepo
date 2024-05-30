//write a program to print subjects replated to that particular branch and year by using switch case
package Assignment4;

public class Switchcase {

	public static void main(String[] args) {
	int year=2;
	String branch="mech";
	switch(year)
	{
	case 1:
		System.out.println("first year");
		System.out.println("maths,c,chemistry,physics");
		break;
	case 2:
		System.out.println("second year");
		switch(branch)
		{
		case "cse":
			System.out.println("java,os");
			break;
		case "ece":
			System.out.println("electronics,communication,BEEE");
			break;
		case "eee":
			System.out.println("electrical circuits,power electronics");
			break;
		case "mme":
			System.out.println("metallury,thermodynamics");
			break;
		case "chem":
			System.out.println("chemistry,fluid mechanics,thermodynamics");
			break;
		case "mech":
			System.out.println("kinematics,fluid mechanics,manufacturing");
			break;
		case "civil":
			System.out.println("mechanics,engineering graphics");
			break;
		default:
			System.out.println("Artificial intelligence");
		}
		break;
	case 3:
		System.out.println("Third year");
		switch(branch)
		{
		case "cse":
			System.out.println("Data strutures,DBMS,computer networks");
			break;
		case "ece":
			System.out.println("physics,circuit analysis,analog electronics");
			break;
		case "eee":
			System.out.println("electric circuits,control systems,digital signal processing");
			break;
		case "mme":
			System.out.println("extractive metallurgy,physical metallurgy");
			break;
		case "chem":
			System.out.println("chemistry,physics,biology");
			break;
		case "mech":
			System.out.println("kinematics,fluid mechanics,manufacturing");
			break;
		case "civil":
			System.out.println("building material,structural engineering,surveying");
			break;
		default:
			System.out.println("Artificial intelligence");
		}
		break;
	case 4:
		System.out.println("final year");
		switch(branch)
		{
		case "cse":
			System.out.println("machine learning,artificial intelligence ");
			break;
		case "ece":
			System.out.println("analog electronics,antenna");
			break;
		case "eee":
			System.out.println("electric power system,electric transportation");
			break;
		case "mme":
			System.out.println("corrision metallurgy,physical metallurgy");
			break;
		case "chem":
			System.out.println("mass transfer,mechanical operations");
			break;
		case "mech":
			System.out.println("solid mechanics,numerical analysis");
			break;
		case "civil":
			System.out.println("fluid mechanics,hydraulics");
			break;
		default:
			System.out.println("Artificial intelligence");
		}
		break;
		default:
			System.out.println("artificial intelligence");
		}
	}

	}

