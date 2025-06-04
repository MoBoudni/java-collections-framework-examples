package de.arrayList_Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstriert die Verwendung von ArrayList zur Verwaltung einer Liste von Baumarten.
 * Diese Klasse zeigt die grundlegende Initialisierung und Befüllung einer ArrayList
 * mit der add()-Methode sowie die Ausgabe der Elemente mittels enhanced for-loop.
 * 
 * @author MoBoudni
 */
public class BaumArten {

    /**
     * Hauptmethode zur Demonstration der ArrayList-Funktionalität.
     * Erstellt eine veränderliche ArrayList von Baumarten, fügt verschiedene
     * Nadelbaumarten hinzu (inklusive Duplikate) und gibt diese in der Konsole aus.
     * 
     * @param args Kommandozeilenargumente (werden nicht verwendet)
     */
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
