package de.map_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Diese Klasse demonstriert die Verwendung einer LinkedHashMap zur Speicherung
 * und Ausgabe von Baumarten.
 * 
 * Eine LinkedHashMap speichert Schlüssel-Wert-Paare in der Reihenfolge ihrer
 * Einfügung. Dies ist besonders nützlich, wenn die Einfügereihenfolge für die
 * spätere Verarbeitung oder Anzeige wichtig ist.
 * 
 * @author Unbekannt
 * @version 1.0
 * @see java.util.LinkedHashMap
 */
public class BaumArtenMapAlternativ2 {

	/**
	 * Die Hauptmethode erstellt eine LinkedHashMap mit Baumarten und gibt diese
	 * aus.
	 * 
	 * Es werden vier verschiedene Baumarten mit ihren entsprechenden Codes in die
	 * Map eingefügt. Bei der Ausgabe wird die Einfügereihenfolge beibehalten, was
	 * der Hauptunterschied zur normalen HashMap ist. Die Ausgabe erfolgt mit der
	 * forEach-Methode und einem Lambda-Ausdruck.
	 * 
	 * @param args Kommandozeilenargumente (werden nicht verwendet)
	 */
	public static void main(String[] args) {
		Map<String, String> baumarten = new LinkedHashMap<>();

		baumarten.put("FIC", "Fichte");
		baumarten.put("TAN", "Tanne");
		baumarten.put("LAR", "Lärche");
		baumarten.put("ZIR", "Zirbe");

		System.out.println("Baumarten (mit Einfügereihenfolge):");
		baumarten.forEach((k, v) -> System.out.println(k + " → " + v));
	}
}