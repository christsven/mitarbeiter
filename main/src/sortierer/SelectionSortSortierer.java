package sortierer;

public class SelectionSortSortierer extends AbstractSortierer {

    //TODO korrekten Algorithmus implementieren
    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
