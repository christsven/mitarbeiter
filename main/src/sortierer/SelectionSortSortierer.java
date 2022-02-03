package sortierer;

import java.util.Arrays;

public class SelectionSortSortierer extends AbstractSortierer {

    /**
     * Beim Selectionsort wird das Array intern in zwei Subarrays
     * unterteilt. Der Algorithmus iteriert durch das Array und sucht
     * den kleinsten Wert, welcher an die erste Position geschrieben
     * wird. Danach beginnt der Iterator mit dem ersten Wert der unsortierten
     * Hälfte und beginnt von neuem, bis alle Werte im sortierten Bereich sind.
     *
     * Durch die "relative" Position der Werte kann nicht sofort gesagt werden,
     * wann ein Wert an seiner finalen Position ist, was den Algorithmus von
     * den anderen beiden unterscheidet.
     *
     * @param input
     * @return
     */
    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }

        for (int i = 0; i < input.length - 1; i++) {
            //position verändert sich markiert momentane auswahl
            int position = i;
            int minimum = input[position];
            for (int j = i + 1; j < input.length; j++) {
                //neuer minimalwert wird entsprechend gesetzt
                if (input[j] < minimum) {
                    position = j;
                    minimum = input[position];
                }
            }
            //minimalwert wird an die korrekte relative Position geschrieben
            if (position != i) {
                input[position] = input[i];
                input[i] = minimum;
            }
            System.out.println(Arrays.toString(input));
        }

        return input;
    }
}
