package de.arrayList_Collections;

import java.util.ArrayList;
import java.util.List;

public class BaumArtAlternativ3 { // Kürzer mit forEach-Lambda 
	                              // (moderne Schreibweise)

	public static void main(String[] args) {

		List<String> baum = new ArrayList<>(List.of(
				"Fichte", "Tanne", "Lärche", "Rotkiefer", 
				"Schwarzkiefer","Latsche", "Zirbe", "Eibe", 
				"Zirbe", "Fichte", "Tanne"));
		
		System.out.println("Baumliste auch mit "
				+ "Duplikaten: \n");
		baum.forEach(art -> System.out.println(art));

	}

}
