
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mAccount = new Account("Matthews account",1000.00);
        Account myAccount = new Account("My account",0.00);
        mAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mAccount);
        System.out.println(myAccount);
    }
}
