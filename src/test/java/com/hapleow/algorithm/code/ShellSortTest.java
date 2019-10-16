package com.hapleow.algorithm.code;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void sort() {

        int[] a = {1,2,3,4,5};
        int[] a1 = {5,4,3,2,1};
        ShellSort.sort(a1);
        for (int i : a1) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}