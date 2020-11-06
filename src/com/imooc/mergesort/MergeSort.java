package com.imooc.mergesort;

import java.util.Arrays;

public class MergeSort {
    private MergeSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr) {

    }

    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        E[] temp = Arrays.copyOfRange(arr, l, r + 1); //前闭后开
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
            }
        }
    }
}
