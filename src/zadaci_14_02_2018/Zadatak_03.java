/**
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveci zajednicki prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeca dva stringa 
 * "Dobrodosli u Dubai" i "Dobrodosli u Vankuver" program treba da ispise: Najveæi zajednicki prefix za dva stringa je 
 * "Dobrodosli u". 
 */

package zadaci_14_02_2018;

import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String firstString = sc.nextLine();
		
		System.out.print("Enter second string: ");
		String secondString = sc.nextLine();

		System.out.println("\nGreates common prefix for strings you entered is : \"" + commonPrefix(firstString, secondString) + "\".");
		
		sc.close();
	}

	private static String commonPrefix(String firstString, String secondString) {
		
		String commonString = "";
		
		for (int i = 0; i < ((firstString.length() <= secondString.length() ? firstString.length() : secondString.length())); i ++) {
			
			if (firstString.charAt(i) == secondString.charAt(i)) {
				commonString = commonString + firstString.charAt(i);
			}
			else {
				break;
			}
		}
		
		return commonString;
	}
	
}
