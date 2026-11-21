package io.github.rxue.intervals.medium;

import java.util.*;

class OwnSolution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <=1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] lastInterval = intervals[0];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            Optional<int[]> merged = tryMerge(lastInterval, intervals[i]);
            if (merged.isPresent()) {
                lastInterval = merged.get();
            } else {
                result.add(lastInterval);
                lastInterval = intervals[i];
            }
        }
        result.add(lastInterval);
        return result.toArray(new int[0][]);
    }
    private static Optional<int[]> tryMerge(int[] interval1, int[] interval2) {
        if (interval1[0] > interval2[0]) {
            return orderedMerge(interval2, interval1);
        }
        return orderedMerge(interval1, interval2);
    }
    private static Optional<int[]> orderedMerge(int[] intervalLeft, int[] intervalRight) {
        if (intervalLeft[1] >= intervalRight[0]) {
            return Optional.of(new int[]{intervalLeft[0], Math.max(intervalLeft[1],intervalRight[1])});
        }
        return Optional.empty();
    }
}
