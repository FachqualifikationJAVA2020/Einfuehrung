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
         *  da diese VOR der Schleife deklariert wird
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
         *  Für mehrere Zweige (also mehr als Zwei) gibt es switch - case
         */
        switch (j){
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println("Drei");
                break;
            default:
                System.out.println("Eine andere Zahl");
        }
        /*
         *  break hinter jedem case sorgt dafür, dass nicht die nachfolgenden cases
         *  auch ausgeführt werden
         *  Die cases müssen nicht in einer bestimmten Reihenfolge stehen
         *
         *  Als mögliche Datentypen für switch stehen zur Verfügung:
         *  int, short, byte, long
         *  char
         *  string
         *
         *  Nicht zulässing sind float, double, boolean (dafür gibt es if)
         */


        /*
         *  Die einfachste Art der Verzweigung ist eine Wenn-Dann Verzweigung
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
