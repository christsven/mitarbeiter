package sortierer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectionSortSortiererTest {

    @Test
    @DisplayName("Selectionsort empty array")
    void test_selectionsort_returns_empty_array() {
        Assertions.assertEquals(0,
                SelectionSortSortierer.sort(null).length);
    }

    @Test
    @DisplayName("Selectionsort")
    void test_selectionsort() {

        //given
        int[] testarray = SortiererTestDataProvider.getRandomIntArray(10);
        System.out.printf("SelectionSort:\ninput:%s", Arrays.toString(testarray));

        //when
        int[] result = SelectionSortSortierer.sort(testarray);

        //then
        System.out.printf("\nresult:%s%n",Arrays.toString(result));
        Assertions.assertTrue(SortiererTestDataProvider.isSorted(result));
    }
}