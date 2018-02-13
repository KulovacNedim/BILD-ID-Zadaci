/**
 * Implementirati sljedecu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu 
 * (ili da pita korisnika koliku matricu zeli unijeti) te mu ispisuje na konzoli matricu 
 * sa sortiranim redovima - od najmanjeg broja do najveceg.
 */

package zadaci_13_02_2018;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rang of matrix you want to enter: ");
		
		int rang = 0;
		
		try {
			rang = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.print("Wrong input! Integer expected.");
		}
		
		double[][] matrix = new double[rang][rang];
		
		System.out.println("Enter matrix elements: ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextDouble();
			}
		}
		
		matrix = sortRows(matrix);
		
		System.out.println("\nYour matrix with sorted rows: ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-6.2f ", matrix[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public static double[ ][ ] sortRows(double[ ][ ] array) {
		
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		} 
		
		return array;
	}

}
