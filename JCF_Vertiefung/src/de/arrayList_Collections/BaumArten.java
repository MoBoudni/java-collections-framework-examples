package de.arrayList_Collections;

import java.util.ArrayList;
import java.util.List;

public class BaumArten {

	public static void main(String[] args) {
		
		// Veränderliche Kopie als ArrayList 
		List<String> baum = new ArrayList<>(); // Konstruktor 
		
		baum.add("Fichte");  
		baum.add("Tanne");
		baum.add("Lärche");
		baum.add("Rotkiefer");
		baum.add("Schwarzkiefer");
		baum.add("Latsche");
		baum.add("Zirbe");
		baum.add("Eibe");
		baum.add("Zirbe");
		baum.add("Fichte");  
		baum.add("Tanne");
		
		System.out.println("Baumliste auch mit "
				+ "Duplikaten: \n");
		
		for (String art : baum ) {
			System.out.println(art);
		}

	}

}
