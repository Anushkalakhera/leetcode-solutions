# Write your MySQL query statement below
select name,COALESCE(SUM(r.distance),0) as travelled_distance
FROM Users u
LEFT JOIN Rides r
on u.id=r.user_id
GROUP BY u.id,u.name
ORDER BY travelled_distance Desc,
u.name asc;