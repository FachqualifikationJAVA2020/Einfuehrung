package de.bfz;

public class Variablen {
    /*
     *  Variablen sind Platzhalter für Werte
     *  JEDE Variable hat einen Datentypen (streng typisierte Sprache)
     *  einen Variablennamen und einen Wert
     */

    // ZAHLEN

    int zahl = 1;
    /*
     *  int ist der Datentyp für ganze Zahlen
     *  zahl ist der Variablenname
     *  Variablennamen fangen üblicherweise mit einem Kleinbuchstaben an
     *  1 ist der Wert der Variablen
     *
     *  = ist der Zuweisungsoperator, er weist zahl den Wert 1 zu
     */

    int grosseZahl = 1234567890;
    /*
     *  int kann 2^32 Zahlen angeben -> 32 bit
     *  weil alle numerischen Typen negativ und positiv sind
     *  geht der Zahlenbereich von -2^31 bis +2^31-1
     */

    byte b = 127;
    /*
     *  Für kleine Zahlen gibt es byte -> 8 bit
     *  der höchste positive Wert ist +127
     *  der kleinste Wert ist -128     *
     */

    short s = 128;
    /*
     *  Für etwas größere Zahlen gibt es short -> 16 bit
     *  short kann von -2^15 bis +2^15-1
     */

    long l = 12345678910L;
    /*
     *  Für besonders großen Zahlen gibt es long -> 64 bit
     *  Hinter einem Zahlenwert der zu groß für ein int ist,
     *  muss ein L angegeben werden, um anzuzeigen, das es
     *  sich um ein long handelt
     */

    double d = 1.5;
    float f = 1.5F;
    /*
     *  Für Kommazahlen gibt es nur zwei verschiedene Datentypen:
     *  double -> 64 bit
     *  float -> 32 bit | float-Werte werden mit einem F markiert
     */

    // ZEICHEN

    char c = '8';
    char o = 'ö';
    /*
     *  char stellt ein einzelnes Zeichen dar -> 16 bit
     *  Wird in einzelnen Anführungsstrichen gesetzt ' '
     */

    boolean wahr = true;
    boolean falsch = false;
    /*
     * booleans stellen Wahrheitswerte dar true oder false -> 8 bit
     */

    // Das sind alle acht primitiven Datentypen die Java kennt

    String zeichenkette = "Hallo Welt!";
    /*
     *  Datentyp String kann mehrere Zeichen erhalten
     *  String ist kein primitiver Typ, sondern ein Objekttyp.
     *  Darum ist der Datentyp groß geschrieben und selbst
     *  kein reserviertes Wort
     *
     */

}
