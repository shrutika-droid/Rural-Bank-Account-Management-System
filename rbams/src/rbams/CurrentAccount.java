package rbams;

public class CurrentAccount extends BankAccountt {
	
	    private double overdraftLimit = 5000;

	    public CurrentAccount(String name, String accNo, double balance) {
	        super(name, accNo, balance);
	    }

	    @Override
	    public void withdraw(double amount) throws InsufficientBalanceException {
	        if (amount > (balance + overdraftLimit)) {
	            throw new InsufficientBalanceException("Overdraft limit exceeded in Current Account!");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }
	}

	


