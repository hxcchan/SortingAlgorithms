package com.imooc.selectionsort;

public class SelectionSort {
    public static void selectionSort(int[] data) {
        if (data == null || data.length == 1) {
            return;
        }

        int length = data.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (data[j] < data[i]) {
                    swap(data, i, j);
                }
            }
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {87, 93, 5, 6, 1, 23, 14, 2, 4, 35};
        SelectionSort.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
