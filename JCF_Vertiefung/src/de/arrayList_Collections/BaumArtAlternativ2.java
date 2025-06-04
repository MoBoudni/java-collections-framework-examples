package de.arrayList_Collections;

import java.util.List;

/**
 * Moderne Implementierung zur Demonstration der List-Initialisierung 
 * mit List.of() (Java 9+).
 * Diese Klasse zeigt die Verwendung der factory method List.of() zur
 * Erstellung unveränderlicher Listen sowie die Ausgabe mittels
 * Method Reference und forEach().
 * 
 * @author MoBoudni
 * @see List#of(Object...)
 */
public class BaumArtAlternativ2 {
    
    /**
     * Hauptmethode zur Demonstration der List.of()-Factory-Methode.
     * Erstellt eine unveränderliche Liste von Baumarten und gibt diese
     * mittels forEach() und Method Reference aus.
     * 
     * Wichtig: Die mit List.of() erstellte Liste ist
     * vollständig unveränderlich (immutable). Jeder Versuch einer Änderung
     * wirft eine UnsupportedOperationException.
     * 
     * @param args Kommandozeilenargumente (werden nicht verwendet)
     */
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
