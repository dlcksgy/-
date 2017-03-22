package 학교실습;
import java.util.Scanner;

public class Account {
	private String name;
	private double money;
	
	public Account(String name){
		this.name = name;
	}
	public void setMoney(double money){
		this.money = money;
	}
	public void credit(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of money for " + name + ": $");
		double money = input.nextDouble();
		this.money += money;
	}
	
	public void debit(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount of money for " + name + ": $");
		double money = input.nextDouble();

		while(true){
			System.out.println("subtracing " + money + " from" + name + "balance");
			if(this.money > money){
				this.money -= money;
				return;
			}else{
				System.out.println("Debate amount exeeded account balance");
				return;
			}
		}
		
	}
	
	public void balance(){
		System.out.println(name+"'s balance: $" + money);
	}
}
