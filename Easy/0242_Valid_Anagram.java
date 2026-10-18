/*
 * Problem: Valid Anagram
 * Problem ID: 242
 * Difficulty: Easy
 * Language: Java
 * Runtime: 223 ms
 * Memory: 47.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())return false;
       Map <Character , Integer> count = new HashMap<>();
       for(int i = 0 ; i< s.length() ; i++){
        count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
       }
       for(int i = 0 ; i< t.length();i++){
        if(!count.containsKey(t.charAt(i)))return false;
        if(count.get(t.charAt(i))<=0)return false;
        count.put(t.charAt(i), count.get(t.charAt(i))-1);
        System.out.println(count.get('c'));
       }
       return true;
    }
}