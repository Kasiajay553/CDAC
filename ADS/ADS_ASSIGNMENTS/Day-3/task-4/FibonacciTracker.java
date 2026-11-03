package com.day3.task_4;

import java.util.Arrays;

public class FibonacciTracker {
    private int naiveCalls = 0;
    private int memoCalls = 0;
    private int[] memo;

    /**
     * Naive recursive Fibonacci: O(2^n) time complexity.
     * Counts every function invocation.
     */
    public int fibNaive(int n) {
        naiveCalls++;
        
        // Base Case: if n <= 1 return n
        if (n <= 1) {
            return n;
        }
        
        // Recursive Step: return fibNaive(n - 1) + fibNaive(n - 2)
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    /**
     * Top-Down Memoized recursive Fibonacci: O(n) time complexity.
     * Reuses previously calculated subproblem results from an array.
     */
    public int fibMemo(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memoCalls = 0;
        return fibMemoHelper(n);
    }

    private int fibMemoHelper(int n) {
        memoCalls++;
        
        // 1. Base Case: if n <= 1 return n
        if (n <= 1) {
            return n;
        }
        
        // 2. Cache Hit: if memo[n] != -1 return memo[n]
        if (memo[n] != -1) {
            return memo[n];
        }
        
        // 3. Compute and store: memo[n] = fibMemoHelper(n - 1) + fibMemoHelper(n - 2)
        memo[n] = fibMemoHelper(n - 1) + fibMemoHelper(n - 2);
        
        // 4. Return memo[n]
        return memo[n];
    }

    public int getNaiveCalls() { return naiveCalls; }
    public int getMemoCalls() { return memoCalls; }
    public void resetNaiveCalls() { naiveCalls = 0; }
}
