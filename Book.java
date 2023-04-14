class Book{
    
String title;
String Author;
double price;

void getdata(String s1, String s2, double d){
    
    title = s1;
    Author = s2;
    price = d;
    
}

void putdata(){
    
    System.out.println("Tittle:- "+title);
    System.out.println("Author:- "+Author);
    System.out.println("Price:- "+price);
}
public static void main(String args[]){
    
    Book b = new Book();
    b.getdata("Sundar Pichai", "Jagmohan Bhanvar", 160);
    b.putdata();
  }  
}
