package org.example.Challenge03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HierarchyTest {
    @Test
    @DisplayName("Hierarchy")
    void reto(){
        List<? extends Number> numberList;

        List<Integer> integerList = List.of(1,2,3);

        numberList = integerList;

        //numberList = List.of(1,2,3,4.0,5f);

        assertNotNull(numberList);
    }
}
