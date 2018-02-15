/**
 * Napisati metode sa sljedecim headerima: 
 * public static int reverse(int number) i public static boolean isPalindrome(int number). 
 * Prva metoda prima cijeli broj kao argument i vraca isti ispisan naopako. (npr. reverse(456) vraca 654.) 
 * Druga metoda vraca true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napisite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */

package zadaci_15_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter some integer: ");
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Wrong input. Integer expected");
			System.exit(0);
		}
		
		System.out.println("Integer you entered is" + (isPalindrome(number) ? "" : " not") + " palindrome.");
		
		sc.close();
		
	}
	
	public static boolean isPalindrome(int number) {
		
		boolean flag = false;
		
		if (number == reverse(number)) {
			flag = true;
		}
		return flag;
	}
	
	public static int reverse(int number) {
		
		int reversedNumber = 0;
		
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		
		return reversedNumber;
	}

}
