package sortierer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortSortiererTest {

    @Test
    @DisplayName("Bubblesort empty array")
    void test_bubblesort_returns_empty_array() {
        Assertions.assertEquals(0,
                BubbleSortSortierer.sort(null).length);
    }

    @Test
    @DisplayName("Bubblesort")
    void test_bubblesort() {

        //given
        int[] testarray = SortiererTestDataProvider.getRandomIntArray(10);
        System.out.printf("BubbleSort:\ninput:%s", Arrays.toString(testarray));

        //when
        int[] result = BubbleSortSortierer.sort(testarray);

        //then
        System.out.printf("\nresult:%s%n",Arrays.toString(result));
        Assertions.assertTrue(SortiererTestDataProvider.isSorted(result));
    }
}