//Write a Java method to compute the average of three numbers.

package Second;

import java.util.Scanner;

public class index2 {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		n1=sc.nextDouble();
		
		System.out.print("Enter the second number: ");
		n2=sc.nextDouble();
		
		System.out.print("Enter the third number: ");
		n3=sc.nextDouble();
		
		System.out.println("The average value is "+ average(n1, n2, n3)+"\n");
		
	}
	
	public static double average(double n1, double n2, double n3) {
		return (n1+n2+n3)/3;
	}

}
