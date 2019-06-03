package datastructure.sort;

import datastructure.PrintUtils;

public class ShellSort {
    public static void shellSort(Integer[] array) {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) { //需要注意的是，这里array[j] < temp将会使数组从大到小排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{34, 8, 64, 51, 32, 21};
        shellSort(a);
        PrintUtils.printArray(a);
    }
}
