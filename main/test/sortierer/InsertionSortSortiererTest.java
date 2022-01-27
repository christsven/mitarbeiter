package sortierer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertionSortSortiererTest {

    @Test
    @DisplayName("Insertionsort empty array")
    void test_insertionsort_returns_empty_array() {
        Assertions.assertEquals(0,
                InsertionSortSortierer.sort(null).length);
    }

    @Test
    @DisplayName("Insertionsort")
    void test_insertionsort() {

        //given
        int[] testarray = SortiererTestDataProvider.getRandomIntArray(10);
        System.out.printf("InsertionSort:\ninput:%s", Arrays.toString(testarray));
        //when
        int[] result = InsertionSortSortierer.sort(testarray);

        //then
        System.out.printf("\nresult:%s%n",Arrays.toString(result));
        Assertions.assertTrue(SortiererTestDataProvider.isSorted(result));
    }
}