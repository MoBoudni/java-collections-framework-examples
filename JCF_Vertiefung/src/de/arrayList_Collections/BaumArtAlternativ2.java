package de.arrayList_Collections;

import java.util.List;

public class BaumArtAlternativ2 {
	
	public static void main(String[] args) {
		
		// Unveränderliche Ausgangsliste mit List.of()
		List<String> baum = List.of( 
				"Fichte","Tanne", "Lärche", 
				"Rotkiefer", "Schwarzkiefer",
				"Latsche", "Zirbe", "Eibe",
				"Zirbe", "Fichte", "Tanne");
		
		System.out.println("Baumliste auch mit "
				+ "Duplikaten: \n");
		
		baum.forEach(System.out::println);				
	}
}
