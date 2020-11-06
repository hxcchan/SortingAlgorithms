package com.imooc.selectionsort;

public class SelectionSort2 {
    public static <E extends Comparable<E>> void selectionSort(E[] data){

        int length = data.length;

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (data[j].compareTo(data[i]) > 0) {
                    swap(data, i, j);
                }
            }
        }

    }

    private static <E extends Comparable<E>> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {87, 93, 5, 6, 1, 23, 14, 2, 4, 35};
        SelectionSort2.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
