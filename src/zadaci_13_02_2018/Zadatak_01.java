/**
 * Napisati metodu koja prima 2 argumenta: pocetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 * BONUS: metoda moze primati i treci argument, broj brojeva za isprintati po liniji.
 */

package zadaci_13_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Printing prime numbers in the range:\n");

		
		System.out.print("Enter integer for beginning of the range: ");

		int firstNumber = -1;

		boolean askAgainForFirstNumber = true;

		do {
			try {
				firstNumber = Integer.valueOf(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.print("Wrong input. Integer expected. Make new input: ");
				continue;
			}
			if (firstNumber <= 1) {
				System.out.println("Wrong input. Prime number is defined as integer greater than 1.");
				System.out.print("\nEnter integer for beginning of the range: ");
			} else {
				askAgainForFirstNumber = false;
			}

		} while (askAgainForFirstNumber);
		
		

		System.out.print("\nEnter integer for end of the range: ");

		int lastNumber = -1;

		boolean askAgainForLastNumber = true;

		do {
			try {
				lastNumber = Integer.valueOf(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.print("Wrong input. Integer expected. Make new input: ");
				continue;
			}
			if (lastNumber < firstNumber) {
				System.out.println(
						"Wrong input. End of range number must be greater than beginning of range number. \nMake new input for end of range: ");
			} else if (lastNumber == firstNumber) {
				System.out.println(
						"Wrong input. End of range number must be greater than beginning of range number. \nMake new input for end of range: ");
			} else if (lastNumber <= 1) {
				System.out.println("Wrong input. Prime number is defined as integer greater than 1.");
				System.out.print("\nEnter integer for end of the range: ");
			} else {
				askAgainForLastNumber = false;
			}

		} while (askAgainForLastNumber);
		
		

		boolean askAgain = true;
		do {
			System.out.print(
					"\nDo you want to specify how many prime numbers to print per line? (Enter: 'Yes' or 'No'): ");

			String printPerLine = sc.nextLine();

			if (printPerLine.equalsIgnoreCase("Yes")) {
				
				System.out.print("\nHow many prime numbers per line to print? ");


					boolean askAgainForNumberPerNumber = true;
					
					int numberPerLine = 0;
					do {
						try {
							numberPerLine = Integer.valueOf(sc.nextLine());
	
						} catch (NumberFormatException e) {
							System.out.print("Wrong input. Integer expected. Make new input: ");
							continue;
						}
						if (numberPerLine <= 0) {
							System.out.println("Wrong input. Number per line must be integer greater than zero.");
							System.out.print("\nEnter integer for number per line to print: ");
						} else {
							askAgainForNumberPerNumber = false;
						}

				} while (askAgainForNumberPerNumber);

				printPrimes(firstNumber, lastNumber, numberPerLine);

				askAgain = false;
			} else if (printPerLine.equalsIgnoreCase("No")) {
				
				printPrimes(firstNumber, lastNumber);
				
				askAgain = false;
			} else {
				
				System.out.println("\nWrong input. Enter Yes or No!");
			}

		} while (askAgain);

		sc.close();
	}

	private static void printPrimes(int firstNumber, int lastNumber) {

		System.out.println("\nPrime numbers in range " + firstNumber + " - " + lastNumber + " are:");
		
		for (int i = 0; i < listPrimes(firstNumber, lastNumber).size(); i++) {
			
			System.out.print(listPrimes(firstNumber, lastNumber).get(i) + " ");
		}

	}

	private static void printPrimes(int firstNumber, int lastNumber, int numberPerLine) {

		System.out.println("\nPrime numbers in range " + firstNumber + " - " + lastNumber + " are:");

		int counter = 0;
		
		for (int i = 0; i < listPrimes(firstNumber, lastNumber).size(); i++) {
			
			System.out.printf("%-3d ", listPrimes(firstNumber, lastNumber).get(i));

			counter++;

			if (counter % numberPerLine == 0) {
				
				System.out.println();
			}
		}

	}

	private static ArrayList<Integer> listPrimes(int firstNumber, int lastNumber) {

		ArrayList<Integer> primeNumbers = new ArrayList<>();
		boolean flag = false;

		for (int i = firstNumber; i <= lastNumber; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					flag = true;
					break;
				}
			}
			
			if (!flag) {
				
				primeNumbers.add(i);
			}
			
			flag = false;
		}

		return primeNumbers;

	}

}
