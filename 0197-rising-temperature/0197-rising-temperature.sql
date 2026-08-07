# Write your MySQL query statement below
-- select w2.id
-- From Weather as w2
-- Join weather as w1
-- on DATEDIFF(w2.recordDate,w1.recordDate)=1
-- where w2.temperature>w1.temperature;



SELECT w2.id
FROM Weather w1
JOIN Weather w2
ON w2.recordDate = DATE_ADD(w1.recordDate, INTERVAL 1 DAY)
WHERE w2.temperature > w1.temperature;