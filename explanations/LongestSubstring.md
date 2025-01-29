# Longest Substring Without Repeating Characters
## Problem Statement
Given a string, find the length of the longest substring without repeating characters.

## Intuition
A brute-force O(n²) solution checks every substring.  
Instead, we use a **Sliding Window** approach.

## Approach
1. Use a **HashSet** to track unique characters.
2. Maintain two pointers (`left` and `right`).
3. Expand `right` while elements are unique.
4. If a duplicate is found, remove elements from `left` until unique.
5. Update max length.

## Complexity Analysis
- **Time Complexity:** O(n) → Each character is processed once.
- **Space Complexity:** O(n) → Stores characters in a HashSet.
