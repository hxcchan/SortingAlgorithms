package com.imooc.selectionsort;

public class GenericSelectionSort{
    public static <E extends Comparable<E>> void selectionSort(E[] data) {
        if (data == null || data.length == 1) {
            return;
        }

        int length = data.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (data[j].compareTo(data[i]) < 0) {
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
        String[] arr = new String[] {"Mary", "Alison", "Song", "Einstein"};
        GenericSelectionSort.selectionSort(arr);
        for (String i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        Student stu1 = new Student("Mary", 98);
        Student stu2 = new Student("Alison", 72);
        Student stu3 = new Student("Song", 100);

        Student[] students = new Student[]{stu1, stu2, stu3};

        GenericSelectionSort.selectionSort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
