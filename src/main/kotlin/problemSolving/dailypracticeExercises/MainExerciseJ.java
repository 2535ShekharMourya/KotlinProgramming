package problemSolving.dailypracticeExercises;

public class MainExerciseJ {

    public static void main(String[] args) {


    }
}
// Set
// Exercise 1: Find Common Elements Create a method that finds common elements between two HashSets of strings and returns them in a new HashSet.
// val setA = hashSetOf("apple", "banana", "cherry", "date")
//  val setB = hashSetOf("banana", "date", "fig", "grape")
//
//
//Exercise 2: Word Frequency Counter Build a program that reads a sentence to store unique words, then prints how many unique words were found.
//// Input: "the quick brown fox jumps over the lazy dog"
//// Output: 8 unique words
//
//Exercise 5: Set Operations Implement methods to perform mathematical set operations using HashSet:
//Union (combine two sets)
//Intersection (common elements)
//Difference (elements in first set but not in second)
//Symmetric difference (elements in either set but not in both)
//Exercise : Duplicate Character Detector Write a program that finds all duplicate characters in a string using HashSet. Use one HashSet to track seen characters and another to store duplicates.
//// Input: "programming"
//// Output: Duplicate characters: [r, g, m]
//// Hint: Use two HashSets - one for seen chars, one for duplicates
//
//Exercise 7: Anagram Groups Given an array of strings, group anagrams together using HashSet. Two strings are anagrams if they contain the same characters with the same frequency.
//// Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//// Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
//// Tip: Sort characters in each word to create a key
//Exercise 9: Email Domain Extractor Write a program that extracts unique email domains from a list of email addresses using HashSet.

/// / Input: ["john@gmail.com", "jane@yahoo.com", "bob@gmail.com", "alice@hotmail.com"]
/// / Output: Unique domains: [gmail.com, yahoo.com, hotmail.com]


// Map
//1. Word Frequency Counter
//👉 Count how many times each word appears in a string. And Find the highest/lowest frequency element
//Input: "hello world hello java"
//Output: {hello=2, world=1, java=1}
//        2. First Non-Repeating Character
//👉 Find the first non-repeating character in a string using HashMap.
//        Input: "swiss"
//Output: "w"
//
//
//
//
//        3. Check for Anagrams
//👉 Given two strings, check if they are anagrams using a HashMap.
//Input: "listen", "silent"
//Output: true
//
//        4. Find Duplicate Elements in Array
//👉 Use HashMap to find duplicates in an array and their counts.
//        Input: [1,2,2,3,4,4,4]
//Output: {2=2, 4=3}
//        5. Two Sum Problem
//👉 Given an array and a target, find two numbers whose sum = target using HashMap.
//Input: nums=[2,7,11,15], target=9
//Output: [0,1] (because nums[0]+nums[1]=9)
//
//
//        6. Longest Substring Without Repeating Characters
//Find the length of the longest substring without repeating characters using HashMap to track character positions.
//// Example: "abcabcbb" → 3 ("abc"), s = "pwwkew" → 3 ("wke" or "kew"),  s = "bbbbb" →1 ("b")
//        7. Word Pattern Matching
//Check if a string follows a specific pattern using HashMap for bidirectional mapping.
//kotlin
//// Example: pattern = "abba", s = "dog cat cat dog" → true
