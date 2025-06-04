package de.arrayList_Collections;

import java.util.Arrays;
import java.util.List;

public class BaumArtAlternativ1 { // Initialisierung mit Arrays.asList()
	
	public static void main(String[] args) {
		
		// statische Methode
		List<String> baum = Arrays.asList(
				"Fichte","Tanne", "Lärche", 
				"Rotkiefer", "Schwarzkiefer",
				"Latsche", "Zirbe", "Eibe",
				"Zirbe", "Fichte", "Tanne"); 
		
		System.out.println("Baumliste auch "
				+ "mit Duplikaten: \n");
		
		for (String art : baum) {
			System.out.println(art);		
		}
	}
}
