package io.github.rxue.medium;

import medium.AddTwoNumbers;
import medium.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestAddTwoNumbers {

    @Test
    void addsTwoSingleDigitNumbers() {
        ListNode result = new AddTwoNumbers().addTwoNumbers(new ListNode(2), new ListNode(3));

        assertEquals(5, result.val);
        assertNull(result.next);
    }
}
