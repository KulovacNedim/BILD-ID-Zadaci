/**
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese pocetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmedju godina treba biti jedan space. 
 */

package zadaci_15_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstYear = 0, lastYear = 0;
		
		System.out.println("Printing all leap years in period:\n");

		System.out.print("Enter first year of period: ");
		try {
			firstYear = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input. Integer expected.");
			System.exit(0);
		}
		
		System.out.print("Enter last year of period: ");
		try {
			lastYear = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input. Integer expected.");
			System.exit(0);
		}
		
		System.out.println("In period " + firstYear + " to " + lastYear + " leap years are/was: ");
		
		printLeapYears(firstYear, lastYear);
		
		sc.close();

	}

	private static void printLeapYears(int firstYear, int lastYear) {
		
		int counter = 0;
		for (int i = firstYear; i <= lastYear; i++) {
			
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				counter++;
				System.out.print(i + (counter % 10 == 0 ? "\n" : " "));
			}
		}
		
	}

}
