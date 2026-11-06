package com.day6.task_3;


public class SimpleRehashingMap
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

    private Entry[] table;
    private int capacity;
    private int size;

    private static final double MAX_LOAD_FACTOR = 0.75;

    public SimpleRehashingMap(int initialCapacity)
    {
        this.capacity = initialCapacity;
        this.table = new Entry[capacity];
        this.size = 0;
    }

    private int hash(int key, int cap)
    {
        return Math.floorMod(key, cap);
    }

    /**
     * Inserts or updates a key-value pair.
     * Before inserting a new key, checks if (size + 1) / capacity >= MAX_LOAD_FACTOR.
     * If so, calls rehash() first.
     */
    public void put(int key, String value)
    {
        // TODO:
        // 1. Check if adding another element exceeds load factor:
        // if ((double)(size + 1) / capacity >= MAX_LOAD_FACTOR) -> call rehash()
        // 2. Compute initial index = hash(key, capacity)
        // 3. Probe linearly (index + i) % capacity:
        // a. If slot is null -> table[probe] = new Entry(key, value); size++; return;
        // b. If slot.key == key -> slot.value = value; return;

        int index = hash(key, capacity);

        for (int i = 0; i < capacity; i++)
        {
            int probe = (index + i) % capacity;

            if (table[probe] != null && table[probe].key == key)
            {
                table[probe].value = value;
                return;
            }
        }

        if ((double)(size + 1) / capacity >= MAX_LOAD_FACTOR)
        {
            rehash();
        }

        index = hash(key, capacity);

        for (int i = 0; i < capacity; i++)
        {
            int probe = (index + i) % capacity;

            if (table[probe] == null)
            {
                table[probe] = new Entry(key, value);
                size++;
                return;
            }
        }
    }

    /**
     * Doubles capacity and re-inserts all existing entries into the new table.
     */
    private void rehash()
    {
        // TODO:
        // 1. Save references to old capacity and old table:
        // int oldCapacity = capacity;
        // Entry[] oldTable = table;
        // 2. Double capacity: capacity = oldCapacity * 2;
        // 3. Allocate new table: table = new Entry[capacity];
        // 4. Reset size = 0;
        // 5. Print confirmation: ">> Rehashing: capacity doubled from " + oldCapacity + " to " + capacity
        // 6. Iterate through oldTable: if entry != null, call put(entry.key, entry.value)

        int oldCapacity = capacity;
        Entry[] oldTable = table;

        capacity = oldCapacity * 2;
        table = new Entry[capacity];
        size = 0;

        System.out.println(">> Rehashing: capacity doubled from " + oldCapacity + " to " + capacity);

        for (Entry entry : oldTable)
        {
            if (entry != null)
            {
                put(entry.key, entry.value);
            }
        }
    }

    /**
     * Retrieves value associated with key.
     */
    public String get(int key)
    {
        // TODO:
        // 1. Compute index = hash(key, capacity)
        // 2. Probe linearly: if slot is null return null; if slot.key == key return slot.value
        // 3. Return null if not found after capacity probes

        int index = hash(key, capacity);

        for (int i = 0; i < capacity; i++)
        {
            int probe = (index + i) % capacity;

            if (table[probe] == null)
            {
                return null;
            }

            if (table[probe].key == key)
            {
                return table[probe].value;
            }
        }

        return null;
    }

    public void display()
    {
        System.out.println(
            "Table (Size: " + size +
            ", Capacity: " + capacity +
            ", LF: " + String.format("%.2f", (double) size / capacity) +
            "):"
        );

        for (int i = 0; i < capacity; i++)
        {
            if (table[i] != null)
            {
                System.out.println(
                    " Slot " + i + ": [" +
                    table[i].key + " => " +
                    table[i].value + "]"
                );
            }
        }
    }
}

