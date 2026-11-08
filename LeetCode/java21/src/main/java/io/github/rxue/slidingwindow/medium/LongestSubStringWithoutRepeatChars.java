package io.github.rxue.slidingwindow.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatChars {
    public int lengthOfLongestSubstring_myOwn(String s) {
        int longest = 0;
        StringBuilder currentSubString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);//abcdecf
            int charIndexInCurrentSubString = currentSubString.indexOf(currentChar+"");
            if (charIndexInCurrentSubString >= 0) {
                String newCurrentSubString = currentSubString
                        .substring(charIndexInCurrentSubString+1);
                currentSubString = new StringBuilder(newCurrentSubString);

            }
            currentSubString.append(currentChar);
            longest = Math.max(longest, currentSubString.length());
        }
        return longest;
    }

    /**
     * abcdc
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_withHashSet(String s) {
        Set<Character> slidingWindowChars = new HashSet<>();
        int maxLength = 0, leftIdx = 0, rightIdx = 0;
        boolean moveLeftEdge = false;
        while(rightIdx < s.length()) {
            var rightestChar = s.charAt(rightIdx);
            if (slidingWindowChars.contains(rightestChar)) {
                slidingWindowChars.remove(rightestChar);
                moveLeftEdge = true;
            } else {
                slidingWindowChars.add(rightestChar);
                rightIdx++;
            }
            if (moveLeftEdge) {
                for (; leftIdx < s.length(); leftIdx++) {
                    var leftestChar = s.charAt(leftIdx);
                    if (!slidingWindowChars.contains(leftestChar)) {
                        moveLeftEdge = false;
                        leftIdx++;
                        break;
                    } else {
                        slidingWindowChars.remove(leftestChar);
                    }
                }
            }
            maxLength = Math.max(slidingWindowChars.size(), maxLength);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstring_simplified(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0, leftIdx = 0, rightIdx = 0;
        while(rightIdx < s.length()) {
            var rightestChar = s.charAt(rightIdx);
            if (!set.contains(rightestChar)) {
                set.add(rightestChar);
                maxLength = Math.max(maxLength, set.size());
                rightIdx++;
            } else {
                set.remove(s.charAt(leftIdx));
                leftIdx++;
            }
        }
        return maxLength;
    }
}
