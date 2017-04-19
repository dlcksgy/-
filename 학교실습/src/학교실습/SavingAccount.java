package �б��ǽ�;

import java.util.Scanner;

public class SavingAccount extends Account implements Valuable{
	private double interest;
	private double first_balance;
	private int time_pass = 0;
	
	public SavingAccount( double balance, double interest){
//		super(name);
		this.balance = balance;
		first_balance = balance;
		this.interest = interest;
	}
	@Override
	public void debit(double money)throws Exception{
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter amount of money for " + name + ": $");
//		double money = input.nextDouble();
		if(money < 0){
			throw new Exception("���� ����� �� �����ϴ�.");
		}
		if(time_pass < 12){
//	System.out.println("���� ����� �� �����ϴ�.");
			throw new Exception("���� ����� �� �����ϴ�.");
		}

//			System.out.println("Subtracting " + money + " from" + name + "balance");

		if(this.balance > money){
			this.balance -= money;
		}else{
			throw new Exception("Debit amount exeed balance");
		//	System.err.println("Debate amount exeeded account balance");
		}

		
	}
	
	public double getWithdrawableAccount(){
		if(time_pass < 12){
			System.out.println("���� ����� �� �����ϴ�");
			return 0;
		}
		return balance;
	}
	@Override
	public double estimateValue(int month){
		if((time_pass + month) > 12){
			return balance*(Math.pow(1.0+interest, 12));
		}
		return first_balance*(Math.pow(1.0+interest, time_pass + month));
	}
	@Override
	public double estimateValue(){
		if((time_pass + 1) > 12){
			return balance*(Math.pow(1.0+interest, 12));
		}
		return first_balance*(Math.pow(1.0+interest, time_pass + 1));
	}
	
	@Override
	public String toString(){
		return String.format("SavingsAccount_balance:%.2f", balance);
	}
	@Override
	public void passTime(int t){
		if((time_pass + t) > 12){
//			System.out.println("#debug1");
			balance = balance*(Math.pow(1.0+interest, 12));
			time_pass = 12;
		return;  
		}
//		System.out.println("#debug1");
		time_pass = time_pass + t;
//		balance = first_balance*(Math.pow(1.0+interest, time_pass));
	}
	public void passTime(){
		if((time_pass + 1) > 12){
//			System.out.println("#debug1");
			balance = balance*(Math.pow(1.0+interest, 12));
			time_pass = 12;
		return;  
		}
//		System.out.println("#debug1");
		time_pass = time_pass + 1;
//		balance = first_balance*(Math.pow(1.0+interest, time_pass));
	}
	
	@Override
	public double getBalance(){
		return balance;
	}
}
