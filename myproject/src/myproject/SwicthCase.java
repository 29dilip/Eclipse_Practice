package myproject;
import java.util.*;

public class SwicthCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter any Day Number: ");
		int Day = scanner.nextInt();
		
		switch(Day) {
		
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Not a Valid Day");
		break;
		
		}
	}

}
