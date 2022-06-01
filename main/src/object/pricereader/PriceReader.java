package object.pricereader;

import object.AbstractObject;

import java.util.HashMap;

/**
 * CSV-Reader speziell für den Import der Preisliste. Erstellt
 * eine HashMap (https://www.baeldung.com/java-hashmap), welche
 * dem PriceController zur Verfügung gestellt wird.
 */
public class PriceReader {

    public HashMap<AbstractObject, Double> readFromFile(String path) {
        return null;
    }
}
