package first;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the marks (Between 0 to 10 ): ");
		int marks = scanner.nextInt();
		
		switch(marks) {
		
		case 10:
		case 9:
		case 8:
			System.out.println("Excelllent");
			break;
		
		case 7:
			System.out.println("Very Good");
			break;
	    
		case 6:
			System.out.println("Good");
			break;
			
		case 5:
			System.out.println("Work Hard");
			break;
			
		case 4:
			System.out.println("Poor");
			break;	
			
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Very Poor");
			break;
			
		default:
			System.out.println("Invalid value entered.");
		}
		
	scanner.close();

	}

}
