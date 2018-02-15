/**
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijece v, mozemo izracunati minimalnu duzinu piste potrebne da avion 
 * uzleti koristeci se sljedecom formulom: duzina = v * v / 2a. Napisati program koji pita korisnika da unese v u m/s i a u m/s2 
 * te ispisuje korisniku minimalnu duzinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje duzina piste je 514.286)
 */

package zadaci_15_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double speed = 0, acceleration = 0;
		
		System.out.print("Enter airplane speed: ");
		try {
			speed = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input. Double value expecter");
			System.exit(0);
		}
		
		System.out.print("Enter airplane acceleration: ");
		try {
			acceleration = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input. Double value expecter");
			System.exit(0);
		}
		
		double length = Math.pow(speed, 2) / (2 * acceleration);

		System.out.printf("The minimum runway length for this airplane is %4.3f", length);
		
		sc.close();

	}

}
