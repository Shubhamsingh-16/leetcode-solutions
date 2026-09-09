-- Problem: Employees Earning More Than Their Managers
-- Problem ID: 181
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 1066 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

# Write your MySQL query statement below
select e.name  as Employee 
from Employee e 
where e.managerId is not null and e.salary > 
(select salary from Employee where id = e.managerId);
