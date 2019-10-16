package com.hapleow.algorithm.code;


/**
 * 希尔排序
 * <p>希尔排序是插入排序的优化算法<p/>
 * <p>使用1，3,7 ... 2^k-1 序列作为增量序列,可以将时间复杂度降至O(n^（3/2）)</p>
 * <p>外层循环用于循环指定的gap序列</p>
 * <p>中层循环用于指向待排序位置</p>
 * <p>内层循环用于寻找已排序序列的插入位置</p>
 */
public class ShellSort {

    /**
     * @param a
     */
    public static void sort(int[] a) {

        int[] gaps = {1, 3, 7};
        int k;
        for (int i = gaps.length - 1; i >= 0; i--) {
            int gap = gaps[i];

            for (int j = gap; j < a.length; j++) {

                int tmp = a[j];
                for (k = j; k >= gap && tmp < a[k - gap]; k -= gap) {
                    a[k] = a[k - gap];
                }
                a[k] = tmp;
            }
        }
    }
}
