// Assignemnt: Implement an application using Files in Java which calculates student percentage.
Store the student record in a file with fields rollno, name, address and marks of 3 subjects.

  import java.io.*;
import java.util.Scanner;

public class Students {
    // Determine the distinction level based on the percentage
    private static String getDistinctionLevel(double percentage) {
        if (percentage >= 90) {
            return "A1";
        } else if (percentage >= 80) {
            return "A2";
        } else if (percentage >= 70) {
            return "B1";
        } else if (percentage >= 60) {
            return "B2";
        } else if (percentage >= 50) {
            return "C1";
        } else if (percentage >= 40) {
            return "C2";
        } else if (percentage >= 33) {
            return "D";
        } else {
            return "E(Failed)";
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Pccoe\\Desktop\\TYITB74\\students_records.txt");

            // Check if the file already exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Unable to create the file.");
                    return; // Exit the program if file creation fails
                }
            }

            // Create a FileWriter to write to the student record file
            FileWriter fileWriter = new FileWriter("students_records.txt"); // Append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter writer = new PrintWriter(bufferedWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int i = 1; i <= numStudents; i++) {
                System.out.println("Enter Student " + i + " details:");
                System.out.print("Roll Number: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.println("Enter 10th-grade marks (out of 500):");
                int tenthMarks = scanner.nextInt();

                System.out.println("Enter 12th-grade marks (out of 500):");
                int twelfthMarks = scanner.nextInt();

                double tenthPercentage = ((double) tenthMarks / 500) * 100;
                double twelfthPercentage = ((double) twelfthMarks / 500) * 100;

                System.out.println("Enter CGPA for each year (1st to 4th):");
                double[] cgpa = new double[4];
                for (int year = 0; year < 4; year++) {
                    System.out.print("Year " + (year + 1) + ": ");
                    cgpa[year] = scanner.nextDouble();
                }

                // Determine the distinction for 10th and 12th grades
                String tenthDistinction = getDistinctionLevel(tenthPercentage);
                String twelfthDistinction = getDistinctionLevel(twelfthPercentage);

                // Check for distinction in CGPA
                boolean distinction = true;
                for (double yearCgpa : cgpa) {
                    if (yearCgpa < 7.5) {
                        distinction = false;
                        break;
                    }
                }

                // Write the student record to the file, including distinction
                writer.println("Roll No: " + rollNo);
                writer.println("Name: " + name);
                writer.println("Address: " + address);
                writer.println("10th Percentage: " + tenthPercentage + "% (Distinction: " + tenthDistinction + ")");
                writer.println("12th Percentage: " + twelfthPercentage + "% (Distinction: " + twelfthDistinction + ")");
                for (int year = 0; year < 4; year++) {
                    writer.println("Year " + (year + 1) + " CGPA: " + cgpa[year]);
                }
                writer.println("Distinction (Overall): " + (distinction ? "Yes" : "No"));
                writer.println();

                scanner.nextLine(); // Consume the newline character
            }

            // Close the file
            writer.close();
            System.out.println("Student records have been written to students_records.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
