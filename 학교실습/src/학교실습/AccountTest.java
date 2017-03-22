package 학교실습;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		CheckingAccount a = new CheckingAccount("Account1");
		CheckingAccount b = new CheckingAccount("Account2");

		b.setBalance(100.0);
		a.setBalance(100.0);
		System.out.printf("Account1 balance: $%f\n", a.getBalance());

		System.out.printf("Account2 balance: $%f\n", b.getBalance());

		
		System.out.print("Enter deposit amount for Account1: ");
		a.credit();
		System.out.printf("Account1 balance: $%f\n", a.getBalance());

		System.out.printf("Account2 balance: $%f\n", b.getBalance());
		
		System.out.print("Enter withdrawal amount for Account2:");
		b.debit();
		System.out.printf("Account1 balance: $%f\n", a.getBalance());

		System.out.printf("Account2 balance: $%f\n", b.getBalance());
		
		System.out.println("next month!");
		a.nextMonth();
		b.nextMonth();
		System.out.printf("Account1 balance: $%f\n", a.getBalance());

		System.out.printf("Account2 balance: $%f\n", b.getBalance());

	
	}
}
