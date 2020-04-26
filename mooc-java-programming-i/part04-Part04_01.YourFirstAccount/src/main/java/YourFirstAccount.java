
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("My Account", 100.00);
        
        myAccount.deposit(20.00);
        
        System.out.println(myAccount);
    }
}
