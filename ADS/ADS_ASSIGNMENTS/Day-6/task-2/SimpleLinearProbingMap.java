package com.day6.task_2;


public class SimpleLinearProbingMap
{
    static class Entry
    {
        int key;
        String value;

        Entry(int key, String value)
        {
            this.key = key;
            this.value = value;
        }
    }

    // Sentinel object representing a deleted slot
    private static final Entry TOMBSTONE =
        new Entry(Integer.MIN_VALUE, "<DELETED>");

    private final Entry[] table;
    private final int capacity;
    private int size;

    public SimpleLinearProbingMap(int capacity)
    {
        this.capacity = capacity;
        this.table = new Entry[capacity];
        this.size = 0;
    }

    private int hash(int key)
    {
        return Math.floorMod(key, capacity);
    }

    /**
     * Inserts or updates a key-value pair.
     * Probes sequentially: (hash + i) % capacity
     * - Reuses the first TOMBSTONE slot encountered if the key does not already exist.
     * - If key already exists, updates its value.
     */
    public void put(int key, String value)
    {
        // TODO:
        // 1. Compute initial index = hash(key)
        // 2. Track firstTombstone index (-1 by default)
        // 3. Loop up to capacity times with probe index: (index + i) % capacity
        // a. If slot is null:
        // - target = (firstTombstone != -1) ? firstTombstone : probeIndex
        // - table[target] = new Entry(key, value); size++; return;
        // b. If slot is TOMBSTONE:
        // - if firstTombstone == -1, record this slot: firstTombstone = probeIndex
        // c. If slot != TOMBSTONE and slot.key == key:
        // - slot.value = value; return;
        // 4. If table scanned and firstTombstone != -1:
        // - table[firstTombstone] = new Entry(key, value); size++; return;
        // 5. Otherwise throw new IllegalStateException("Table is full");

        int index = hash(key);
        int firstTombstone = -1;

        for (int i = 0; i < capacity; i++)
        {
            int probeIndex = (index + i) % capacity;
            Entry slot = table[probeIndex];

            if (slot == null)
            {
                int target = (firstTombstone != -1)
                    ? firstTombstone
                    : probeIndex;

                table[target] = new Entry(key, value);
                size++;
                return;
            }

            if (slot == TOMBSTONE)
            {
                if (firstTombstone == -1)
                {
                    firstTombstone = probeIndex;
                }
            }
            else if (slot.key == key)
            {
                slot.value = value;
                return;
            }
        }

        if (firstTombstone != -1)
        {
            table[firstTombstone] = new Entry(key, value);
            size++;
            return;
        }

        throw new IllegalStateException("Table is full");
    }

    /**
     * Looks up value by key.
     * Continues probing across TOMBSTONE slots. Stops only at null or after capacity probes.
     */
    public String get(int key)
    {
        // TODO:
        // 1. Compute initial index = hash(key)
        // 2. Loop up to capacity times with probe index: (index + i) % capacity
        // a. If slot is null -> return null (key does not exist)
        // b. If slot != TOMBSTONE and slot.key == key -> return slot.value
        // 3. Return null if not found after full scan

        int index = hash(key);

        for (int i = 0; i < capacity; i++)
        {
            int probeIndex = (index + i) % capacity;
            Entry slot = table[probeIndex];

            if (slot == null)
            {
                return null;
            }

            if (slot != TOMBSTONE && slot.key == key)
            {
                return slot.value;
            }
        }

        return null;
    }

    /**
     * Deletes an entry by key using a Tombstone marker.
     *
     * @return true if key was found and removed, false otherwise
     */
    public boolean remove(int key)
    {
        // TODO:
        // 1. Compute initial index = hash(key)
        // 2. Loop up to capacity times with probe index: (index + i) % capacity
        // a. If slot is null -> return false (key not present)
        // b. If slot != TOMBSTONE and slot.key == key:
        // - Set table[probeIndex] = TOMBSTONE
        // - Decrement size--
        // - Return true
        // 3. Return false if not found after full scan

        int index = hash(key);

        for (int i = 0; i < capacity; i++)
        {
            int probeIndex = (index + i) % capacity;
            Entry slot = table[probeIndex];

            if (slot == null)
            {
                return false;
            }

            if (slot != TOMBSTONE && slot.key == key)
            {
                table[probeIndex] = TOMBSTONE;
                size--;
                return true;
            }
        }

        return false;
    }

    public void display()
    {
        System.out.println("--- Table State (Size: " + size + "/" + capacity + ") ---");

        for (int i = 0; i < capacity; i++)
        {
            if (table[i] == null)
            {
                System.out.println("Slot " + i + ": [ EMPTY ]");
            }
            else if (table[i] == TOMBSTONE)
            {
                System.out.println("Slot " + i + ": [ TOMBSTONE ]");
            }
            else
            {
                System.out.println("Slot " + i + ": [" + table[i].key + " => " + table[i].value + "]");
            }
        }
    }
}

