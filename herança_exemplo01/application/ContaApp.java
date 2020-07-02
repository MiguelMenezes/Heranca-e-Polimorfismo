package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ContaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING:
		Account acc1 = bacc;
		System.out.println(acc1.getHolder());

		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		System.out.println(acc2.getNumber());

		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		System.out.println(acc3.getBalance());

		// DOWNCASTING:
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		System.out.println(acc4.getBalance());

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.getBalance();
			System.out.println("Update");
		}
	}

}
