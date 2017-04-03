package �б��ǽ�;
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
	
	public void debit(double money){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter amount of money for " + name + ": $");
//		double money = input.nextDouble();

		while(true){
//			System.out.println("Subtracting " + money + " from" + name + "balance");
			if(this.balance > money){
				this.balance -= money;
				break;
			}else{
				System.err.println("Debate amount exeeded account balance");
			}
		}

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
