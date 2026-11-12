package io.github.rxue.hashmap.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsTest {
    @Test
    void test_base() {
        assertTrue(new IsomorphicStrings().isIsomorphic("title","paper"));
    }
    @Test
    void test() {
        assertFalse(new IsomorphicStrings().isIsomorphic("badc","baba"));
    }
}
