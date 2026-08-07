# Write your MySQL query statement below
select name,sum(amount) as balance 
from Users
join Transactions
on Users.account=Transactions.account
group by Transactions.account
having sum(amount)>10000;