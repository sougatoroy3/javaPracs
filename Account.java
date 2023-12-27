import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

	//Account constructor
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        dateCreated = new Date();
    }

    //withdraw method
    public boolean withdraw(double amount){
        if(balance<amount)
            return false;
        balance-=amount;
        return true;
    }

    //deposit method
    public void deposit(double amount){
        balance+=amount;
    }
    
    //Returns the account's current balance.


    //Getter and Setter methods for id, balance, annualINterestRate, dateCreated(no setter for this)
    public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}
}
