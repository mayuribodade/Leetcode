# Write your MySQL query statement below
select c.name as Customers
from Customers c
where not exists(
    select *
    from  orders o
    where c.id = o.customerid
);