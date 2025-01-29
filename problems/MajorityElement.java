package problems;

import java.util.*;

/**
 * Problem: Majority Element
 * Given an array of size n, find the element that appears more than ⌊n / 2⌋ times.
 *
 * Approach: Boyer-Moore Voting Algorithm.
 * - Maintain a candidate and a count.
 * - If the count is 0, choose a new candidate.
 * - If the current element matches the candidate, increment the count; otherwise, decrement it.
 *
 * Time Complexity: O(n), Space Complexity: O(1)
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Finding the majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Assign new candidate
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate; // The candidate is guaranteed to be the majority
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums)); // Output: 3
    }
}
