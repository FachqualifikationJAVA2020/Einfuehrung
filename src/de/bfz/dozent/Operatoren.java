package de.bfz.dozent;

public class Operatoren {
	public static void main(String[] args) {
		/*
		 * Es gibt die Rechenoperatoren
		 * + - * /
		 * diese gelten f�r alle Zahlentypen
		 */
		int a = 3;
		int b = 5;
		int c = a + b;
		System.out.println(c);
		/*
		 * Bei Rechnungen gilt Punkt vor Strich,
		 * also * und / werden zuerst ausgewertet
		 */
		c = a * 2 + b;
		System.out.println(c);
		
		/*
		 * Wenn ich nur ganze Zahlen in meiner Rechnung habe
		 * ist das Ergebnis immer eine ganze Zahl
		 */
		c = 5 / 3;
		System.out.println(c);
		
		/*
		 * Auch wenn ich das Ergebnis einem double zuweise
		 */
		double d = 5 / 3;
		System.out.println(d);
		
		/*
		 * Nur wenn mindestens eine Zahl keine ganze Zahl ist
		 * wird das Ergebnis auch eine Kommazahl
		 */
		d = 5.0 / 3;
		System.out.println(d);
		
		/*
		 * Modulo % funktioniert wie in C++
		 */
		c = 5 % 3;
		
		System.out.print("Wie in der zweiten Klasse ist 5 durch 3 ");
		System.out.print(5 / 3);
		System.out.print(" Rest: ");
		System.out.print(5 % 3);
		System.out.println();
		/*
		 * Vergleichsoperatoren sind wie in C++
		 * > < >= <= ==
		 * 
		 * Das doppelte Gleich == ist der Vergleichsoperator
		 * 
		 * Vergleichsoperatoren liefern Wahrheitswerte zur�ck: true oder false
		 */
		System.out.println(5 == 3);
		System.out.println(5 > 3);
		
		/*
		 * Zuletzt gibt es noch logische Operatoren
		 * 
		 * Der UND-Operator verk�npft zwei Wahrheitswerte,
		 * nur wenn beide true sind, ist das Ergebnis true
		 * & ist der UND-Operator
		 * && ist der Quick Resolve Operator f�r UND
		 * 	wenn schon die erste Bedingung false ist, 
		 * 	wird die zweite nicht mehr ausgewertet
		 */
		char ch = 't';
		double dou = 1.5;
		
		if(ch == 't' && dou > 2) {
			System.out.println("Beides wahr");
		} else {
			System.out.println("Nicht beides wahr");
		}
		
		/*
		 * Als n�chsten gibt es das logische ODER
		 * wenn einer der beiden Wahrheitswerte true ist
		 * ist das Ergebnis auch true. Nur wenn beide false
		 * sind, ist das Ergebnis false
		 * 	| wertet auf jeden Fall beide Bedingungen aus
		 * 	|| h�ren nach der ersten Bedingung auf, wenn diese schon wahr ist
		 */
		if(ch == 't' || dou > 2) {
			System.out.println("Mindestes eins wahr");
		} else {
			System.out.println("Beides unwahr");
		}
		
		/*
		 * Zuletzt gibt es noch die Verneinung NICHT
		 * sie kehrt den Wahrheitswert um
		 */
		boolean gleich = ch == 't';
		// Hier wird zuerst der Wahrheitswert ermittelt, also ch == 't' gepr�ft
		// und dann das Ergebnis der Variablen gleich zugewiesen
		if(!gleich) {
			System.out.println("Ungleich");
		} else {
			System.out.println("Gleich");
		}
		
		/*
		 * Nat�rlich kann ich diese Operatoren zu komplizierten
		 * logischen Konstrukten verkn�pfen
		 */
		if(ch == 't' && !(dou > 2) || ch == 'c' && dou < 3) {
			System.out.println("Alles wahr");
		}
	}
}
