/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int[][] merge(int[][] intervals) {
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        java.util.List<Interval> mergedintervals = new java.util.ArrayList<>();

        int startInterval = intervals[0][0];
        int endInterval = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (endInterval >= intervals[i][0] && endInterval >= intervals[i][1]) {
                continue;
            } else if (endInterval >= intervals[i][0] && endInterval < intervals[i][1]) {
                endInterval = intervals[i][1];
            } else {
                mergedintervals.add(new Interval(startInterval, endInterval));
                startInterval = intervals[i][0];
                endInterval = intervals[i][1];
            }
        }
        mergedintervals.add(new Interval(startInterval, endInterval));

        int[][] _2DArray = new int[mergedintervals.size()][2];
        for (int i = 0; i < mergedintervals.size(); i++) {
            _2DArray[i][0] = mergedintervals.get(i).start;
            _2DArray[i][1] = mergedintervals.get(i).end;
        }
        return _2DArray;

    }

}

// @lc code=end
