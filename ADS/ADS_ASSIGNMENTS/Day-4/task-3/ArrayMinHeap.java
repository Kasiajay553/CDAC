package com.day4.task_3;

public class ArrayMinHeap { 
    private int[] heap; 
    private int size; 

    public ArrayMinHeap(int capacity) { 
        this.heap = new int[capacity]; 
        this.size = 0; 
    } 

    // Formulaic index calculations 
    private int parent(int i) { 
        return (i - 1) / 2; 
    } 

    private int leftChild(int i) { 
        return 2 * i + 1; 
    } 

    private int rightChild(int i) { 
        return 2 * i + 2; 
    } 

    private void swap(int i, int j) { 
        int temp = heap[i]; 
        heap[i] = heap[j]; 
        heap[j] = temp; 
    } 

    // Insert new element and bubble up: O(log n) 
    public void insert(int val) { 
        // 1. Check if array is full (throw exception or resize if necessary)
        // 2. Place val at heap[size] 
        // 3. Call siftUp(size) 
        // 4. Increment size 
    	if(size>=heap.length) {
    		throw new RuntimeException("heap is full");
    	}
    	heap[size]=val;
    	siftUp(size);
    	size++;
    } 

    private void siftUp(int i) { 
       
        // While i > 0 and heap[i] < heap[parent(i)], swap with parent and update i 
    	while(i>0 && heap[i]<heap[parent(i)]) {
    		swap(i,parent(i));
    		i=parent(i);
    	}
    } 

    // Remove and return smallest element: O(log n) 
    public int extractMin() { 
         
        // 1. If size == 0, throw IllegalStateException 
        // 2. Save root value heap[0] 
        // 3. Move last element to root: heap[0] = heap[size - 1] 
        // 4. Decrement size 
        // 5. Call siftDown(0) 
        // 6. Return saved root value 
    	if (size == 0) {
            throw new IllegalStateException("Heap is empty!");
        }
        int minVal = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return minVal;
       
    } 

    private void siftDown(int i) { 
       
        // 1. Find smallest among i, leftChild(i), and rightChild(i) within valid size bounds 
        // 2. If smallest is not i, swap heap[i] with smallest and recurse/loop siftDown 
    	int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            siftDown(smallest);
        }
    } 

    public int peekMin() { 
        if (size == 0) throw new IllegalStateException("Heap is empty!"); 
        return heap[0]; 
    } 

    public void display() { 
        System.out.print("Heap Array: ["); 
        for (int i = 0; i < size; i++) { 
            System.out.print(heap[i]); 
            if (i < size - 1) System.out.print(", "); 
        } 
        System.out.println("]"); 
    } 
}
