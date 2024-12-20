package org.leetcode.maxaverage;

public class MaxAverage {

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        if (nums == null || k == 0) {
            throw new IllegalArgumentException("Null nums input");
        }
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int length = nums.length;
        int start = 0; // Start of the sliding window
        int currentSum = 0; // Current sum of elements within the window

        for (int end = 0; end < length; end++) { // End of the sliding window
            currentSum += nums[end]; // Add the current element to the window sum

            // Check if the window has reached the desired size
            if (end >= (k - 1)) {
                // Update maxSum if the current window's sum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                // Slide the window by removing the element at the start
                currentSum -= nums[start];
                start++; // Move the start of the window forward
            }
        }
        // Calculate and return the maximum average by dividing maxSum by the window size
        return (double) maxSum / (double) k;
    }
}
