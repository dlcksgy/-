package �б��ǽ�;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		double amount;
		Account account1 = new CheckingAccount(100,50.0,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);

		account2.setBalance(100.0);
		account1.setBalance(100.0);
		System.out.printf("Account1 balance: $%.2f \t���� ��� ���ɾ�1: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		
		System.out.printf("Account1 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){
			System.out.println("Bankrupted");
		}
		
		
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		

		System.out.println("6 month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);

		System.out.println("next 6 month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());

		System.out.println("next 1 month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f \t���� ��� ���ɾ�: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		
		scan.close();
	
	}
}
