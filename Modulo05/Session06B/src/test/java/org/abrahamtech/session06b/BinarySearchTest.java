package org.abrahamtech.session06b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BinarySearchTest {
    
    @Test
    @DisplayName("Empty array should be -1")
    public void emptyArray() {
        int [] array = {};

        int index = BinarySearch.search(array, 100);

        assertEquals(-1, index);
    }

    //Karla Regina Esquivel Luna
    @Test
    @DisplayName("An array with one number should be 0")
    public void oneSizedArray(){
        int [] array = {2};

        int index = BinarySearch.search(array, 2);

        assertEquals(0, index);
    }

    @Test
    @DisplayName("An array with one number not found should be -1")
    public void indexNotFoundOneSizedArray() {
        int [] array = {2};

        int index = BinarySearch.search(array, 5);

        assertEquals(-1, index);
    }

    @Test
    @DisplayName("An odd array the element is in the middle")
    public void mediumArrayNumber() {
        int [] array = {100, 200, 300};
        int [] array2 = {100, 200, 300, 400, 500};

        int index = BinarySearch.search(array, 200);
        int index2 = BinarySearch.search(array2, 300);

        assertEquals(1, index);
        assertEquals(2, index2);
    }

    @ParameterizedTest
    @MethodSource("mediumArrayNumberParamPreconditions")
    @DisplayName("An odd array the element is in the middle with ParametrizedTest")
    public void mediumArrayNumberParam(int [] array, int number, int expectedIndex) {

        int index = BinarySearch.search(array, number);
      
        assertEquals(expectedIndex, index);
    }

    static Stream<Arguments> mediumArrayNumberParamPreconditions() {
        return Stream.of(
           Arguments.of(new int[] {100, 200, 300}, 200, 1),
           Arguments.of(new int[] {100, 200, 300, 400, 500}, 300, 2),
           Arguments.of(new int[] {100, 200, 300, 400, 500, 600, 700}, 400, 3)
        );
    }

    @Test
    @DisplayName("Element is exactly in the middle of an odd array")
    public void pairNumber() {
      int[] array = { 100, 200, 300, 400 };
  
      int index = BinarySearch.search(array, 200);
      
      assertEquals(1, index);
    }

}
