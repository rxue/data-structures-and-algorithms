package io.github.rxue.intervals.medium;

import java.util.*;

class ImprovedSolution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <=1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] lastInterval = intervals[0];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int[] merged = merge(lastInterval, intervals[i]);
            if (merged != lastInterval) {
                lastInterval = merged;
            } else {
                result.add(lastInterval);
                lastInterval = intervals[i];
            }
        }
        result.add(lastInterval);
        return result.toArray(new int[0][]);
    }
    private static int[] merge(int[] intervalLeft, int[] intervalRight) {
        if (intervalLeft[1] >= intervalRight[0]) {
            return new int[]{intervalLeft[0], Math.max(intervalLeft[1],intervalRight[1])};
        }
        return intervalLeft;
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        if (intervals.length == 0) {
            result.add(newInterval);
            return result.toArray(new int[0][]);
        }
        int[] mergedInterval = newInterval;
        for (int[] currentInterval: intervals) {
            if (mergedInterval == null) {
                result.add(currentInterval);
            } else {
                int[] mergeResult = null;
                if (currentInterval[0] < mergedInterval[0])
                    mergeResult = tryMerge(currentInterval, mergedInterval);
                else
                    mergeResult = tryMerge(mergedInterval, currentInterval);
                if (mergeResult == null) {//merge failure
                    if (currentInterval[0] < mergedInterval[0]) {
                        result.add(currentInterval);
                    } else {
                        result.add(mergedInterval);
                        result.add(currentInterval);
                        mergedInterval = null;
                    }
                } else {
                    mergedInterval = mergeResult;
                }
            }
        }
        if (mergedInterval != null)
            result.add(mergedInterval);
        return result.toArray(new int[0][]);
    }
    private static int[] tryMerge(int[] leftInterval, int[] rightInterval) {
        if (leftInterval[1] >= rightInterval[0]) {
            return new int[]{leftInterval[0], Math.max(leftInterval[1],rightInterval[1])};
        }
        return null;
    }
}
