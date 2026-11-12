package io.github.rxue.easy;

import io.github.rxue.arraystring.easy.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {
    @Test
    void removeElement_example1() {
        int[] nums = {3,2,2,3};
        int resultCounter = new RemoveElement().removeElement(nums, 3);
        assertArrayEquals(new int[]{2,2,0,0}, nums);
        assertEquals(2, resultCounter);
    }
}
