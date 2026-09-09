-- Problem: Customers Who Never Order
-- Problem ID: 183
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 671 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

select name as Customers
from Customers
where id not in (select customerId from Orders);