/**
 * Nizovi niz1 i niz2 su striktno identicni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vraca true ukoliko su nizovi niz1 i niz2 striktno identicni. Koristiti sljedeci header:
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su 
 * striktno identicni.
 */

package zadaci_13_02_2018;

import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];

		System.out.println("Enter ten integers in array1: ");

		for (int i = 0; i < array1.length; i++) {

			boolean flag = true;
			
			do {

				try {
					array1[i] = Integer.valueOf(sc.nextLine());
					System.out.println("Input " + array1[i] + " saved at array-index " + i);
					flag = false;
				} catch (Exception e) {
					System.out.print("Wrong input. Integer type expected. Try to make new input for this element: ");
					flag = true;
				}
			} while (flag);
		}
		
		System.out.println("\nEnter ten integers in array2: ");

		for (int i = 0; i < array2.length; i++) {

			boolean flag = true;
			
			do {

				try {
					array2[i] = Integer.valueOf(sc.nextLine());
					System.out.println("Input " + array2[i] + " saved at array-index " + i);
					flag = false;
				} catch (Exception e) {
					System.out.print("Wrong input. Integer type expected. Try to make new input for this element: ");
					flag = true;
				}
			} while (flag);
		}
		
		System.out.println("\nArrays you entered are " + (equals(array1,array2) == true ? "" : "not ") + "strictly identical.");

		sc.close();

	}
	
	public static boolean equals(int[ ] array1, int[ ] array2) {
		
		boolean flag = true;
		
		for (int i = 0; i < array1.length; i++) {
			
			if (array1[i] != array2[i]) {
				
				flag = false;
				break;
			}
		}
		
		return flag;
	}

}
