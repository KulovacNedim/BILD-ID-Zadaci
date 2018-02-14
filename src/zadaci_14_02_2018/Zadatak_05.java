/**
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeci header: 
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */

package zadaci_14_02_2018;

import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter some string: ");
		String str = sc.nextLine();
		
		System.out.print("\nString you entered contains " + countLetters(str) + " letters.");
		
		sc.close();
	}

	private static int countLetters(String string) {
		
		int letterCounter = 0;
		
		for (int i = 0; i < string.length(); i++) {
			
			if (Character.isLetter(string.charAt(i))) {
				letterCounter++;
			}
		}
		return letterCounter;
	}

}
