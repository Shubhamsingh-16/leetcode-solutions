/*
 * Problem: Two Sum
 * Problem ID: 1
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 46.7 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> seen = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int [] {seen.get(complement), i};
            }
            seen.put(nums[i],i);
        }
        return new int [2];
    }
}