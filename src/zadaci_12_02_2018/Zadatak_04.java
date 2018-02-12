/**
 * Napisite program koji generise 100 nasumicnih cijelih brojeva izmedju 0 i 9 te ispisuje koliko se puta koji broj ponovio.
 */

package zadaci_12_02_2018;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		int[] list = new int[100];
		int[] repetition = new int[10];
		
		for (int i = 0; i < list.length; i++) {
			
			list[i] = (int)(Math.random() * 10);
		}
		
		System.out.println("List of 100 random integers (0 - 9) created.\n");
		
		for (int i = 0; i < repetition.length; i++) {
			
			for (int j = 0; j < list.length; j++) {
				
				if (list[j] == i) {
					
					repetition[i]++;
				}
			}
		}
		
		for (int i = 0; i < repetition.length; i++) {
			System.out.println("Repetition of number " + i + ": " + repetition[i]);
		}

	}

}
