package com.day5.task_1;

public class SearchingAlgorithms {
    /**
     * Linearly scans array from left to right.
     * Works on unsorted arrays.
     * Time Complexity: O(n) worst/average, O(1) best.
     *
     * @return index of target if found; -1 otherwise
     */
    public static int linearSearch(int[] arr, int target) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==target) {
    			return i;
    		}
    	}
        // Iterate through array from index 0 to arr.length - 1
        // If arr[i] == target, return i
        // If loop completes without match, return -1
        return -1;
    }

    /**
     * Iterative Binary Search on a sorted array.
     * Time Complexity: O(log n) worst/average, O(1) best.
     *
     * @return index of target if found; -1 otherwise
     */
    public static int binarySearch(int[] arr, int target) {
        int low =0;
        int high =arr.length-1;
        while(low<=high) {
        	int mid =low+(high-low)/2;
        	if(arr[mid]==target) {
        		return mid;
        	}
        	if(arr[mid]<target) {
        		low = mid + 1;
        	} else  {
        		high = mid - 1;
        	}
        }
        // 1. Initialize low = 0, high = arr.length - 1
        // 2. While low <= high:
        //    a. Calculate safe mid = low + (high - low) / 2
        //    b. If arr[mid] == target, return mid
        //    c. If arr[mid] < target, prune left: low = mid + 1
        //    d. Else prune right: high = mid - 1
        // 3. Return -1 if not found
        return -1;
    }
}

