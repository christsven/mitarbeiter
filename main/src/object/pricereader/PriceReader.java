package object.pricereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * CSV-Reader speziell für den Import der Preisliste. Erstellt eine HashMap
 * (https://www.baeldung.com/java-hashmap), welche dem PriceController zur Verfügung gestellt
 * wird.
 */
public class PriceReader {

    private static final String DELIMITER = ";";

    //Format: name:price
    public HashMap<String, Double> readFromFile(String path) {

        HashMap<String, Double> result = new HashMap<>();
        String currentLine = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((currentLine = reader.readLine()) != null) {
                String[] rawLines = currentLine.split(DELIMITER);
                convertCommasToPeriods(rawLines);
                // TODO Wenn nicht gerade, könnte man ein leeren String anhängen,
                // TODO so geht das letzte Feld nicht verloren durch das +2
                for (int i = 0; i < rawLines.length - 1; i = i + 2) {
                    result.put(rawLines[i], Double.parseDouble(rawLines[i + 1]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File could not be found for %s%n", path);
            return new HashMap<>();
        } catch (IOException e) {
            System.out.printf("Error while parsing: %s", e.getMessage());
            return new HashMap<>();
        }
        return result;
    }

    private String[] convertCommasToPeriods(String[] array) {
        for(int i = 0; i < array.length; i++) {
            String value = array[i];
        }
        return array;
    }
}
