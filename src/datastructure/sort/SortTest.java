package datastructure.sort;

import datastructure.PrintUtils;

public class SortTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{34, 8, 64, 51, 32, 21};
        Sort<Integer> sort = new HeapSort();
        sort.sort(a);
        Integer aa = 1;
        Integer bb = 2;
        System.out.println(aa.compareTo(bb));
        PrintUtils.printArray(a);
    }
}
