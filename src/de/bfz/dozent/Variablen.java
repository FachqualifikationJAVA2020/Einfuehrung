package de.bfz.dozent;

public class Variablen {
/*
 * Variablen sind Platzhalter f�r Werte
 * JEDE Variable hat einen Datentypen (streng typisierte Sprache)
 * einen Variablennamen und einen Wert
 */
	int zahl = 1;
	/*
	 * int ist der Datentyp f�r ganze Zahlen
	 * zahl ist der Variablenname - Variablennamen fangen �berlicherweise
	 * mit einem Kleinbuchstaben an
	 * 1 ist der Wert der Variablen
	 * 
	 * = ist der Zuweisungsoperator, er weist zahl den Wert 1 zu 
	 */
	int grosseZahl = 1234567890;
	/*
	 * int hat 32 bit, also kann ich nun 2^32 Zahlen angeben
	 * weil alle numerischen Typen negativ und positiv sind
	 * geht der Zahlenbereich von -2^31 bis +2^31-1 
	 */
	
	/*
	 * F�r kleine Zahlen gibt es byte, das hat 8 bit
	 */
	byte b = 127;
	/*
	 * der h�chste positive Wert ist +127
	 * der kleinste Wert ist -128
	 */
	
	/*
	 * F�r etwas gr��ere Zahlen gibt es short, es hat 16 bit
	 */
	short s = 128;
	/*
	 * short kann von -2^15 bis 2^15-1
	 */
	/*
	 * F�r besonders gro�e Zahlen gibt es long
	 * 64 bit
	 */
	long l = 12345678910L;
	/*
	 * Hinter einem Zahlenwert der zu gro� f�r ein int ist,
	 * muss ich L angeben, um anzuzeigen, dass es sich um ein long handelt
	 */
	
	/*
	 * F�r Kommazahlen gibt es nur zwei verschiedene Datentypen:
	 */
	double d = 1.5;
	/*
	 * double braucht 64 bit
	 */
	float f = 1.5F;
	/*
	 * float braucht 32 bit, float-Werte werden mit F markiert 
	 */
	
	/* 
	 * char stellt ein einzelnes Zeichen dar
	 */
	char c = 't';
	char o = '�';
	/*
	 * char hat 16 bit, hat einzelne Anf�hrungsstriche
	 */
	
	/*
	 * Zuletzt gibt es booleans, sie stellen Wahrheitswerte dar
	 * true oder false
	 * boolean hat 8 bit (obwohl ein bit doch reichen sollte :(
	 */
	boolean wahr = true;
	
	/*
	 * Das waren die acht primitiven Datentypen, die Java kennt
	 */
	
	/*
	 * F�r Zeichenketten gibt es den Datentyp String
	 * der mehr als ein Zeichen enthalten kann
	 */
	String wort = "Ganz viele Zeichen";
	/*
	 * String ist kein primitiver Typ, sondern ein Objekttyp
	 * darum ist der Datentyp gro� geschriebenund selbst kein
	 * reserviertes Wort
	 */
}
