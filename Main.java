public class Main {
    public static void main(String[] args) {
        // Create a new instance of the 'Account' class.
        Account testAccount = new Account(1122, 20000, 4.5);

        if(testAccount.withdraw(2500))
            System.err.println("Withdrawal Successful");
        else
            System.out.println("Insufficient funds");

        testAccount.deposit(3000);
        System.out.println("Id: "+testAccount.getId()+" "+"\nBalance: " 
        + testAccount.getBalance()+"\nRate "+testAccount.getAnnualInterestRate()+"\nDate: "+testAccount.getDateCreated());
    }
}
