package com.hapleow.algorithm.code;

/**
 * 插入排序
 * T(n) = O(n^2)
 * S(n) = O(1)
 * 思路：
 * 默认第一个位置已经有序，从第二个位置开始，将其值插入到有序序列的相应位置中
 * 外循环中i表示被操作数temp的原始位置，下标小于i的序列表示已经有序
 * 内循环j表示应当插入的新位置
 * 如果被操作数小于a[j],则把j-1位置的数向后移动一位，并继续向前寻找插入点
 * 如果temp比它前一个大，则无法进入内循环，仍被保留在原位置
 */
public class InsertionSort {

    public static void insertionSort(int[] a) {

        int j;
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            // 从i的前一个位置开始向前寻找合适的插入位置
            for (j = i; j > 0 && temp < a[j - 1]; j--)
                a[j] = a[j - 1];
            a[j] = temp;
        }
    }
}
