/**
 * Napisati sljedecu metodu koja vraca najvecu vrijednosti u ArrayListu Integera. 
 * Metoda vraca null ukoliko je lista null ili ukoliko lista sadrži 0 elemenata.
 * public static Integer max(ArrayList<Integer> list)
 */

package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		boolean stop = false;
		
		System.out.println("Enter integers as list elements (character that is not integer breaks input): ");
		
		while (!stop) {
			
			String str = sc.next();
			
			try {
				list.add(Integer.valueOf(str));
				
			} catch (Exception e) {
				if (!list.isEmpty()) {
					System.out.println("Elements added to list.");
				}
				stop = true;
			}
			
		}
		
		System.out.println(max(list) == null ? "You did not entered any integer." : "\nMax integer value in list is: " + max(list));
		
		sc.close();
	}
	
	public static Integer max(ArrayList<Integer> list){
		
		if (list == null || list.isEmpty()) {
			return null;
		}
		else {
			int maxValue = list.get(0);
			
			for (int i = 0; i < list.size(); i++) {
				
				if (list.get(i) > maxValue) {
					
					maxValue = list.get(i);
				}
			}
			
			return maxValue;
		}
		
		
	}

}
