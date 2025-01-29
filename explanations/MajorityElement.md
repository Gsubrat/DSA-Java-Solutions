# Majority Element Problem

## Problem Statement
Given an array of size `n`, find the element that appears more than `⌊n / 2⌋` times. This element is called the **majority element**.

## Approach: Boyer-Moore Voting Algorithm
The Boyer-Moore Voting Algorithm is an efficient way to find the majority element in linear time (`O(n)`) and constant space (`O(1)`). The algorithm works as follows:

1. **Initialize**:
    - A `candidate` variable to store the potential majority element.
    - A `count` variable to keep track of the candidate's frequency.

2. **Iterate through the array**:
    - If the `count` is `0`, assign the current element as the new `candidate`.
    - If the current element matches the `candidate`, increment the `count`.
    - Otherwise, decrement the `count`.

3. **Result**:
    - At the end of the iteration, the `candidate` will hold the majority element.

### Why It Works
The algorithm relies on the fact that the majority element appears more than half the time in the array. By canceling out non-majority elements with the majority element, the candidate that survives the process is guaranteed to be the majority element.