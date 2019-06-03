package datastructure.sort;

import datastructure.PrintUtils;

public class BubbleSort {
    public static <AnyType extends Comparable<? super AnyType>> void bubbleSort(AnyType[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                AnyType tmp = a[i];
                if (tmp.compareTo(a[j]) > 0) {
                    a[i] = a[j];
                    a[j] = tmp;
                }
                PrintUtils.printArray((Integer[]) a);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{34, 8, 64, 51, 32, 21};
        bubbleSort(a);
        PrintUtils.printArray(a);
    }
}
