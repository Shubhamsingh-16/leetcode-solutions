-- Problem: Duplicate Emails
-- Problem ID: 182
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 442 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1; 