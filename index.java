package Second;

import java.util.Scanner;

public class index1 {

	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1=sc.nextDouble();
		
		System.out.println("Enter second number: ");
		num2=sc.nextDouble();
		
		System.out.println("Enter third number: ");
		num3=sc.nextDouble();
				
		System.out.println("The smallest number is "+ smallest(num1, num2, num3)+"\n");
	}
	
	public static double smallest(double num1, double num2, double num3) {
		return Math.min(Math.min(num1, num2),num3);
	}

}
