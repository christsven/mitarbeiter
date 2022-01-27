package sortierer;

public abstract class AbstractSortierer {

    static int[] sort(int[] input) {
        return new int[0];
    }

    static boolean isValid(int[] input) {
        if (input != null) {
            if(input.length > 1) {
                return true;
            }
        }
        return false;
    }
}
