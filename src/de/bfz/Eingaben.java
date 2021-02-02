package de.bfz;

import java.util.Scanner;
/*
 *  Damit nicht immer alle möglichen Klassen geladen werden
 *  kann/muss ich angeben welche Klasse ich zusätzlich zu den Standardklassen
 *  benutzten will.
 *  Das Package java.util enthält viele Utility-Klassen, also solche die allgemein
 *  nützlich sind
 */

public class Eingaben {
    /*
     *  Interaktive Programme müssen Eingaben annehmen können
     */
    public static void main(String[] args) {
        /*
         *  Scanner ist ein Datentyp!
         *  Wir erzeugen eine variable vom Datentyp Scanner,
         *  so wie wir ints mit ganzen Zahlen befüllt haben
         *  befüllen ich diese Variable mit einem Scanner-Objekt.
         *  Ein neues Objekt erzeuge ich mit new
         */

        System.out.print("Bitte eine Zahl eingeben: ");
        Scanner sc = new Scanner(System.in);

        /*
         *  System.in ist die Eingabequelle auf die der Scanner reagiert
         *  in diesem Fall die Tastatur
         *
         *  Um ganze Zahlen einlesen zu können muss der Input eingelesen werden
         */

        int eingabe = sc.nextInt();
        System.out.println("Zahl: " + eingabe);

        /*
         *  Entsprechende Eingabemethoden hat Scanner für alle primitiven Datentypen:
         *  nextDouble(), nextFloat() usw.
         *  außer für char, da char nur ein Zeichen aufnehmen kann.
         *  Scanner nimmt aber so viele Zeichen an, bis die Eingabetaste gedrückt wird.
         *
         *  Stattdessen gibt es nextLine(), das einen ganzen String annimmt.
         *  Leider nimmt nextInt() nur die eingegebene Ziffer an, aber nicht
         *  den Druck auf die Eingabetaste. Der wird erst beim nächsten nextLine() eingelesen.
         */

        // Einabepuffer leeren wenn vorher ein nicht TEXT eingelesen wurde
        sc.nextLine();

        System.out.println("Bitte ein Text eingeben:");
        String text = sc.nextLine();
        System.out.println("Text: " + text);

        /*
         *  Damit die Verbindung zwischen Scanner-Objekt und Tastatur wieder aufgehoben wird,
         *  ist es eine gute wichtig den Scanner wieder zu schließen
         */

        sc.close();

        /*
         *  Der Compiler erlaubt die nächsten Zeilen aber bei der Programmausführung (zur Laufzeit)
         *  führen diese zu einem Fehler, wenn auf ein geschlossener Scanner zugegriffen wird.
         */

        int fehler = sc.nextInt();
        System.out.println(fehler);

    }
}
