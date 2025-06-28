package io.github.rxue.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeliveryDividerTest {
    @Test
    void divide() {
        assertTrue(Arrays.equals(new int[]{5, 5}, DeliveryDivider.divideOrders(10, 1, 2)));
    }
    @Test
    void divide2() {
        assertTrue(Arrays.equals(new int[]{4, 4, 2}, DeliveryDivider.divideOrders(10, 1, 3)));
    }

    @Test
    void divide3() {
        assertTrue(Arrays.equals(new int[]{6, 4, 0}, DeliveryDivider.divideOrders(10, 3, 3)));
    }
}
