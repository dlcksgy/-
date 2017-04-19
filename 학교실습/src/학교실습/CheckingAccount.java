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
		return balance += balance*month*interest;
		
	}

	public double estimateValue(){
		return balance += balance*interest;
		
	}
	@Override
	public String toString(){
		return String.format("CheckingAccount_balance:%.2f", balance);
	}
	@Override
	public void debit(double money) throws Exception{
		if(money < 0){
			throw new Exception("음수입력");
		}
		while(true){
			if((this.balance-money) >= (-1.0)*credit_limit){
				this.balance -= money;
				break;
			}else{
				throw new Exception("debit amount exeed balance");
//				System.err.println("Debate amount exeeded credit limit");
//				break;
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
	@Override
	public void passTime(int t){
		if(balance >= 0){
			balance += balance*t*this.interest;
		}else{
			balance += balance*this.loan_interest*t;
		}
	}
	@Override
	public void passTime(){
		if(balance >= 0){
			balance += balance*this.interest;
		}else{
			balance += balance*this.loan_interest;
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
