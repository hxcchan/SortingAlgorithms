package com.imooc.insertionsort;

public class InsertionSort {
    //常数级别的优化，对复杂度没有根本的改变。
    // O (n^2)
    public static <E extends Comparable<E>> void insertionSort(E[] data){
        for (int i = 0; i < data.length; i++) {
            E temp = data[i];
            int j;

            //比较j和j-1位置的数值，如果j-1位置的数值比data[i]大，就往后平移。
            //把大数向后平移
            for (j = i; j - 1 >= 0 && temp.compareTo(data[j - 1]) < 0 ; j--) {
                data[j] = data[j - 1];
            }
            data[j] = temp;
        }

    }

    public static <E extends Comparable<E>> void insertionSort2(E[] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j - 1 >= 0 && data[j].compareTo(data[j - 1]) < 0 ; j--) {
                swap(data, j, j - 1);
            }
        }

    }

    public static <E extends Comparable<E>> void insertionSort3(E[] data){
        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = i; j + 1 < data.length && data[j].compareTo(data[j + 1])  > 0; j ++) {
                swap(data, j, j + 1);
            }
        }

    }
    public static <E extends Comparable<E>> void insertionSort4(E[] data){
        for (int i = data.length - 1; i >= 0; i--) {
            E temp = data[i];
            int j = 0;

            //逆过程。把小的数向前平移。
            for (j = i; j + 1 < data.length && temp.compareTo(data[j + 1])  > 0; j ++) {
                data[j] = data[j + 1];
            }

            data[j] = temp;
        }

    }

    public static <E extends Comparable<E>> void swap(E[] data, int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

     public static void main(String[] args) {
        Integer[] array = {4, 5, 2, 1, 3};
        InsertionSort.insertionSort2(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
