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


// main class Program4.java 

package first;

public class Program4 {

	public static void main(String[] args) {
		
		Student s[] = new Student[5];
		Student s1 = new Student();
		
		for(int i=0;i<5;i++) {
			s[i] = new Student();
		}
		
		for(int i=0;i<5;i++) {
			s[i].get();
		}
		
		double test  = s[0].percent;
		int j=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(s[i].percent < s[j].percent) {
					s1 = s[i];
					s[i] = s[j];
					s[j] = s1;
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			s[i].show(i);
		}
	}

}

