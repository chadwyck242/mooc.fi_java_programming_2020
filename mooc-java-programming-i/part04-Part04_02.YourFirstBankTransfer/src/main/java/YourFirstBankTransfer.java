
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattsAccount = new Account("Matthews account", 1000.00);

        Account myAccount = new Account("My account", 0.0);

        mattsAccount.withdrawal(100.00);

        myAccount.deposit(100.00);
        
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}
