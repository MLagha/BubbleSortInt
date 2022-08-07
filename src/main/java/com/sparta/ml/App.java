package com.sparta.ml;

import java.util.Arrays;

public class App {

    public static void main( String[] args ) {

        int[] orgArray = {4, 5, 2, 7, 9, 1};
        System.out.println("Original array: " + Arrays.toString(orgArray));
        /* System.out.print("Original array: ");
        for (int element : orgArray){
            System.out.print(" " + element);
        }
        System.out.println("");
        */

        int [] AscendingArray = BubbleSort.ascendingIteration (orgArray);
        System.out.println("Asc sorted array: " + Arrays.toString(AscendingArray));
        /* System.out.print("Asc sorted array: ");
        for (int i = 0; i < AscendingArray.length; i++) {
            System.out.print(" " + AscendingArray[i]);
        }
        System.out.println("");
        */

        int [] DescendingArray = BubbleSort.descendingIteration (orgArray);
        System.out.println("Desc sorted array: " + Arrays.toString(DescendingArray));
        /* System.out.print("Desc sorted array: ");
        for (int i = 0; i < DescendingArray.length; i++) {
            System.out.print(" " + DescendingArray[i]);
        }
        System.out.println("");
        */
    }
}
