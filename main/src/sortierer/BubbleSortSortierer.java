package sortierer;

public class BubbleSortSortierer extends AbstractSortierer {

    /**
     * Der simpelste Sortieralgorithmus, der Sortieralgorithmus
     * vergleicht jeweils zwei nebeneinanderliegende Werte und
     * tauscht entsprechend der Größe. Dadurch, dass theoretisch
     * für n Werte n Durchläufe mit jeweils n Vergleichen benötigt
     * werden, entspricht die Laufzeit O=(n^2) und ist die schlechteste
     * aller Sortieralgorithmen.
     *
     *
     * @param input
     * @return
     */
    public static int[] sort(int[] input) {
        if (!isValid(input)) {
            return new int[]{};
        }

        for (int i = 0; i < input.length; i++) {
            //j startet an 2. stelle im array
            for (int j = 1; j < (input.length - i); j++) {
                //wenn der vorgänger kleiner ist, soll getauscht werden
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
