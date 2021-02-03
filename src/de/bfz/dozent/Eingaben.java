package de.bfz.dozent;

import java.util.Scanner;
/*
 * Damit nicht immer alle m�glichen Klassen geladen werden
 * kann/muss ich angeben welche Klassen ich zus�tzlich zu den Standardklassen
 * benutzen will.
 * Das package java.util enth�lt viele Utility-klassen, also solche die allgemein
 * n�tzlich sind 
 */

public class Eingaben {
	/*
	 * Interaktive Programme m�ssen Eingaben annehmen k�nnen
	 */
	public static void main(String[] args) {
		/*
		 * Scanner ist ein Datentyp!
		 * Wir erzeugen eine Variable vom Datentyp Scanner,
		 * so wie wir ints mit ganzen Zahlen bef�llt haben
		 * bef�lle ich diese Variable mit einem Scanner-Objekt.
		 * Ein neues Objekt erzeuge ich mit new
		 */
		//Damit ich sehe, dass es etwas passiert mache ich erst eine Ausgabe
		System.out.print("Bitte eine Zahl eingeben: ");
		Scanner sc = new Scanner(System.in);
		/*
		 * System.in ist die Eingabequelle auf die der Scanner reagiert
		 * in diesem Fall die Tastatur
		 * 
		 * Um ganze Zahlen einlesen zu k�nnen mache ich
		 */
		int eingabe = sc.nextInt();
		System.out.println(eingabe);
		/*
		 * Entsprechende Eingabemethoden hat Scanner f�r alle primitiven Typen:
		 * nextDouble(), nextFloat() usw.
		 * au�er f�r char, da char nur ein Zeichen aufnehmen kann.
		 * Scanner nimmt aber so viele Zeichen an, bis die Eingabetaste gedr�ckt wird
		 * 
		 * Stattdessen gibt es nextLine(), das einen ganzen String annimmt.
		 * Leider nimmt nextInt() nur die eingegebenen Ziffern an, aber nicht
		 * den Druck auf die Eingabetaste. Der wird erst beim n�chsten
		 * nextLine() eingelesen :(
		 */
		sc.nextLine();
		System.out.println("Bitte einen Text eingeben:");
		String text = sc.nextLine();
		System.out.println(text);
		String text2 = sc.nextLine();
		System.out.println(text2);
		
		/*
		 * Damit die Verbindung zwischen Scanner-Objekt und Tastatur
		 * wieder aufgehoben  wird, ist es eine gute Angewohnheit 
		 * Scanner wieder zu schlie�en:
		 */
		sc.close();
		
		/*
		 * Der Compiler erlaubt mir, diese zwei Zeilen zu schreiben
		 * aber bei der Programmausf�hrung (also zur Laufzeit)
		 * f�hren sie zu einem Fehler, wenn ich auf den geschlossenen
		 * Scanner zugreifen will
		 */
		int fehler = sc.nextInt();
		System.out.println(fehler);
	}
}
