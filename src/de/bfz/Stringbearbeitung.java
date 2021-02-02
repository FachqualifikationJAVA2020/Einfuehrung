package de.bfz;

import java.util.Scanner;

public class Stringbearbeitung {
    public static void main(String[] args) {
        String eins = "Ein String";
        String zwei = "Noch ein String";

        System.out.println(eins);
        System.out.println(zwei);

        /*
         *  Wenn eine Ausgabe aus mehreren Strings erzeugt werden soll
         *  Können diese Strings miteinander verknüpft werden
         */

        System.out.println(eins + zwei);

        /*
         *  + kann auch Nicht-Strings dazwischen einbauen
         */

        int a = 5;
        System.out.println("Die Zahl ist: " + a);

        /*
         *  + kann zwei Rollen einnehmen, Stringverknüpung oder Addition
         */

        int b = 7;

        /*
         *  Es wurd von links ausgewertet, zuerst a + b -> Addition
         *  dann 12 + String -> Stringverknüpfung
         *  Ausgabe: 12 ist das Ergebnis
         */
        System.out.println(a + b + " ist das Ergebnis");

        /*
         *  Es wurd von links ausgewertet, String + a -> Stringverknüpfung
         *  dann String + b -> Stringverknüpfung
         *  Ausgabe: Das Ergebnis ist: 57
         */
        System.out.println("Das Ergebnis ist: " + a + b);

        /*
         *  Es wird zuerst die Klammer ausgewertet, a + b -> Addition
         *  dann String + 12 -> Stringverknüpfung
         *  Ausgabe: Das Ergebnis ist: 12
         */
        System.out.println("Das Ergebnis ist: " + (a + b));

        /*
         *  Primitive Datentypen können ohne Probleme verglichen werden mit ==
         *  bei Strings ist das nicht so einfach
         */

        String text = "Ein String";
        String text2 = "Ein String";

        if(text == text2){
            System.out.println("Beides gleich");
        } else {
            System.out.println("Nicht gleich");
        }

        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();

        if(text == eingabe){
            System.out.println("Beides gleich");
        } else {
            System.out.println("Nicht gleich");
        }
        sc.close();

        /*
         *  Zum Vergleichen von Strings am besten die .equals()-Methode verwenden
         *  Diese prüft auf Inhaltsgleichheit
         */

        if(text.equals(eingabe)){
            System.out.println("Beides inhaltlich gleich");
        } else {
            System.out.println("Nicht inhaltlich gleich");
        }




    }

}
