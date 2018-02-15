/**
 * Napisati program koji ucitava iznos investicije, godisnju interesnu stopu i broj godina te vraca buducu vrijednost investicije 
 * koristeci se sljedecom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godisnju interesnu stopu i 1 kao broj godina program vam vraca 
 * 1032.98 kao buducu vrijednost investicije.
 */

package zadaci_15_02_2018;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double investmentAmount = 0, annualRate = 0, futureInvestmentValue = 0;
		int numberOfYears = 0;
		
		System.out.print("Enter invest amount: ");
		try {
			investmentAmount = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input! Double value expected.");
			System.exit(0);
		}
		
		System.out.print("Enter annual interest rate in percentage: ");
		try {
			annualRate = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input! Double value expected.");
			System.exit(0);
		}
		
		System.out.print("Enter number of years: ");
		try {
			numberOfYears = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input! Integer value expected.");
			System.exit(0);
		}
		
		futureInvestmentValue = investmentAmount * Math.pow((1 + (annualRate / 1200)), numberOfYears * 12);
		
		System.out.printf("Future investment value is: %4.2f", futureInvestmentValue);
		
		sc.close();
	}

}
