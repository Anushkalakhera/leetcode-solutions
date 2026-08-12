# Write your MySQL query statement below
SELECT contest_id,
round(
    count(user_id)*100.0/(select count(*) from Users),
    2
) as percentage
FROM Register
GROUP BY contest_id
order by percentage desc,contest_id asc;