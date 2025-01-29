# Merge Intervals

## Problem Statement
You are given an array of `intervals` where each interval is represented as `[start, end]`.  
Your task is to merge all overlapping intervals and return an array of the **non-overlapping** intervals that cover all the intervals in the input.

---

## **Explanation:**
- The intervals `[1,4]` and `[4,5]` overlap because `4` is shared. So we merge them into `[1,5]`.

---

## **Intuition**
- We need to **merge** intervals that overlap.
- **Sorting** the intervals helps us process them in order and detect overlaps easily.
- If two intervals overlap, we **merge them** by updating the end time of the first interval.
- If they do not overlap, we store the current interval and move to the next one.

---

## **Approach**
### **Step 1: Sort the Intervals**
- First, we sort the intervals based on their **start time** (`intervals[i][0]`).
- Sorting ensures that overlapping intervals are adjacent in the list.

### **Step 2: Initialize a Result List**
- Create an empty list `merged` to store the merged intervals.

### **Step 3: Iterate Through the Sorted Intervals**
- Start with the first interval and compare it with the next interval:
    - If the **current interval overlaps** with the next one (`intervals[i][0] ≤ previousEnd`), merge them by updating the end time (`max(previousEnd, intervals[i][1])`).
    - Otherwise, add the current interval to the result list and move to the next.

### **Step 4: Return the Merged Intervals**
- After iterating through all intervals, return the `merged` list.

---

## Complexity Analysis
- **Time Complexity:** O(n log n) → Sorting dominates.
- **Space Complexity:** O(n) → Storing merged intervals.

