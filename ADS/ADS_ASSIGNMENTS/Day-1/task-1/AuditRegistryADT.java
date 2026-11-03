package com.day1.task_1;

public interface AuditRegistryADT<E> {
    void append(E element);
    void insertAt(int index, E element);
    E get(int index);
    E removeAt(int index);
    int indexOf(E element);
    int size();
    int capacity();
    boolean isEmpty();
    void trimToSize();
    void clear();
}
