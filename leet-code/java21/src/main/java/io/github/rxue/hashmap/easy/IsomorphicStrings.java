package io.github.rxue.hashmap.easy;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] asciiMap = new char[128];
        char[] asciiMapValue = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char currentMappedChar = asciiMap[currentChar];
            if (currentMappedChar == 0) {
                if (asciiMapValue[t.charAt(i)] != 0) return false;
                asciiMap[currentChar] = t.charAt(i);
                asciiMapValue[t.charAt(i)] = currentChar;
            } else if (t.charAt(i) != asciiMap[currentChar])
                return false;
        }
        return true;
    }
}
