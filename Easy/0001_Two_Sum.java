/*
 * Problem: Two Sum
 * Problem ID: 1
 * Difficulty: Easy
 * Language: Java
 * Runtime: 45 ms
 * Memory: 46.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int x=0;x<nums.length-1; x++){
            for(int i=x+1; i<nums.length;i++){
                if(nums[x]+nums[i]==target)
                    return new int [] {x,i}; 
            }
        }
        return new int [] {-1,-1};
    }
}