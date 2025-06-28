package io.github.rxue.practice;

public class DeliveryDivider {
    /**
     *
     * @param orders
     * @param batchSize how many orders per batch
     * @param delivers
     * @return
     */
    public static int[] divideOrders(int orders, int batchSize, int delivers) {
        int minOrderAmount = orders / delivers;
        if (orders % delivers != 0) minOrderAmount++;
        int leftOrders = orders;
        int[] result = new int[delivers];
        int i = 0;
        while (leftOrders > 0) {
            int currentMaxOrders = getMaxOrders(minOrderAmount, batchSize, leftOrders);
            result[i++] = currentMaxOrders;
            leftOrders -= currentMaxOrders;
        }
        return result;
    }
    private static int getMaxOrders(int minOrderAmount, int batchSize, int leftOrders) {
        for (int orderAmount = minOrderAmount; orderAmount <= leftOrders; orderAmount++) {
            if (orderAmount % batchSize == 0) return orderAmount;
        }
        return leftOrders;
    }
}
