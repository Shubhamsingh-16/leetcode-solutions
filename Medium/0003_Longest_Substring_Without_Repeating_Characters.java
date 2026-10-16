/*
 * Problem: Longest Substring Without Repeating Characters
 * Problem ID: 3
 * Difficulty: Medium
 * Language: Java
 * Runtime: 75 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-10-16
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.length()==0||s.length()==1)return s.length();
        Set<Character> set = new HashSet<>();
        int r = 0 ;
        for(int l =0 ; l< s.length() ; l++){
            if(!set.contains(s.charAt(l)))set.add(s.charAt(l));
            else{
                ans = Math.max(ans , set.size());
                while(set.contains(s.charAt(l))){
                    set.remove(s.charAt(r));
                    r++;
                }
                set.add(s.charAt(l));
            }
            ans = Math.max(ans , set.size());
        }
        if(ans==0)return set.size();
        return ans;
    }
}