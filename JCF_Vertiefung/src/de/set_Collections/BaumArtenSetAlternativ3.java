package de.set_Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Diese Klasse demonstriert die Erstellung eines HashSet aus einer vorhandenen Liste von Baumarten.
 * Sie zeigt, wie man eine unveränderliche Liste (erstellt mit List.of) in ein HashSet konvertiert,
 * um Duplikate zu entfernen. Diese Methode ist nützlich, wenn man eine bestehende Collection hat
 * und daraus ein Set ohne Duplikate erstellen möchte.
 */
public class BaumArtenSetAlternativ3 {
	
    /**
     * Die Hauptmethode der Klasse BaumArtenSetAlternativ3.
     * 
     * Diese Methode erstellt zunächst eine unveränderliche Liste von Baumarten mit Hilfe der
     * List.of-Methode. Anschließend wird diese Liste verwendet, um ein HashSet zu initialisieren,
     * wodurch alle Duplikate automatisch entfernt werden. Die resultierende Liste wird dann
     * mit Hilfe der forEach-Methode und einem Methodenreferenz auf System.out::println ausgegeben.
     * 
     * @param args Die Kommandozeilenargumente (werden in dieser Implementierung nicht verwendet)
     */
    public static void main(String[] args) {
	
	List<String> baumListe = List.of(
			"Fichte","Tanne", "Lärche", 
			"Rotkiefer", "Schwarzkiefer",
			"Latsche", "Zirbe", "Eibe",
			"Zirbe", "Fichte", "Tanne");
	
	Set<String> baum = new HashSet<>(baumListe);
	
	System.out.println("Aus List kopierte Baumarten (keine Duplikate): \n");
	
		baum.forEach(System.out::println);
	
	}
}