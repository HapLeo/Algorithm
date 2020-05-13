package com.hapleow.algorithm.code;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 算法思想：相邻比较（小熊掰玉米）
 * 优化思路： 如果某个元素一次都没有交换，说明所有元素都已经有序，结束排序即可
 */
public class BubbleSort {

    /**
     * 基本的写法
     *
     * @param arr 待排序数组
     */
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 优化的排序写法
     * 优化点：如果给定数组的后半部分已经有序，则直接返回
     *
     * @param arr 待排序数组
     */
    public static void sortWithFlag(int[] arr) {

        int temp;
        boolean flag; // 已经有序
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                // 本轮没有发生交换，说明数组已经有序
                System.out.print("第" + (i + 1) + "个元素之后已经有序，结束排序。");
                break;
            }
        }
    }
}
