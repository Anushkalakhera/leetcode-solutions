# Write your MySQL query statement below
select a.machine_id,round(avg(p.timestamp-a.timestamp),3) as processing_time 
from Activity as a
join Activity as p
on a.machine_id=p.machine_id and a.process_id=p.process_id
where a.activity_type='start'
And p.activity_type='end'
group by machine_id;