package sortierer;

public abstract class AbstractSortierer {

    static boolean isValid(int[] input) {
        if (input != null) {
            if (input.length > 1) {
                return true;
            }
        }
        return false;
    }
}
