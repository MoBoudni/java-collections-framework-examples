package de.map_Collections;

import java.util.Map;

/**
 * Diese Klasse demonstriert die Verwendung der Map.of()-Methode zur Erstellung
 * einer unveränderlichen Map mit Baumarten.
 * 
 * Die Map.of()-Methode wurde in Java 9 eingeführt und ermöglicht die Erstellung
 * einer kompakten, unveränderlichen Map mit einer begrenzten Anzahl von
 * Einträgen. Diese Implementierung ist besonders nützlich, wenn eine Map mit
 * festen Werten benötigt wird, die nicht mehr verändert werden soll.
 * 
 * @author Unbekannt
 * @version 1.0
 * @see java.util.Map
 */
public class BaumArtenMapAlternativ1 {

	/**
	 * Die Hauptmethode erstellt eine unveränderliche Map mit Baumarten mittels
	 * Map.of() und gibt diese aus.
	 * 
	 * Es werden vier verschiedene Baumarten mit ihren entsprechenden Codes in die
	 * Map eingefügt. Die Ausgabe erfolgt mit der forEach-Methode und einem
	 * Lambda-Ausdruck, was eine moderne und kompakte Schreibweise darstellt.
	 * 
	 * @param args Kommandozeilenargumente (werden nicht verwendet)
	 */
	public static void main(String[] args) {
		Map<String, String> baumarten = Map.of("FIC", "Fichte", "TAN", "Tanne", "LAR", "Lärche", "ZIR", "Zirbe");

		System.out.println("Baumarten aus Map.of():");
		baumarten.forEach((k, v) -> System.out.println(k + " → " + v));
	}
}