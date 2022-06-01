package object.pricereader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PriceReaderTest {

    @Test
    @DisplayName("CSV Reader reads file correctly")
    public void test_csv_reader_reads_correctly() {
        PriceReader priceReader = new PriceReader();
        HashMap<String, Double> result = priceReader.readFromFile("H:/Schule/SUD/Materiallisten/MaterialpreiseOberflaechen.csv");
        System.out.println(result.toString());
    }

}