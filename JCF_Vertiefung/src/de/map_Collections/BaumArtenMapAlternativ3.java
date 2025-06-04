package de.map_Collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Diese Klasse demonstriert die Verwendung einer TreeMap zur Speicherung und
 * Ausgabe von Baumarten.
 * 
 * Eine TreeMap speichert Schlüssel-Wert-Paare in einer sortierten Reihenfolge
 * basierend auf der natürlichen Ordnung der Schlüssel oder einem
 * bereitgestellten Comparator. In diesem Beispiel werden die Baumarten-Codes
 * alphabetisch sortiert.
 * 
 * @author Unbekannt
 * @version 1.0
 * @see java.util.TreeMap
 */
public class BaumArtenMapAlternativ3 {

	/**
	 * Die Hauptmethode erstellt eine TreeMap mit Baumarten und gibt diese aus.
	 * 
	 * Es werden vier verschiedene Baumarten mit ihren entsprechenden Codes in die
	 * Map eingefügt. Bei der Ausgabe werden die Einträge automatisch nach den
	 * Schlüsseln (Baumarten-Codes) alphabetisch sortiert. Die Ausgabe erfolgt mit
	 * der forEach-Methode und einem Lambda-Ausdruck.
	 * 
	 * @param args Kommandozeilenargumente (werden nicht verwendet)
	 */
	public static void main(String[] args) {
		Map<String, String> baum = new TreeMap<>();

		baum.put("FIC", "Fichte");
		baum.put("TAN", "Tanne");
		baum.put("LAR", "Lärche");
		baum.put("ZIR", "Zirbe");

		System.out.println("Baumarten (alphabetisch nach Schlüssel):");
		baum .forEach((k, v) -> System.out.println(k + " → " + v));
	}
}
