package 학교실습;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner scan = new Scanner(System.in);
		double amount;
		try{
			System.out.println("Enter deposit amount for Account1: ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance:$" + account1.getBalance());
			
			
			System.out.println("Enter deposit amount for Account2: ");
			amount = scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance:$" + account1.getBalance());
			
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n" + e.toString());
		}catch(Exception e){
			System.out.println("예외발생   " + e.toString());
		
		}
		finally{
			account1.passTime(2);;
			System.out.println("2 month later account1 : " + account1.getBalance());
		}
		
		
		
		
		
		
		
		
		
		
//		Valuable[] objectList = new Valuable[4];
		
/*		objectList[0] = new CheckingAccount(100,50.0,0.01,0.07);
		objectList[1] = new SavingAccount(100,0.05);
		objectList[2] = new Human("Mark",20);
		objectList[3] = new Car("Mycar",5000);
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("6 month later Valuable: %.2f \n\n", objectItem.estimateValue(6));
		}*/
		
		
		
		
		
		
		
		
		
		
		/*
		account2.setBalance(100.0);
		account1.setBalance(100.0);
		System.out.printf("Account1 balance: $%.2f \t현재 출금 가능액1: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();  
		account1.debit(amount);
		
		System.out.printf("Account1 balance: $%.2f \t현재 출금 가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $%.2f \t현재 출금 가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $%.2f \t현재 출금 가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		
		
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f \t현재 출금 가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		

		System.out.println("6 month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재 출금 가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);

		System.out.println("next 6 month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재 출금 가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());

		System.out.println("next 1 month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f \t현재 출금 가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f \t현재 출금 가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		*/
		scan.close();
	
	}
}
