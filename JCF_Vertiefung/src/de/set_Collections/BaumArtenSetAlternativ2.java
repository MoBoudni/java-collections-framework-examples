package de.set_Collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Diese Klasse demonstriert die Verwendung eines TreeSet zur Speicherung von Baumarten.
 * Ein TreeSet ist eine Implementierung des Set-Interfaces, die keine Duplikate erlaubt
 * und die Elemente in aufsteigender Reihenfolge sortiert. Die Sortierung basiert auf der
 * natürlichen Ordnung der Elemente (bei Strings alphabetisch) oder auf einem beim Erstellen
 * des TreeSet angegebenen Comparator.
 */
public class BaumArtenSetAlternativ2 {
	
    /**
     * Die Hauptmethode der Klasse BaumArtenSetAlternativ2.
     * 
     * Diese Methode erstellt ein TreeSet von Baumarten, fügt verschiedene Baumarten hinzu
     * (einschließlich Duplikate) und gibt die resultierende Liste aus. Da es sich um ein
     * TreeSet handelt, werden Duplikate automatisch ignoriert und die Ausgabe erfolgt
     * alphabetisch sortiert.
     * 
     * @param args Die Kommandozeilenargumente (werden in dieser Implementierung nicht verwendet)
     */
    public static void main(String[] args) {
		
		// Veränderliche Kopie als ArrayList 
		Set<String> baum = new TreeSet<>(); // Konstruktor 
		
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
		
		System.out.println("Baumliste: \n");
		
		for (String art : baum ) {
			System.out.println(art);
		}
		System.out.println("\nWie man sieht hier werden keine Duplikaten betracht, aber alphabetisch sortiert");

	}

}