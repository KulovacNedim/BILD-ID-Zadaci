/**
 * Napisati program koji simulira nasumicno izvlacenje karte iz spila od 52 karte. Program treba ispisati koja karta je 
 * izvucena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */

package zadaci_14_02_2018;

import java.util.Random;

public class Zadatak_02 {

	public static void main(String[] args) {
		
		System.out.println("Randomly generated card: " + randomCard());
		
	}

	private static String randomCard() {
		
		Random rand = new Random();

		int randomNumber = rand.nextInt(13) + 1;
		int randomSign = rand.nextInt(4) + 1;
		
		String card = "";
		
		switch (randomNumber) {
		case 1: card = card + "A "; break;
		case 11: card = card + "J "; break;
		case 12: card = card + "Q "; break;
		case 13: card = card + "K "; break;
		default: card = card + randomNumber + " ";
		}
		
		switch (randomSign) {
		case 1: card = card + "Hearts"; break;
		case 2: card = card + "Diamonds"; break;
		case 3: card = card + "Spades"; break;
		case 4: card = card + "Clubs";
		}
		
		return card;
	}

}
