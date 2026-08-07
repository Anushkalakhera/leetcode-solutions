# Write your MySQL query statement below
select name,sum(amount) as balance 
from Users
join Transactions
on Users.account=Transactions.account
group by users.account,users.name
having sum(amount)>10000;