package com.hapleow.algorithm.code;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {

        int[] a = {5, 4, 3, 2, 1};
        InsertionSort.insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}