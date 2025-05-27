package rbams;
import java.util.*;

public class Maain {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Welcome to Rural Bank of Nepal");
	        System.out.print("Enter customer name: ");
	        String name = sc.nextLine();

	        Customer customer = new Customer(name);

	        SavingsAccount savings = new SavingsAccount(name, "SAV123", 1000);
	        CurrentAccount current = new CurrentAccount(name, "CUR123", 5000);

	        customer.addAccount(savings);
	        customer.addAccount(current);

	        int choice;
	        do {
	            System.out.println("\nChoose operation:");
	            System.out.println("1. Deposit\n2. Withdraw\n3. Add Interest\n4. View Accounts\n5. Exit");
	            choice = sc.nextInt();

	            if (choice == 1 || choice == 2) {
	                System.out.print("Select account (1: Savings, 2: Current): ");
	                int accChoice = sc.nextInt();
	                System.out.print("Enter amount: ");
	                double amt = sc.nextDouble();

	                try {
	                    BankAccountt acc = (accChoice == 1) ? savings : current;
	                    if (choice == 1) acc.deposit(amt);
	                    else acc.withdraw(amt);
	                } catch (InsufficientBalanceException e) {
	                    System.out.println("Withdrawal failed: " + e.getMessage());
	                }
	            } else if (choice == 3) {
	                savings.addInterest();
	            } else if (choice == 4) {
	                customer.showAllAccounts();
	            }
	        } while (choice != 5);

	        System.out.println("Thank you for using RBAMS!");
	        sc.close();
	    }
	}



