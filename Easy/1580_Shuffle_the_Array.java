/*
 * Problem: Shuffle the Array
 * Problem ID: 1580
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int half = len/2;
        int ans [] = new int[len];
        for(int i = 0 ; i < half ; i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[half+i];
        }
        return ans;
    }
}