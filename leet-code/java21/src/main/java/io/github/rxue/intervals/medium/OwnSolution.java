package io.github.rxue.intervals.medium;

import java.util.*;

class OwnSolution {
    public int[][] tryToMerge(int[][] intervals) {
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

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        if (intervals.length == 0) {
            result.add(newInterval);
            return result.toArray(new int[0][]);
        }
        int[] mergedInterval = newInterval;
        boolean isMergeComplete = false;
        for (int[] currentInterval: intervals) {
            if (isMergeComplete) {
                result.add(currentInterval);
            } else if (mergedInterval != null) {
                if (mergedInterval[0] >= currentInterval[0]) {
                    Optional<int[]> mergeResultOpt = tryToMerge(currentInterval, mergedInterval);
                    if (mergeResultOpt.isPresent()) {
                        mergedInterval = mergeResultOpt.get();
                    } else {//merge failed
                        result.add(currentInterval);
                    }
                } else {
                    Optional<int[]> mergeResult = tryToMerge(mergedInterval, currentInterval);//corner: [3,7],[8,10]
                    if (isMergeComplete = mergeResult.isEmpty()) {
                        result.add(mergedInterval);
                        mergedInterval = null;
                        result.add(currentInterval);
                    } else {
                        mergedInterval = mergeResult.get();
                    }

                }
            }
        }
        if (mergedInterval != null) {
            result.add(mergedInterval);
        }
        return result.toArray(new int[0][]);
    }
    private static Optional<int[]> tryToMerge(int[] intervalLeft, int[] intervalRight) {
        if (intervalLeft[1] >= intervalRight[0]) {
            return Optional.of(new int[]{intervalLeft[0], Math.max(intervalLeft[1],intervalRight[1])});
        }
        return Optional.empty();
    }
}
