package sortierer;

public class SelectionSortSortierer extends AbstractSortierer {

    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }

        int length = input.length;
        for (int i = 0; i < length - 1; i++) {
            //position verändert sich markiert momentane auswahl
            int position = i;
            int minimum = input[position];
            for (int j = i + 1; j < length; j++) {
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
        }

        return input;
    }
}
