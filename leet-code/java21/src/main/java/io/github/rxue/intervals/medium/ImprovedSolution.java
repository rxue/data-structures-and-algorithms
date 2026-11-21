package io.github.rxue.intervals.medium;

import java.util.*;

class ImprovedSolution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <=1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] lastInterval = intervals[0];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            Optional<int[]> merged = orderedMerge(lastInterval, intervals[i]);
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
    private static Optional<int[]> orderedMerge(int[] intervalLeft, int[] intervalRight) {
        if (intervalLeft[1] >= intervalRight[0]) {
            return Optional.of(new int[]{intervalLeft[0], Math.max(intervalLeft[1],intervalRight[1])});
        }
        return Optional.empty();
    }
}
