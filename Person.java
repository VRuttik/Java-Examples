/*
⚫ Write a program to create a class Person having data memebrs as Name and Age. Accept and display data for one object.
*/

class Person{
    
    String name;
    int age;
    
    void getdata(String s, int a){
        
        name = s;
        age = a;
    }
    
    void putdata(){
        
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
    }
    public static void main(String args[]){
        
        Person p = new Person();
        
        p.getdata("Vruttik", 21);
        p.putdata();
    }
}
