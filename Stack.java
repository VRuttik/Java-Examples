package first;
import java.util.Scanner;
class stack{
Scanner sc=new Scanner(System.in);
int size;
int arr[];
int top;
stack(int s)
{
size=s;
arr=new int[s];
top=-1;
}
public void push() {
if(top==size-1)
System.out.println("Stack is full");
else
{
System.out.println("Enter the element: ");
arr[++top]=sc.nextInt();
}
}
public void pop()
{
if(top==-1)
System.out.println("Stack is empty");
else
System.out.println("Deleted element: " +arr[top--]);
}
public void display(){
for(int i=0;i<=top;i++)
{
System.out.println(arr[i]);
}
}
}
public class Demo {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
stack s1=new stack(5);
try {
s1.push();
s1.push();
s1.push();
s1.push();
s1.push();
s1.push();
s1.display();
}
catch(Exception e) {
System.out.println("Overflow");
}

try {
s1.pop();
s1.pop();
s1.pop();
s1.pop();
s1.display();
}
catch(Exception e) {
System.out.println("Underflow");
}

}
}
