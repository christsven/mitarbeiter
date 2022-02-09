package sortierer;

import java.util.Arrays;

public class InsertionSortSortierer extends AbstractSortierer {

    /**
     * vergleichbar mit dem Sortieren eines Kartendecks auf der Hand.
     * Ein Iterator vergleicht einen Wert an Position n mit dem Wert
     * an der vorherigen Position und verschiebt das Element solange,
     * bis es entweder an der korrekten Position oder am Anfang steht.
     *
     * Danach wird der Iterator inkrementiert und der nächste Wert
     * verglichen, bis das gesamte Array durchiteriert wurde.
     *
     * @param input
     * @return
     */
    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }

        for (int i = 1; i < input.length; i++) {
            int temporary = input[i];
            int j = i;
            while (j > 0 && input[j - 1] > temporary) {
                input[j] = input[j - 1];
                j--;
            }
            input[j] = temporary;
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
}
