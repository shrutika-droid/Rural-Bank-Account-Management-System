package rbams;

public class SavingsAccount extends BankAccountt {
	

	    private double interestRate = 0.05;

	    public SavingsAccount(String name, String accNo, double balance) {
	        super(name, accNo, balance);
	    }

	    public void addInterest() {
	        double interest = balance * interestRate;
	        balance += interest;
	        System.out.println("Interest of " + interest + " added.");
	    }

	    @Override
	    public void withdraw(double amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance in Savings Account!");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }
	}



