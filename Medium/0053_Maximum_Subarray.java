/*
 * Problem: Maximum Subarray
 * Problem ID: 53
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 77.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-02
 */

class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Either start a new subarray or extend the previous one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the overall maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}