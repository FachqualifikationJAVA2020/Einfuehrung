package de.bfz.dozent;

public class Kontrollstrukturen {
	public static void main(String[] args) {
		/*
		 * Es gibt zwei Arten von Kontrollstrukturen
		 * 	Schleifen
		 * 	Verzweigungen
		 */
		
		/*
		 * Eine Schleife erlaubt es einen Programmteil mehrfach auszuf�hren
		 * 
		 * Eine Z�hlschleife ist eine einfache Schleife:
		 *  - Zuerst die Z�hlvariable mit dem Startwert
		 *  - Eine Schleifenbedingung wie lange die Schleife durchlaufen soll
		 *  - Z�hler ver�ndern
		 */
		for(int i=1; i <= 20; i = i + 1) {
			System.out.println(i);
		}
//		System.out.println(i);
		/*
		 * Die Z�hlervariable i existiert nur innerhalb der Schleife, wenn
		 * sie oben in der runden Klammer erst deklariert wird
		 */
		int j;
		for(j = 0; j < 3; j = j + 1) {
			System.out.println(j);
		}
		System.out.println(j);
		
		/*
		 * Eine andere Art von Schleife ist die while-Schleife
		 * So wie die for-Schleife ist die while-Schleife kopfgesteuert
		 * (d.h. oben vor dem Schleifenk�rper wird die Bedingung gepr�ft)
		 */
		int a = 0;
		while(a < 10) {
			a = a * 2;
			System.out.println(a);
			a = a + 1;
		}
		
		/*
		 * do-Schleife ist fu�gesteuert (d.h. die Bedingung wird unten hinter
		 * dem Schleifenk�rper gepr�ft) - eine do-Schleife wird also auf jeden Fall
		 * einmal durchlaufen
		 */
		System.out.println("do-Schleife");
		do {
			System.out.println(a);
		} while(a < 10);
		
		/*
		 * F�r mehrere Zweige (also mehr als zwei) gibt es switch - case
		 */
		switch(j) {
			case 1: System.out.println("Eins");break;
			case 0: System.out.println("Null");break;
			case 3: System.out.println("Drei");break;
			default: System.out.println("Eine andere Zahl");break;
		}
		/*
		 * break hinter jedem case sorgt daf�r, dass nicht die nachfolgenden
		 * cases auch ausgef�hrt werden.
		 * Die cases m�ssen nicht in einer bestimmten Reihenfolge stehen
		 * 
		 * Als m�gliche Datentypen f�r switch stehen zur Verf�gung:
		 * int, short, byte, long
		 * char
		 * String
		 * 
		 * Nicht zul�ssig sind float, double, boolean (daf�r gibt es if)
		 */
		String tag = "Dienstag";
		
		switch(tag) {
			case"Dienstag":System.out.println("Meh");break;
		}
		/*
		 * Der Switch-Block muss nicht unbedingt cases enthalten, es muss keinen
		 * default-case geben. Es darf kein Code stehen, der nicht zu einem case
		 * geh�rt
		 */
		
		
		/*
		 * Die einfachste Art der Verzweigung ist eine Wenn-Dann
		 * Verzweigung
		 */
		if(j == 2) {
			//Wird ausgef�hrt wenn die Bedingung wahr ist
			System.out.println("j ist zwei");
		} else {
			//wird ausgef�hrt wenn die Bedingung nicht wahr ist
			System.out.println("j ist nicht zwei");
		}
		
		
	}
}
