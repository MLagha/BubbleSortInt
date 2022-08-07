package com.sparta.ml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BubbleSortTest {

    @Test
    @DisplayName("Ascending Order")
    void AscendingArray(){
        int [] unsortedArray = {4, 5, 2, 7, 9, 1};
        int [] expected = {1, 2, 4, 5, 7, 9};
        int [] answer = BubbleSort.ascendingIteration (unsortedArray);
        Assertions.assertArrayEquals(expected,  answer);
    }

    @Test
    @DisplayName("Descending Order")
    void DescendingArray(){
        int [] unsortedArray = {4, 5, 2, 7, 9, 1};
        int [] expected = {9, 7, 5, 4, 2, 1};
        int [] answer = BubbleSort.descendingIteration(unsortedArray);
        Assertions.assertArrayEquals(expected, answer);
    }
}
