-- Problem: Employees Earning More Than Their Managers
-- Problem ID: 181
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 392 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-09-09

SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;