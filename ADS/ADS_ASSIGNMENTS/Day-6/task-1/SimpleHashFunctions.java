package com.day6.task_1;


public class SimpleHashFunctions
{
    /**
     * Maps an integer key to a bucket index within [0, tableSize - 1].
     * Handles negative keys safely.
     */
    public static int hashInt(int key, int tableSize)
    {
        // TODO:
        // 1. Compute remainder using Math.abs(key) % tableSize
        // 2. Return valid index
        return Math.floorMod(key, tableSize);
    }

    /**
     * Computes a bucket index for a String using Horner's Rule with prime multiplier 31.
     * Formula: hash = (hash * 31 + char)
     */
    public static int hashString(String key, int tableSize)
    {
        // TODO:
        // 1. Initialize int hash = 0
        // 2. Iterate through each character in the string:
        // hash = hash * 31 + key.charAt(i)
        // 3. Map to [0, tableSize - 1] using Math.abs(hash) % tableSize
        // 4. Return valid index

        int hash = 0;

        for (int i = 0; i < key.length(); i++)
        {
            hash = hash * 31 + key.charAt(i);
        }

        return Math.floorMod(hash, tableSize);
    }
}

