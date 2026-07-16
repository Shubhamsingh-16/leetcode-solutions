/*
 * Problem: Spiral Matrix
 * Problem ID: 54
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int lr = 0;
        int lc = 0;
        int ur = m - 1;
        int uc = n - 1;

        while (lr <= ur && lc <= uc) {

            // Left -> Right
            for (int i = lc; i <= uc; i++) {
                ans.add(matrix[lr][i]);
            }
            lr++;

            // Top -> Bottom
            for (int i = lr; i <= ur; i++) {
                ans.add(matrix[i][uc]);
            }
            uc--;

            // Right -> Left
            if (lr <= ur) {
                for (int i = uc; i >= lc; i--) {
                    ans.add(matrix[ur][i]);
                }
                ur--;
            }

            // Bottom -> Top
            if (lc <= uc) {
                for (int i = ur; i >= lr; i--) {
                    ans.add(matrix[i][lc]);
                }
                lc++;
            }
        }

        return ans;
    }
}