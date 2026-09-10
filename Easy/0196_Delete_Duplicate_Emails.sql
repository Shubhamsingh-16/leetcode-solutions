-- Problem: Delete Duplicate Emails
-- Problem ID: 196
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 829 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-10

Delete p from Person p Join Person s On p.email = s.email and p.id > s.id; 