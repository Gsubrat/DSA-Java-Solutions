package problems;

import java.util.*;

/**
 * Problem: Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Approach: Sliding Window with HashSet.
 * Maintain a window using two pointers and expand until a duplicate is found.
 * If duplicate exists, shrink the window from the left.
 *
 * Time Complexity: O(n), Space Complexity: O(n)
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}
