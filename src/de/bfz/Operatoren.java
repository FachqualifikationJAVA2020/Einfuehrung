package de.bfz;

public class Operatoren {
    public static void main(String[] args) {
        /*
         *  Es gibt die Rechenoperatoren
         *  + - * /
         *  diese gelten für alle Zahlentypen
         */
        int a = 3;
        int b = 5;
        int c = a + b;

        // Ausgabe Variable c = 8
        System.out.println(c);

        /*
         *  Bei Rechnungen gilt Punkt vor Strich,
         *  also * und / werden zuerst gewertet
         */
        c = a * 2 + b;
        // Ausgabe Variable c = 11
        System.out.println(c);

        /*
         *  Wenn nur ganze Zahlen in der Rechnung ist
         *  ist das Ergebnis immer eine ganze Zahl
         */
        c = 5 / 3;
        // Ausgabe Variable c = 1
        System.out.println(c);

        /*
         *  Auch wenn das Ergebnis einem double zuweise
         *  ist das Ergebnis eine ganze Zahl
         */
        double d = 5 / 3;
        // Ausgabe Variable d = 1.0
        System.out.println(d);

        /*
         *  Nur wenn mindestens eine Zahl keine ganze Zahl ist
         *  wird der Ergebnis auch eine Kommezahl
         */
        d = 5.0 / 3;
        // Ausgabe Variable d = 1.666666667
        System.out.println(d);

        /*
         *  Modulo % funktioniert wie in C++
         */

        c = 5 % 3;
        System.out.print("Wie in der zweiten Klasse ist 5 durch 3 = ");
        System.out.print(5 / 3);
        System.out.print(" Rest: ");
        System.out.print(5 % 3);
        System.out.println();

        /*
         *  Vergleichsoperatoren sind wie in C++
         *  > < >= <= ==
         *
         *  Das doppelt Gleich == ist der Vergleichsoperator
         *
         *  Vergleichsoperatoren liefern Warheitswerte zurück: true false
         */

        // Ausgabe false
        System.out.println(5 == 3);
        // Ausgabe true
        System.out.println(5 > 3);


    }
}
