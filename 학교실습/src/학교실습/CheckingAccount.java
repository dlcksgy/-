package 학교실습;

import java.util.Scanner;

public class CheckingAccount extends Account{
	
	private double credit_limit = 100.0;
	private double interest;
	private double loan_interest = 0.07;
	public CheckingAccount (String name){
		super(name);
//		this.name = name;
	}
	
	public void debit(){
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter amount of money for " + name + ": $");
		double money = input.nextDouble();

		while(true){
//			System.out.println("Subtracting " + money + " from" + name + "balance");
			if((this.balance-money) >= (-1)*credit_limit){
				this.balance -= money;
				return;
			}else{
				System.err.println("Debate amount exeeded credit limit");
			}
		}
		
	}
	public void nextMonth(){
		if(balance < 0){
			balance = balance + (balance * loan_interest);
		} else {
			balance = balance + (balance * interest);
		}
	}

}
