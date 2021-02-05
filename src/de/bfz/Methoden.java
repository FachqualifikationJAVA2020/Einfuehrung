package de.bfz;

public class Methoden {

	public static void main(String[] args) {
		/*
		 * Bisher hatten unsere Klassen genau eine Methode: main
		 * 
		 * Ich kann aber auch mehrere Methoden haben,
		 * die ich selber schreibe 
		 */
		String otto = "Peter";
		String hans = "Klaus";
		
		String ergebnis = zusammenkleben(otto,hans);
		System.out.println(ergebnis);
		
		System.out.println(zusammenkleben("eins","zwei"));
		
		System.out.println(halbieren("Hallo")[0]);
		System.out.println(halbieren("Hallo")[1]);
		
		int[] zahl = {4,2,1,3,6,0,-1,9,3};
		sortiere(zahl);
		for(int i=0; i < zahl.length; i++) {
			System.out.println(zahl[i]);
		}
		
		//Die Methode ausgabe soll den Inhalt des Arrays auf der Konsole ausgeben
		ausgabe(zahl);
		
		String[] liste = {"Eins","Zwei","Drei"};
		ausgabe(liste);
		
		String bla = "" + 'a' + 'b' ;
		System.out.println(bla);
	}
	
	/* Jede Methode hat einen Namen:	zusammenkleben
	 * Parameter						(String, String)
	 * Rückgabewert						String
	 */
	
	static String zusammenkleben(String a, String b) {
		String rueckgabe = a + b;
		return rueckgabe;
	}
	
	/*
	 * Jede Methode kann maximal einen Rückgabewert haben
	 * (wenn ich mehrere Werte zurückgeben will, kann ich sie in ein Array packen)
	 */
	static String[] halbieren(String s) {
		String[] haelften = new String[2];
		//Die vordere Hälfte von s
		haelften[0] = s.substring(0,s.length()/2);
		//Die hintere Hälfte von s
		haelften[1] = s.substring(s.length()/2);
		return haelften;
	}
	
	/*
	 * void ist das Schlüsselwort für "Kein Rückgabewert"
	 */
	
	static void sortiere(int[] array) {
		int n = array.length;
		//BubbleSort von Array mit n Elemente
		//n -1 Durchläufe
		for(int i = 0; i < n-1; i++) {
			//in jedem Durchlauf
			//einmal von vorne bis hinten durch das Array gehen
			//(nach jedem Durchlauf ist ein Element mehr hinten am richtigen Platz)
			for(int j = 0; j < n-1-i; j++) {
				//jedes Element mit seinem Nachfolge-Element vergleichen
				//wenn das kleinere hinten ist, vertauschen
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	static void ausgabe(int[] ints) {
		for(int i=0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
	
	static void ausgabe(String[] strings) {
		for(int i=0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	
	
}
