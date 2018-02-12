/**
 * Napisati metodu koja prima dva cijela broja kao argumente te vraca najveci zajednicki djelilac za ta dva broja.
 * 
 * PRIMJER:
 * 
 * Unesite prvi broj: 125
 * Unesite drugi broj: 2525
 * Najveci zajednièki djelilac za brojeve 125 i 2525 je 25.
 */

package zadaci_12_02_2018;

import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int firstInteger = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		int secondInteger = sc.nextInt();
		
		gcd(firstInteger, secondInteger);
		
		sc.close();

	}

	public static void gcd(int firstInteger, int secondInteger) {
		
		if (firstInteger == 0 || secondInteger == 0) {
			System.out.println("Wrong input. Both integers must be greater than zero.");
			System.exit(1);
		}
		
		int lastPossibleDevisor = firstInteger <= secondInteger ? firstInteger : secondInteger;
		
		int gcd = 0;
		
		for (int i = 1; i <= lastPossibleDevisor; i++) {
			
			if (firstInteger % i == 0 && secondInteger % i == 0) {
				
				gcd = i;
			}
		}
		
		System.out.println("Greatest common devisor for integers " + firstInteger + " and " + secondInteger + " is " + gcd + ".");
		
	}

}
