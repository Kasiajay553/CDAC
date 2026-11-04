package com.day5.task_2;

public class QuadraticSorting {
    /**
     * Sorts array in-place using Selection Sort.
     * Time Complexity: O(n^2) Best, Average, and Worst cases.
     * Space Complexity: O(1) auxiliary memory.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
      for(int i=0;i<=n-2;i++) {
    	  int minIdx =i;
    	  for(int j=i+1;j<=n-1;j++) {
    		  if(arr[j]<arr[minIdx]) {
    			  minIdx =j;
    			  
    		  }
    	  }
    	  int temp=arr[minIdx];
    	  arr[minIdx]=arr[i];
    	  arr[i]=temp;
      }
        // 1. Outer loop from i = 0 to n - 2
        // 2. Assume minIdx = i
        // 3. Inner loop from j = i + 1 to n - 1:
        //    If arr[j] < arr[minIdx], update minIdx = j
        // 4. Swap arr[minIdx] with arr[i]
    }

    /**
     * Sorts array in-place using Insertion Sort.
     * Time Complexity: O(n) Best (already sorted), O(n^2) Average/Worst.
     * Space Complexity: O(1) auxiliary memory.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<=n-1;i++) {
        	int key=arr[i];
        	
        			int j=i-1;
        			while(j>=0&& arr[j]>key) {
        				arr[j+1]=arr[j];
        				j--;
        			}
        			arr[j+1]=key;
        }
        // TODO:
        // 1. Outer loop from i = 1 to n - 1
        // 2. Set key = arr[i], j = i - 1
        // 3. Shift elements of arr[0..i-1] that are greater than key one position right:
        //    while (j >= 0 && arr[j] > key) { arr[j + 1] = arr[j]; j--; }
        // 4. Place key at arr[j + 1]
    }
}

