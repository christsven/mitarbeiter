package object.pricereader;

import java.util.HashMap;

/**
 * Dient dem Zugriff auf die Preisliste und verwaltet intern alle Preiskalkulationen
 * und das Auslesen der Datei, ohne dass man von außen mehr als den Dateipfad eingeben
 * muss.
 * <p>
 * Im Nachhinein soll auch die Preisliste aktualisiert werden können, der Controller soll
 * desweiteren die Liste ausgeben, Preise auslesen oder aktualisieren können.
 */
public class PriceController {

    //map of all prices, has to be imported on initialization
    private HashMap<String, Double> surfaceList;
    private HashMap<String, Double> fillList;
    private final PriceReader priceReader = new PriceReader();

    public PriceController(String pathToSurfaceList, String pathToFillList) {
        setSurfaceList(priceReader.readFromFile(pathToSurfaceList));
        setFillList(priceReader.readFromFile(pathToFillList));
    }

    //get a price for the shape
    public HashMap<String, Double> getSurfaceList() {
        return surfaceList;
    }

    public HashMap<String, Double> getFillList() {
        return fillList;
    }

    private void setFillList(HashMap<String, Double> unvalidatedMap) {
        //TODO Validation
        fillList = unvalidatedMap;
    }

    private void setSurfaceList(HashMap<String, Double> unvalidatedMap) {
        //TODO Validation
        surfaceList = unvalidatedMap;
    }

    public double getPriceForSurface() {
        return 0;
    }

    public double getPriceForFilling() {
        return 0;
    }

    public void importSurfaceList() throws IllegalArgumentException {
        throw new IllegalArgumentException("wrong input");
    }

    public void importFillList() throws IllegalArgumentException {
        throw new IllegalArgumentException("wrong input");
    }
}
