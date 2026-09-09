-- Problem: Combine Two Tables
-- Problem ID: 175
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 476 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

# Write your MySQL query statement below
Select p.firstName , p.lastName , a.city , a.state from Person p Left Join Address a on p.personid = a.personId; 