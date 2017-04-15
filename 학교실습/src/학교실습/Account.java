package 학교실습;
import java.util.Scanner;

public abstract class Account {
	protected String name;
	protected double balance;
	public Account(){}
	
	public Account(String name){
		this.name = name;
	}

	public void credit(){
		Scanner input = new Scanner(System.in);
		
	//	return "Enter amount of money for " + name + ": $";
		double money = input.nextDouble();
		this.balance += money;
	}
	
	public void debit(double money) throws Exception{
		balance -= money;
	}
	
	public double getBalance(){
		return balance;
	}
	
	protected void setBalance(double money){
		balance = money;

	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int t);
	
	
	
	
	
	
	
}
