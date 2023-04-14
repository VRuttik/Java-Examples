/*
⚫ Write a program to create a class Employee having data members as Name and Basic Salary. Accept and display data for one object. 
*/

class Employee{
    
    String name;
    double basic_salary;

void getdata(String s, double d){
    
    name = s;
    basic_salary = d;
}

void putdata(){
    
System.out.println("Name:- "+name);    
System.out.println("Basic Salary:- "+basic_salary);

}

public static void main(String args[]){
    
    Employee e = new Employee();
    
    e.getdata("Vruttik Moragha", 25000);
    e.putdata();
  }
}
