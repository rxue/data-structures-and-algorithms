package io.github.rxue.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubStringWithoutRepeatCharsTest {
    @Test
    public void test_example1() {
        assertEquals(3, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_myOwn("abcabcbb"));
    }
    @Test
    public void test_example2() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_myOwn("bbbbbb"));
    }
    @Test
    public void test_one_string() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_myOwn("s"));
    }
    @Test
    public void test_optimized_example1() {
        assertEquals(3, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_withHashSet("abcabcbb"));
    }
    @Test
    public void test_optimized_example2() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_withHashSet("bbbbbb"));
    }
    @Test
    public void test_optimized_case3() {
        assertEquals(3, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_withHashSet("pwwkew"));
    }
    @Test
    public void test_optimized_one_string() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_withHashSet("s"));
    }
    @Test
    public void test_hash_simplified_example1() {
        assertEquals(3, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_simplified("abcabcbb"));
    }
    @Test
    public void test_hash_simplified_example2() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_simplified("bbbbbb"));
    }
    @Test
    public void test_hash_simplified_case3() {
        assertEquals(3, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_simplified("pwwkew"));
    }
    @Test
    public void test_hash_simplified_string() {
        assertEquals(1, new LongestSubStringWithoutRepeatChars().lengthOfLongestSubstring_simplified("s"));
    }
}
