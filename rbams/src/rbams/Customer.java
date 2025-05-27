package rbams;

import java.util.*;

public class Customer {
	
	    private String name;
	    private List<BankAccountt> accounts; // Aggregation

	    public Customer(String name) {
	        this.name = name;
	        accounts = new ArrayList<>();
	    }

	    public void addAccount(BankAccountt account) {
	        accounts.add(account);
	    }

	    public List<BankAccountt> getAccounts() {
	        return accounts;
	    }

	    public String getName() {
	        return name;
	    }

	    public void showAllAccounts() {
	        for (BankAccountt account : accounts) {
	            account.displayDetails(); // Polymorphism
	            System.out.println("-----------------------");
	        }
	    }
	}

	

