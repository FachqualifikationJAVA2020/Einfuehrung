package de.bfz.dozent;

import java.util.Scanner;

public class Stringbearbeitung {
	public static void main(String[] args) {
		String eins = "Ein String";
		String zwei = "Noch ein String";
		System.out.print(eins);
		System.out.print(zwei);
		/*
		 * Wenn ich eine Ausgabe aus mehreren Strings erzeugen m�chte
		 * kann ich die Strings miteinander verkn�pfen 
		 */
		System.out.println(eins + zwei);
		/*
		 * + kann auch Nicht-String dazwischen einbauen
		 */
		int a = 5;
		System.out.println("Die Zahl ist: " + a);
		/*
		 * + kann zwei Rollen einnehmen, Stringverkn�pfung oder Addition
		 */
		int b = 7;
		System.out.println(a + b + " ist das Ergebnis");
		/*
		 * Es wird von links ausgewertet, hier zuerst a + b -> Addition
		 * dann 12 + String -> Stringverkn�pfung
		 */
		
		System.out.println("Das Ergebnis ist " + a + b);
		/*
		 * Es wird von links ausgewertet, hier zuerst String + a -> Stringverkn�pfung
		 * dann String + b -> Stringverkn�pfung
		 */
		
		System.out.println("Das Ergebnis ist " + ( a + b));
		/*
		 * Es wird zuerst die Klammer ausgewertet a + b -> Addition
		 * dann String + 12 -> Stringverkn�pfung
		 */
		
		/*
		 * Primitive Datentypen kann ich ohne Probleme vergleichen mit ==
		 * bei Strings ist das nicht so einfach
		 */
		String text = "Ein String";
		String text2 = "Ein String";
		if(text == text2) {
			System.out.println("Beides gleich");
		} else {
			System.out.println("Nicht gleich");
		}
		
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.nextLine();
		if(text == eingabe) {
			System.out.println("Beides gleich");
		} else {
			System.out.println("Nicht gleich");
		}
		sc.close();
		
		/*
		 * Zum Vergleichen von Strings am besten die .equals()-Methode
		 * benutzen, diese pr�ft auf Inhaltsgleichheit
		 */
		if(text.equals(eingabe)) {
			System.out.println("Beides inhaltlich gleich");
		} else {
			System.out.println("Nicht inhaltlich gleich");
		}
		
	}
}
