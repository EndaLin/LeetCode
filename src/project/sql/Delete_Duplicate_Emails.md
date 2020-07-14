# Delete Duplicate Emails
Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.

```text
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
```

Id is the primary key column for this table.
For example, after running your query, the above Person table should have the following rows:
```text
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+
```

#### Note:

Your output is the whole Person table after executing your sql. Use delete statement.

#### Solution
```sql
delete p1
from Person p1 inner join Person p2
where p1.Email like p2.Email and p1.Id > p2.id
```