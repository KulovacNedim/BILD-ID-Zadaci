/**
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeci se sljedecim headerom:
 * public static double min(double[ ] array)
 * 
 * Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati 
 * najmanji element u nizu.
 */

package zadaci_13_02_2018;

import java.util.Scanner;

public class Zadatak_02 {
	
	public static double min(double[ ] array) {
		
		double min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] array = new double[10];
		
		System.out.println("Enter ten decimal numbers. Separate them with enter key: ");
		
		for (int i = 0; i < array.length; i++) {
			
			boolean flag = true;
			do {
							
				try {
					array[i] = Double.valueOf(sc.nextLine());
					System.out.println("Input " + array[i] + " saved at array-index " + i);
					flag = false;
				} catch (Exception e) {
					System.out.print("Wrong input. Double type expected. Try to make new input for this element: ");
					flag = true;
				}
			} while (flag);
		}
		
		System.out.println("\nMinimum value in array is " + min(array));
		
		sc.close();
	}

}
