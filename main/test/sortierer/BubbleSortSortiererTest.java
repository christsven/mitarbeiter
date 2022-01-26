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
                BubbleSortSortierer.bubblesort(null).length);
    }

    @Test
    @DisplayName("Bubblesort")
    void test_bubblesort() {

        //given
        int[] testarray = { 23, 43, 62, 3, 24 ,63 ,2, 76, 7 };
        int[] expected = { 2, 3, 7, 23, 24, 43, 62, 63, 76 };

        //when
        int[] result = BubbleSortSortierer.bubblesort(testarray);

        //then
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.equals(expected, result));
    }

}