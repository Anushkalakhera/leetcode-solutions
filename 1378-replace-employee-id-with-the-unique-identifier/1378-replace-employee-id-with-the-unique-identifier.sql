# Write your MySQL query statement below
select unique_id,name 
from employees
left JOIN EmployeeUNI
ON  employees.id=employeeUNI.id;