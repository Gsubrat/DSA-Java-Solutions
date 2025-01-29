package problems;

import java.util.*;

/**
 * Problem: Merge Intervals
 * Given a list of intervals, merge all overlapping intervals.
 *
 * Approach: Sort the intervals by start time.
 * Iterate through the sorted list, merging overlapping intervals.
 *
 * Time Complexity: O(n log n), Space Complexity: O(n)
 */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]); // Merge intervals
            } else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
        // Output: [[1,6], [8,10], [15,18]]
    }
}
