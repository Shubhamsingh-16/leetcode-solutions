/*
 * Problem: Kids With the Greatest Number of Candies
 * Problem ID: 1528
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = 0 ;
        for(int i : candies)max=(max<i)?i:max;
        for(int i = 0 ; i< len ; i++){
            if(candies[i]+extraCandies >= max)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}