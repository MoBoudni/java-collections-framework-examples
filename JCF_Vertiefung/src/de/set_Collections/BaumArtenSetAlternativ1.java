package de.set_Collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Diese Klasse demonstriert die Verwendung eines LinkedHashSet zur Speicherung von Baumarten.
 * Ein LinkedHashSet ist eine Implementierung des Set-Interfaces, die keine Duplikate erlaubt,
 * aber im Gegensatz zum HashSet die Einfügereihenfolge der Elemente beibehält. Dies wird durch
 * eine doppelt verkettete Liste erreicht, die die Elemente in der Reihenfolge ihres Hinzufügens
 * verbindet.
 */
public class BaumArtenSetAlternativ1 {
	
    /**
     * Die Hauptmethode der Klasse BaumArtenSetAlternativ1.
     * 
     * Diese Methode erstellt ein LinkedHashSet von Baumarten, fügt verschiedene Baumarten hinzu
     * (einschließlich Duplikate) und gibt die resultierende Liste aus. Da es sich um ein
     * LinkedHashSet handelt, werden Duplikate automatisch ignoriert, aber die Ausgabereihenfolge
     * entspricht der Reihenfolge, in der die Elemente hinzugefügt wurden.
     * 
     * @param args Die Kommandozeilenargumente (werden in dieser Implementierung nicht verwendet)
     */
    public static void main(String[] args) {
		
		// Veränderliche Kopie als ArrayList 
		Set<String> baum = new LinkedHashSet<>(); // Konstruktor 
		
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
		System.out.println("\nWie man sieht hier werden keine Duplikaten aber mit Einfügereihenfolge berücksichtigt!");

	}

}