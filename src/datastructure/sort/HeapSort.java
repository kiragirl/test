package datastructure.sort;

/**
 * 堆排序
 */
public class HeapSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        /* buildHeap */
        for (int i = a.length / 2 - 1; i >= 0; i--)
            percolateDown(a, i, a.length);
        /* deleteMax */
        for (int i = a.length - 1; i > 0; i--) {
            swapReferences(a, 0, i);
            percolateDown(a, 0, i);
        }
    }

    /**
     * Internal method for heapsort.
     *
     * @param i the index of an item in the heap.
     * @return the index of the left child.
     */
    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    /**
     * Internal method for heapsort that is used in deleteMax and buildHeap.
     *
     * @param a an array of Comparable items.
     * @index i the position from which to percolate down.
     * @int n the logical size of the binary heap.
     */
    private static <AnyType extends Comparable<? super AnyType>> void percolateDown(AnyType[] a, int i, int n) {
        int child;
        AnyType tmp;

        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && a[child].compareTo(a[child + 1]) < 0)
                child++;
            if (tmp.compareTo(a[child]) < 0)
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    /**
     * Method to swap to elements in an array.
     *
     * @param a      an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static <AnyType> void swapReferences(AnyType[] a, int index1, int index2) {
        AnyType tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
}
