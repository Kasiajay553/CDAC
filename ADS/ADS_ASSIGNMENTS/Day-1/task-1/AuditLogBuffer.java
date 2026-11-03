package com.day1.task_1;

public class AuditLogBuffer<E> implements AuditRegistryADT<E> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 4;

    public AuditLogBuffer() {
        this(DEFAULT_CAPACITY);
    }

    public AuditLogBuffer(int initialCapacity) {
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

   
    @Override
    public void append(E element) {
        ensureCapacity(size + 1);
        elements[size] = element;
        size++;
    }

    
    @Override
    public void insertAt(int index, E element) {
        checkInsertIndex(index);
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        checkAccessIndex(index);
        return (E) elements[index];
    }

    
    @SuppressWarnings("unchecked")
    @Override
    public E removeAt(int index) {
        checkAccessIndex(index);
        E removedItem = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        
        elements[--size] = null;
        return removedItem;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == null) {
                if (elements[i] == null) return i;
            } else {
                if (element.equals(elements[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public int size() { return size; }

    @Override
    public int capacity() { return elements.length; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void trimToSize() {
        if (size < elements.length) {
            int oldCap = elements.length;
            Object[] trimmed = new Object[size];
            System.arraycopy(elements, 0, trimmed, 0, size);
            elements = trimmed;
            System.out.printf(" --> [TRIMMED] Capacity compacted from %d down to %d\n", oldCap, size);
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int oldCapacity = elements.length;
            int newCapacity = (oldCapacity == 0) ? DEFAULT_CAPACITY : oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
            System.out.printf(" --> [RESIZED] Capacity expanded from %d to %d (size = %d)\n", 
                    oldCapacity, newCapacity, size);
        }
    }

    private void checkAccessIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index " + index + " for size " + size);
        }
    }

    private void checkInsertIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid insert index " + index + " for size " + size);
        }
    }
}
