# Second Highest Salary
Write a SQL query to get the second highest salary from the Employee table.
```text
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
```

For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

```text
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
```

#### Solution
```text
select Max(Salary) as SecondHighestSalary
from Employee
where salary < (select Max(Salary) from Employee)
```