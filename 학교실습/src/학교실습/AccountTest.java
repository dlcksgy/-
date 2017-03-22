package 학교실습;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account a = new Account("account1");
		Account b = new Account("account2");
		System.out.print("// .. add money to the account\n// .. check the balance of the account\n");
		a.setMoney(50.0);
		a.balance();
		b.balance();
//		a.credit();
		a.debit();
		a.balance();
		b.balance();
		b.debit();
		a.balance();
		b.balance();
		
	
	}
}
