package de.bfz;

public class Arrays {
    /*
     * Arrays erlauben mir mehr als einen Wert in einer Variablen zu speichern
     */
    public static void main(String[] args) {

        int[] anzahl = new int[8];

        /*
         * Beim Initialisieren des Arrays muss ich die Größe angeben
         * Die Größe ist fest und l�sst sich nicht mehr ändern
         *
         * Der Datentyp der Variablen (anzahl) und der Datentyp des Arrays müssen
         * übereinstimmen
         * mit new wird ein neues Objekt vom Typ int-Array erzeugt
         */

        anzahl[3] = 17;

        /*
         * Ich muss den Index angeben, um auf ein spezielles Element des Arrays
         * zuzugreifen
         *
         * Was passiert, wenn ich ein Element ausgebe?
         */

        System.out.println(anzahl[2]);

        /*
         * Arrays sind dann am besten, wenn man sie mit einer for-Schleife benutzt
         * Dazu gibt es die Angabe .length im Array, die mir die Anzahl der Elemente
         * angibt
         */

        System.out.println("Ausgabe aus der Schleife:");
        for(int i = 0; i < anzahl.length;i=i+1){
            anzahl[i] = i * 3;
            System.out.println(anzahl[i]);
        }

        //Leider kann ich Arrays nicht einfach so ausgeben:

        System.out.println(anzahl);

        //Da bekomme ich nur eine kryptische Referenz auf das Array zur�ck


        /*
         * Wenn ich die Werte bei der Initialisierung des Arrays bereits kenne,
         * kann ich sie auch sofort angeben:
         */

        String[] namen = {"Paul Meier", "Petra Müller", "Muhamad Azdemir"};

        /*
         * Hier wird jetzt ohne Angabe von new ein Array der Gr��e 3 erzeugt
         * und mit Werten versehen
         */

        System.out.println(namen[1]);

        /*
         * Ein Array kann von einem beliebigen Datentyp sein.
         * Auch vom Datentyp Array
         * Die einzelnen Array-Elemente sind dann selber auch wieder Arrays
         */

        String[] buchhaltung = {"Hans Moser", "Klara Sprudel", "Hans Burger"};
        String[] einkauf = {"Orco Light","Alfred Neumann"};
        String[] vertrieb = {"Dominic Herrmann"};

        String[][] firma = {buchhaltung,einkauf,vertrieb};

        /*
         * Zum Zugriff auf einzelne Elemente muss ich erst den Index der Abteilung angeben
         * und dann den Index des Mitarbeiters
         */

        System.out.println(firma[1][0]);

        /*
         * Natürlich kann ich auch mehrdimensionale Arrays ohne Angabe von Werten deklarieren
         */

        String[][] tabelle = new String[4][3];

        /*
         * So müssen alle Unter-Arrays die Länge 3 haben
         *
         *  Das lohnt sich natürlich nur, wenn ich die Werte einfach bestimmen kann
         *  z.B. mit den Koordinaten:
         */

        // tabelle[0][0] = "0/0";

        for(int i = 0; i < tabelle.length; i++) {
            for(int j=0 ; j < tabelle[i].length; j++) {
                tabelle[i][j] = i + "/" + j;
                System.out.print(tabelle[i][j]+" ");
            }
            System.out.println();
        }

        int [][] einkommen_miete = {
                                    // Zeile 0
                                    {4200,1200},

                                    // Zeile 1
                                    {900,340},

                                    // Zeile 2
                                    {1800,600},

                                    // Zeile 3
                                    {3600,1100}

                                    };
        /*
         * System.out.println(einkommen_miete[ZEILE][SPALTE]);
         */

        // Ausgabe: 900
        System.out.println(einkommen_miete[1][0]);
        // Ausgabe 340
        System.out.println(einkommen_miete[1][1]);
        // Ausgabe 1100
        System.out.println(einkommen_miete[3][1]);

    }
}
