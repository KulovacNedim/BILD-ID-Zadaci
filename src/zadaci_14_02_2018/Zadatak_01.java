/**
 * Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji ima godisnju interesnu stopu od 5%. Mjesecna interesna 
 * stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na racunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treceg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjesecni iznos stednje te broj mjeseci nakon kojeg bi zelio znati stanje racuna. 
 */

package zadaci_14_02_2018;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int months = 0;
		double amount = 0.00;
		
		System.out.println("In order to calculate account balance in future, you need to enter next data: \n");
		
		System.out.print("Monthly saving amount: $");
		try {
			amount = sc.nextDouble();
		}catch (InputMismatchException e) {
			System.err.print("Wrong input! Double type expected.");
			System.exit(0);
		}
		
		System.out.print("Number of months: ");
		try {
			months = sc.nextInt();
		}catch (InputMismatchException e) {
			System.err.print("Wrong input! Integer type expected.");
			System.exit(0);
		}
		
		sc.close();
		
		calculateAccountBalance(amount, months);
	}

	private static void calculateAccountBalance(double amount, int months) {
		
		double yearInterest = 0.05;
		double monthInterest = yearInterest / 12;
		double balance = 0.00;
		
		for (int i = 1; i <= months; i++) {
			balance = (amount + balance) * (1 + monthInterest);
		}
		
		System.out.printf("\nAt the end of month %1d, with year-interest of %1.0f%% and saving amount of $%4.2f, account balance will be: $%5.3f", months, (yearInterest * 100), amount, balance);
		
	}
}