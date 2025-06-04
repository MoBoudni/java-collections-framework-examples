package de.arrayList_Collections;

import java.util.Arrays;
import java.util.List;

/**
 * Alternative Implementierung zur Demonstration der List-Initialisierung 
 * mit Arrays.asList().
 * Diese Klasse zeigt, wie eine Liste direkt bei der Deklaration mit Werten
 * befüllt werden kann, ohne einzelne add()-Aufrufe zu verwenden.
 * 
 * @author MoBoudni
 * @see Arrays#asList(Object...)
 */
public class BaumArtAlternativ1 {
    
    /**
     * Hauptmethode zur Demonstration der Arrays.asList()-Methode.
     * Erstellt eine Liste von Baumarten mittels der statischen Methode
     * Arrays.asList() und gibt diese über eine enhanced for-Schleife aus.
     * 
     *Hinweis:Die mit Arrays.asList() erstellte Liste
     * hat eine feste Größe und unterstützt keine strukturellen Änderungen
     * (add/remove-Operationen werfen UnsupportedOperationException).
     * 
     * @param args Kommandozeilenargumente 
     */
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
