# Write your MySQL query statement below
select email as Email 
from Person
group By Email
having count(*)>1;