package de.bfz;

public class Kontrollstrukturen {
    /*
     *  Es gibt zwei arten von Kontrollstrukturen
     *  Schleifen
     *  Verzweigungen
     */
    public static void main(String[] args) {
        /*
         *  Eine Schleife erlaubt es ein Programmteil mehrfach auszuführen
         *
         *  Eine Zählschlefe ist eine einfache Schleife:
         *  - Zuerst die Zählvariable mit dem Startwert
         *  - Eine Schleifenbedingung wie lange die Schleife durchlaufen soll
         *  - Zähler verändern
         *
         *  Die Zählervariable existiert nur innerhalb der Schleife,
         *  da sie in der runden Klammer erst deklariert wird
         */
        for (int i = 0; i < 20; i = i + 1) {
            /*
             * Ausgabe: 0 - 19 Zeilenweise
             * Bei jedem durchlauf wird i + 1 gesetzt und die Schleifenbedingung überprüft
             */
            System.out.println(i);
        }

        /*
         *  Die Zählervariable j ist auch außerhalb der Schleife aufrufbar,
         *  da diese VOR der Schleife deklariert wird         *
         */
        int j;
        for (j = 0; j < 3; j = j + 1) {
            /*
             * Ausgabe: 0 - 2 Zeilenweise
             * Bei jedem durchlauf wird j + 1 gesetzt und die Schleifenbedingung überprüft
             */
            System.out.println(j);
        }
        // Ausgabe: 3
        System.out.println(j);

        /*
         *  Die einfachste Art der Verzweigung ist eine Wenn-Dann Verzweigung         *
         */
        if(j == 2) {
            // Wird ausgeführt wenn die Bedingung wahr ist
            System.out.println("j ist zwei");
        } else {
            // Wird ausgeführt wenn die Bedingung nicht wahr ist
            System.out.println("j ist nicht zwei");
        }
    }
}
