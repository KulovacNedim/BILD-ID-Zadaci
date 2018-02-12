/**
 *  Napisati program koji ucitava niz brojeva, pronalazi najveci broj te ispisuje koliko se puta taj broj ponavlja. 
 *  Pretpostavimo da se unos brojeva zavrsava sa nulom.
 */

package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		boolean stop = false;

		System.out
				.println("Enter integer to add it to the list (zero breaks input): ");

		while (!stop) {

			String str = sc.next();
			try {
				list.add(Integer.valueOf(str));

				if (Integer.valueOf(str) == 0) {
					stop = true;
				}
			} catch (Exception e) {
				System.out.println("Wrong input. Integers only permitted. Continue your input: ");
				continue;
			}

		}

		maxInteger(list);

		sc.close();
	}

	private static void maxInteger(ArrayList<Integer> list) {

		int max = list.get(0);
		int counter = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > max) {
				max = list.get(i);
				counter = 1;
			} else if (list.get(i) == max) {
				counter++;
			}
		}

		System.out.println("Max integer in list you entered is " + max + " and it repeats " + counter
				+ (counter <= 1 ? " time " : " times ") + "in the list.");

	}

}
