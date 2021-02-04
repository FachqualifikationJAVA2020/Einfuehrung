package de.bfz;

public class Strings {
    /*
     *  String sind Zeichenketten, also im Prinzip char-Arrays
     *  Anders als Arrays haben Strings Methoden
     */
    public static void main(String[] args) {

        String name = "Peter Anders";

        /*
         *  String sind Objekte, müssen aber nicht unbedingt mit new
         *  erzeugt werden, können aber, nur das macht so keiner
         */

        String andererName = new String("Thomas Anders");

        /*
         *  Strings zusammenfügen mit + oder der Methode .concat(string)
         */

        String zusammen = "Thomas " + name;
        zusammen = "Thomas ".concat(name);

        /*
         *  Strings vergleichen nicht mit ==
         *  sondern mit der Methode .equals()
         */

        // Ausgabe: true
        System.out.println("Thomas Anders".equals(andererName));

        /*
         *  Die .equals()-Methode für Strings vergleicht den Inhalt
         *  also sind gleiche Zeichen in der gleichen Reihenfolge ?
         *
         *  == prüft auf Objektgleichheit, der String in andererName
         *  ist ein anderes Objekt, da es explizit mit new erzeugt wurde
         */

        // Ausgabe: false
        System.out.println("Thomas Anders" == andererName);

        /*
         *  Wie bei Arrays kann ein char(Zeichen) aus einem String ausgelesen werden
         *  allerdings nicht mit [], sondern mit der Methode charAt()
         */

        char a = name.charAt(0);
        // Ausgabe: P
        System.out.println(a);

        /*
         *  Zeichen für Zeichen ausgabe eines String erfolgt durch eine for-Schleife
         */

        for (int i = 0; i < name.length(); i++){
            // Ausgabe: Zeichen für Zeichen von name hintereinander
            System.out.print(name.charAt(i));
        }
        System.out.println();

        /*
         *  Strings werden durch .toUpperCase() & .toLowerCase() nicht verändert
         *  legendlich die Ausgabe bzw. weiterverarbeitung wird verändert
         */

        String nameGross = name.toUpperCase();
        String nameKlein = name.toLowerCase();

        // Ausgabe: name komplett in Großbuchstaben
        System.out.println(name.toUpperCase());
        // Ausgabe: name komplett in Kleinbuchstaben
        System.out.println(name.toLowerCase());

        /*
         *  Auslesen eines Teils des Strings erfolgt mit .substring(START,ENDE + 1)
         *  Erster Wert ist der Anfangs-Index des Teilstrings
         *  Zweiter Wert ist der erste Index, der nicht mehr enthalten ist
         *  Die Differenz der beiden Werte ist die Anzahl der Zeichen im String
         */

        String vorname = name.substring(0,5);
        // Ausgabe: Peter
        System.out.println(vorname);

        /*
         *  .substring() kann auch nur mit einem Wert angegeben werden
         *  das ist der StartIndex, das Ende ist das Ende vom String
         */

        String nachname = name.substring(6);
        // Ausgabe: Anders
        System.out.println(nachname);

        /*
         *  Bestimmtest Zeichen in einem String finden
         */

        int index = name.indexOf(' ');
        // Ausgabe: 5
        System.out.println(index);

        /*
         *  .indexOf() liefert immer nur den Index des ersten Vorkommen
         *  des angegebenen chars, alle weiteren werden ignoriert
         *
         *  .lastIndexOf() liefert nur das letzte Vorkommen des angegebene chars
         */

        // Ausgabe: 9
        System.out.println(name.lastIndexOf('e'));

        /*
         *  .indexOf() als auch .lastIndexOf() geben -1 zurück
         *  wenn das Zeichen nicht enthalten ist
         */

        // Ausgabe: -1
        System.out.println(name.indexOf('z'));

        /*
         *  Automatisch am ersten Leerzeichen spalten
         */

        name = "Tim Müller";
        index = name.indexOf(' ');

        /*
         *  Es kann nach bestimmte Zeichen getrennt werden
         *  das bedeutet aber nicht immer, dass Vor- & Nachnamen
         *  richtig getrennt werden können
         */

        vorname = name.substring(0,index);
        nachname = name.substring(index +1);
        // Ausgabe: Peter
        System.out.println(vorname);

        // Ausgabe: Anders
        System.out.println(nachname);

        /*
         *  Die Methode .split() ermöglicht es z.B. einen ganzen Satz zu zerlegen
         */

        String satz = "Warum ist die Banane krumm";

        /*
         *  .split() gibt ein ganzes String-Array zurück, in dem jedes einzelene Wort enthalten sind
         */
        String[] worte = satz.split(" ");
        for(int i = 0; i < worte.length; i++){
            System.out.println(worte[i]);
        }

        /*
         *  Das Leezeichen ist nicht in den einzelenen Teilstrings enthalten
         *  .split() kann statt eines einzelnen Zeichen auch komplexere Bedingungen
         *  annehmen, bis hin zu regulären Ausdrücken
         */

        // Ausgabe: 3 | Kein Leerzeichen vor oder nach "ist"
        System.out.println(worte[1].length());

        /*
         *  Einzelne Zeichen in einem String können mit .replace(Suchzeichen,Ersetzt mit) verändert werden
         *  Der Urpsprüngliche String-Wert bleibt dabei unverändert
         *  Um den String wirklich zu verändern muss dies durch eine Zuweisung gemacht werden
         */

        name = "Peter Maier";
        // Ausgabe: Potor Moior | alle e werden durch a ersetzt
        System.out.println(name.replace('e','o'));

        // Ausgabe: Peter Maier
        System.out.println(name);

        // Zuweisen von name mit neuen Buchstaben
        name = name.replace('e','o');

        // Ausgabe: Potor Moior | alle e werden durch a ersetzt
        System.out.println(name);



    }

}
