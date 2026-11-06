package com.day6.task_4;


import java.util.HashMap;
import java.util.Map;

public class WordFrequencyAnalyzer
{
    /**
     * Cleans input text, tokenizes into words, and counts frequencies using a HashMap.
     */
    public static Map<String, Integer> countWords(String text)
    {
        Map<String, Integer> freq = new HashMap<>();

        // TODO:
        // 1. Normalize text: lowercase and strip punctuation
        // String cleaned = text.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
        // 2. Tokenize by splitting on whitespace: cleaned.split("\\s+")
        // 3. For each word token:
        // - if word is not empty, increment count using freq.getOrDefault(word, 0) + 1
        // 4. Return freq map

        String cleaned = text.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

        String[] words = cleaned.split("\\s+");

        for (String word : words)
        {
            if (!word.isEmpty())
            {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        return freq;
    }

    /**
     * Finds the entry with the highest frequency count.
     */
    public static String findMostFrequent(Map<String, Integer> freq)
    {
        // TODO:
        // 1. Iterate through freq.entrySet()
        // 2. Track the key with the highest value
        // 3. Return string in format: "<word> (<count> times)"

        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet())
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        if (mostFrequent.isEmpty())
        {
            return "";
        }

        return mostFrequent + " (" + maxCount + " times)";
    }
}

