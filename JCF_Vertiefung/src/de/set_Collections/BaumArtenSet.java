package de.set_Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Diese Klasse demonstriert die Verwendung eines HashSet zur Speicherung von Baumarten.
 * Ein HashSet ist eine Implementierung des Set-Interfaces, die keine Duplikate erlaubt
 * und keine bestimmte Reihenfolge der Elemente garantiert. Die Elemente werden basierend
 * auf ihren Hashcode-Werten gespeichert, was eine effiziente Suche und Zugriff ermöglicht.
 */
public class BaumArtenSet {

    /**
     * Die Hauptmethode der Klasse BaumArtenSet.
     * 
     * Diese Methode erstellt ein HashSet von Baumarten, fügt verschiedene Baumarten hinzu
     * (einschließlich Duplikate) und gibt die resultierende Liste aus. Da es sich um ein
     * HashSet handelt, werden Duplikate automatisch ignoriert und die Ausgabereihenfolge
     * ist nicht vorhersehbar.
     * 
     * @param args Die Kommandozeilenargumente (werden in dieser Implementierung nicht verwendet)
     */
    public static void main(String[] args) {
		
		// Veränderliche Kopie als ArrayList 
		Set<String> baum = new HashSet<>(); // Konstruktor 
		
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
		System.out.println("\nWie man sieht hier werden weder Duplikaten noch Reihenfolge berücksichtigt!");

	}
}