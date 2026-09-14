# Write your MySQL query statement below

#Why DATEDIFF matters: Always ensure you check that the dates are strictly consecutive (1 day apart).

select w1.id 
from Weather w1 inner join Weather w2
on datediff(w1.recordDate , w2.recordDate) = 1
where w1.temperature > w2.temperature;