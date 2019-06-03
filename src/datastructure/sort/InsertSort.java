package datastructure.sort;

import datastructure.PrintUtils;

public class InsertSort {
    public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType[] a) {
        for (int p = 1; p < a.length; p++) {
            AnyType tmp = a[p];
            for (int j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
                a[j - 1] = tmp;
            }
            PrintUtils.printArray((Integer[]) a);
        }
    }


    public static void main(String[] args) {
        Integer[] a = new Integer[]{34, 8, 64, 51, 32, 21};
        Integer[] b = new Integer[]{34, 8, 64, 51, 32, 21};
        PrintUtils.printArray(a);
        insertionSort(a);
        PrintUtils.printArray(a);
        System.out.println("insertion sort end ");
        PrintUtils.printArray(b);
    }
}
