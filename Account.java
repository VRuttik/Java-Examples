
class Account {
    
    int acc_no;
    String name;
    double balance;
    
    void getdata(int a, String b, double d){
    
    acc_no = a;
    name = b;
    balance = d;
    }
    
    void putdata(){
        
        System.out.println("Account No:- "+acc_no);
        System.out.println("Name:- "+name);
        System.out.println("Balance:- "+balance);
    }
    
    public static void main(String[] args) {
        
        Account a = new Account();
        
        a.getdata(1,"Vruttik",7777777);
        a.putdata();
    }
}
