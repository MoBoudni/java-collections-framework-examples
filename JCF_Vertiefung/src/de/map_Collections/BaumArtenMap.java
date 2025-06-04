package de.map_Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Diese Klasse demonstriert die Verwendung einer HashMap zur Speicherung und
 * Ausgabe von Baumarten.
 * 
 * Eine HashMap speichert Schlüssel-Wert-Paare ohne garantierte Reihenfolge. In
 * diesem Beispiel werden Baumarten-Codes als Schlüssel und die entsprechenden
 * Baumartenbezeichnungen als Werte verwendet.
 * 
 * @author Unbekannt
 * @version 1.0
 */
public class BaumArtenMap {

	/**
	 * Die Hauptmethode erstellt eine HashMap mit Baumarten und gibt diese aus.
	 * 
	 * Es werden vier verschiedene Baumarten mit ihren entsprechenden Codes in die
	 * Map eingefügt und anschließend über die Schlüsselmenge iteriert, um alle
	 * Einträge auszugeben.
	 * 
	 * @param args Kommandozeilenargumente (werden nicht verwendet)
	 */
	public static void main(String[] args) {
		Map<String, String> baumarten = new HashMap<>();

		baumarten.put("FIC", "Fichte");
		baumarten.put("TAN", "Tanne");
		baumarten.put("LAR", "Lärche");
		baumarten.put("ZIR", "Zirbe");

		System.out.println("Baumarten aus HashMap:");
		for (String key : baumarten.keySet()) {
			System.out.println(key + " → " + baumarten.get(key));
		}
	}
}