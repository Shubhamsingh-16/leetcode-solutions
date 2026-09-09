-- Problem: Customers Who Never Order
-- Problem ID: 183
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 547 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

# Write your MySQL query statement below
Select c.name as Customers 
From Customers c Left Join 
Orders o on 
c.id = o.customerId where o.customerId is null;