package rbams;



	// Abstraction: Defines abstract class with common structure
	public abstract class BankAccountt {
	    private String accountHolderName; // Encapsulation
	    private String accountNumber;
	    protected double balance; // Protected so child can access

	    public BankAccountt(String accountHolderName, String accountNumber, double balance) { // Constructor
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Abstract method to withdraw (implemented differently in subclasses)
	    public abstract void withdraw(double amount) throws InsufficientBalanceException;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    public double getBalance() { return balance; }
	    public String getAccountHolderName() { return accountHolderName; }
	    public String getAccountNumber() { return accountNumber; }

	    public void displayDetails() { // Polymorphism: overridden in child classes if needed
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}



