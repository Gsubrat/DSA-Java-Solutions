package problems;

import java.util.*;

/**
 * Problem: Two Sum
 * Given an array of integers and a target sum, find two numbers that add up to the target.
 *
 * Approach: Use a HashMap to store the numbers and their indices.
 * For each number, check if the complement (target - num) exists in the map.
 *
 * Time Complexity: O(n), Space Complexity: O(n)
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Found the pair
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // No valid pair found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target))); // Output: [0, 1]
    }
}
