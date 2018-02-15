/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
 * Na primjer, ako korisnik unese string Beijing Chicago, program vraca BiigCiao.
 */

package zadaci_15_02_2018;

import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter some string: ");
		
		String userInput = sc.nextLine();
		
		oddPositionCharacters(userInput);
		
		sc.close();

	}
	
	public static void oddPositionCharacters(String userInput) {
		
		System.out.print("Odd position characters in string you entered are: ");
		
		for (int i = 0; i < userInput.length(); i++) {
			
			if (i % 2 == 0) {
				System.out.print(userInput.charAt(i));
			}
		}
	}

}
