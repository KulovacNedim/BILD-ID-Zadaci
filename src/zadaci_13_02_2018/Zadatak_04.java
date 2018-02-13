/**
 * Napisati metodu koja vraca lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeci header:
 * public static int[ ] locateLargest(double[ ][ ] a)
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */

package zadaci_13_02_2018;

import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[][] matrix = new double[4][4];
		
		System.out.println("Enter 4 × 4 matrix (double type input): ");
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				
				try {
					matrix[i][j] = sc.nextDouble();
					
				} catch (Exception e) {
					System.out.println("Wrong input. Program closed! Run program again.");
					System.exit(1);
				}
				
			}
		}
		
		System.out.println("\nLocation index of max value in matrix is : (" + locateLargest(matrix)[0] + ", " +locateLargest(matrix)[1] + ").");
		locateLargest(matrix);
		
		sc.close();

	}
	
	public static int[ ] locateLargest(double[ ][ ] a) {
		
		double max = a[0][0];
		int[] location = new int[2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] > max) {
					max = a[i][j];
					location[0] = i;
				    location[1] = j;
				}
			}
		}
		
		return location;
	}

}
