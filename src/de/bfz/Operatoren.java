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


        /*
         *  Zuletzt gibt es noch logische Operatoren
         *
         *  Der UND-Operator verknüpft zweu Wahrheitswerte
         *  nur wenn beide true sind, ist das Ergebnis true
         *  & ist der UND-Operator
         *  && ist der Quick Resolve Operator für &
         *  wenn schon die erste Bedingung false ist, wird die zweite nicht
         *  mehr ausgewertet
         */
        char ch = 't';
        double dou = 1.5;

        if(ch == 't' & dou < 2){
            System.out.println("Beides Wahr");
        } else {
            System.out.println("Beides nicht wahr");
        }

        /*
         *  Als nächstes gibt es das logische ODER
         *  wenn einer der beiden Wahrheitswerte true ist
         *  ist das Ergebnis auch true.
         *  Nur wenn beide false sind, ist das Ergebnis false
         *   | wertet auf jeden Fall beide Bedingungen aus
         *   || hören nach der ersten Bedingung auf, wenn diese schon wahr ist
         */
        if(ch == 't' | dou < 2){
            System.out.println("Mindestens eins Wahr");
        } else {
            System.out.println("Beides unwahr");
        }

        /*
         *  Zuletzt gibt es noch die Verneinung NICHT
         *  sie kehr den Warheitswert um
         *
         */
        boolean gleich = ch == 't';
        // Hier wird zuerst der Warheitswert ermittelt, also ch == 't' geprüft
        // und dann das Ergebnis der Variable gleich zugewiesen
        if(!gleich){
            System.out.println("Ungleich");
        } else {
            System.out.println("Gleich");
        }


        /*
         *  Natürlich kann ich diese Operatoren zu komplizierten logischen
         *  Konstrukte verknüpfen
         */
        if(ch == 't' && !(dou >2) || ch == 'c' && dou < 3){
            System.out.println("Alles wahr");
        }

    }
}
