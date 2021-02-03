package de.bfz.dozent.aufgaben;

import java.util.Scanner;

public class BMI {
	/* 
	 * BMI-Rechner mit drei Eingaben
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr K�rpergewicht in kg ein");
		int gewicht = sc.nextInt();
		System.out.println("Bitte geben Sie als n�chstes Ihre Gr��e in m ein");
		double groesse = sc.nextDouble();
		System.out.println("Bitte geben Sie Ihr Alter ein");
		int alter = sc.nextInt();
		sc.close(); 
		
		double bmi = gewicht/(groesse * groesse);
		System.out.println("Ihr BMI betr�gt: "+bmi);
		
		int unter, ober;
		if(alter > 64) {
			unter=24;
			ober=29;
		} else if(alter < 25 ) {
			unter = 19;
			ober = 24;
		} else {
			unter = 22;
			ober = 27;
		}
		if(bmi < unter) {
			System.out.println("Sie haben Untergewicht");
		} else if (bmi > ober) {
			System.out.println("Sie haben �bergewicht");
		} else {
			System.out.println("Sie haben Normalgewicht");
		}
		//
	}
}
