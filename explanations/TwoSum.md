# Two Sum
## Problem Statement
Given an array of integers and a target sum, return indices of the two numbers such that they add up to the target.

## Intuition
Instead of using a nested loop (O(n²)), we can use a **HashMap** to store the elements and their indices.  
For each number, check if its complement (`target - num`) exists in the map.

## Approach
1. Create a `HashMap<Integer, Integer>`, storing numbers and their indices.
2. Iterate through the array:
    - Compute the complement: `target - nums[i]`.
    - If complement exists in the map, return indices.
    - Otherwise, add the current number to the map.
3. Return an empty array if no pair is found.

## Complexity Analysis
- **Time Complexity:** O(n) → Each number is processed once.
- **Space Complexity:** O(n) → Storing elements in a HashMap.
