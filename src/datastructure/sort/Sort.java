package datastructure.sort;

public interface Sort<AnyType extends Comparable<? super AnyType>> {
    void sort(AnyType[] a);
}
