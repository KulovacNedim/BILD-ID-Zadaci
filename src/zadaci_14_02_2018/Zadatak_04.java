/**
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */

package zadaci_14_02_2018;

import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("Enter 10 integers. Separate them with enter key: ");
		
		for (int i = 0; i < array.length; i++) {
			
			boolean flag = true;
			do {
							
				try {
					array[i] = Integer.valueOf(sc.nextLine());
					System.out.println("Input " + array[i] + " saved at array-index " + i);
					flag = false;
				} catch (Exception e) {
					System.err.println("Wrong input. Double type expected.");
					System.out.print("Make new input for this element: ");
					flag = true;
				}
			} while (flag);
		}
		
		sc.close();
		
		printArrayBothWay(array);

	}

	private static void printArrayBothWay(int[] array) {

		System.out.print("\nArray in order you entered is: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.print("\nArray in reverse order is: ");
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
	}

}
