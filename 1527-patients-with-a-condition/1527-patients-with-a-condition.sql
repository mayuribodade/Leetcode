# Write your MySQL query statement below
select *
from Patients
where conditions LIKE '% DIAB1%' || conditions LIKE 'DIAB1%'