package first;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {
	
	String name;
	int roll_no;
	double percent;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void get() {
		
		try {
			System.out.println("Enter the name: ");
			name = br.readLine();
			System.out.println("Enter roll no: ");
			roll_no = Integer.parseInt(br.readLine());
			System.out.println("Enter percent: ");
			percent = Double.parseDouble(br.readLine());
		}
		
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
	
	void show(int m) {
	  System.out.println("Merit No: "+(m+1)+" Name: "+ name +" Roll No: "+ roll_no + "Percent: "+ percent);
	}
}
