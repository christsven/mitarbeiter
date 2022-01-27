package sortierer;

public class BubbleSortSortierer extends AbstractSortierer {

    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < (input.length - i); j++) {
                if (input[j - 1] > input[j]) {
                    int temporary = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temporary;
                }
            }
        }
        return input;
    }
}
