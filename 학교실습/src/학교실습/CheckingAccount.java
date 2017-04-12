package 학교실습;

import java.util.Scanner;

public class CheckingAccount extends Account implements Valuable{
	
	private double credit_limit = 100.0;
	private double interest;
	private double loan_interest = 0.07;
//	public CheckingAccount (String name){  
//		super(name);
//		this.name = name;
//	}
	
	public CheckingAccount(double balance, double limit, double inter, double loanInterest){
		this.balance = balance;
		this.credit_limit = limit;
		this.loan_interest = loanInterest;
		interest = inter;
	}
	@Override
	public double estimateValue(int month){
		return balance;
		
	}
	@Override
	public String toString(){
		return String.format("CheckingAccount_balance:%.2f", balance);
	}
	@Override
	public void debit(double money){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter amount of money for " + name + ": $");
//		double money = input.nextDouble();

		while(true){
//			System.out.println("Subtracting " + money + " from" + name + "balance");
			if((this.balance-money) >= (-1.0)*credit_limit){
				this.balance -= money;
				break;
			}else{
				System.err.println("Debate amount exeeded credit limit");
				break;
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
	
	public double getWithdrawableAccount(){
		return credit_limit + balance;
	}
	
	public void passTime(int t){
		if(balance >= 0){
			balance += balance*t*this.interest;
		}else{
			balance += balance*this.loan_interest*t;
		}
	}
	
	public boolean isBankrupted(){
		if((-1.0) * balance < credit_limit){
			return false;
		}else{
			return true;
		}
		
	}
	
	@Override
	public double getBalance(){
		return balance;
	} 
	


}
