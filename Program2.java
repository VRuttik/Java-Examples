/*
Define a class "Employee1" with members as id, name, salary.
Accept data for 2 objects and print it.
*/

/* --------------------------Employee1 class -----------------*/
package Second;
import java.io.*;
import java.lang.*;

public class Employee1 {
	
	String name;
	String id;
	int salary;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void get() {
		
		try {
			
			System.out.print("Enter the Name: ");
			name=br.readLine();
			
			System.out.print("Enter the Id: ");
			id=br.readLine();
			
			System.out.print("Enter the Salary: ");
			salary=Integer.parseInt(br.readLine());
			
			System.out.print("\n");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	void show() {
		System.out.println("The name is: "+ name);
		System.out.println("The id is: "+ id);
		System.out.println("The salary is: "+ salary+"\n");
	}
	
}

/* ------------------------Program2.java ------------------------- */
public class Program2 {

	public static void main(String[] args) {
		
		Employee1 e[] = new Employee1[2];
		
		for(int i=0;i<2;i++) {
			e[i] = new Employee1();
		}
		
		for(int i=0;i<2;i++) {
			e[i].get();
		}
		
		for(int i=0;i<2;i++) {
			e[i].show();
		}

	}

}
