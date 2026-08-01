# Write your MySQL query statement below
Select e.name  as Employee
from Employee as e
inner join Employee as m
on e.managerId=m.id
WHERE e.salary>m.salary;