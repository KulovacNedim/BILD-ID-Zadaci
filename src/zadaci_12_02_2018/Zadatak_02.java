/**
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) Napisati program koji pita korisnika 
 * da unese string te mu ispisuje broj samoglasnika i suglasnika u datom stringu.
 */

package zadaci_12_02_2018;

import java.util.Scanner;

public class Zadatak_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter some string: ");

		String str = sc.nextLine().toUpperCase();

		int vowelCounter = 0;
		int consonantCounter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'A' || str.charAt(i) == 'U') {
				vowelCounter++;
			} else if (Character.isLetter(str.charAt(i))){
				consonantCounter++;
			}
		}
		
		System.out.println("Number of vowels in your string: " + vowelCounter);
		System.out.println("Number of consonants in your string: " + consonantCounter);
		
		sc.close();
	}

}
