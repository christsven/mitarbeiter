package sortierer;

import java.util.Random;

public class SortiererTestDataProvider {

    public static int[] getRandomIntArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static boolean isSorted(int[] result) {
        for (int i = 1; i < result.length; i++) {
            if (result[i - 1] > result[i]) {
                return false;
            }
        }
        return true;
    }
}
