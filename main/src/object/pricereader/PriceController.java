package object.pricereader;

import object.AbstractObject;

import java.util.HashMap;

/**
 * Dient dem Zugriff auf die Preisliste und verwaltet intern alle Preiskalkulationen
 * und das Auslesen der Datei, ohne dass man von außen mehr als den Dateipfad eingeben
 * muss.
 *
 * Im Nachhinein soll auch die Preisliste aktualisiert werden können, der Controller soll
 * desweiteren die Liste ausgeben, Preise auslesen oder aktualisieren können.
 */
public class PriceController {

    //map of all prices, has to be imported on initialization
    private HashMap<AbstractObject, Double> priceList;

    private final PriceReader priceReader = new PriceReader();

    public PriceController(String pathToCSVPriceList) {
        setPriceList(priceReader.readFromFile(pathToCSVPriceList));
    }

    private void setPriceList(HashMap<AbstractObject, Double> unvalidatedMap) {
        //TODO Validation
        priceList = unvalidatedMap;
    }

    //get a price for the shape
    public double getPriceForShape() {
        return 0;
    }

    public HashMap<AbstractObject, Double> getPriceList() {
        return priceList;
    }

    public void importPriceList() throws IllegalArgumentException {
        throw new IllegalArgumentException("wrong input");
    }
}
