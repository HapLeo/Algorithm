package com.hapleow.algorithm.code;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] arr = {1, 5, 2, 2, 3, 1, 2, 0, 9, 90, 1, 119, 0};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void sortWithFlag() {
        int[] arr = {1, 5, 2, 2, 3, 1, 2, 0, 9, 90, 1, 119, 0, 200, 201, 202, 203, 204};
        BubbleSort.sortWithFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
