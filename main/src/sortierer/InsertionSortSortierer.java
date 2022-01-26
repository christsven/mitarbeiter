package sortierer;

public class InsertionSortSortierer {

    //TODO abstrahieren
    public static int[] insertionsort(int[] input) {
        if(input == null) {
            return new int[] {};
        }

        for (int i = 1; i < input.length; i++) {
            int temporary = input[i];
            int j = i;
            while (j > 0 && input[j - 1] > temporary) {
                input[j] = input[j - 1];
                j--;
            }
            input[j] = temporary;
        }
        return input;
    }
}