# Write your MySQL query statement below
# we use SELF JOIN here

delete p1
from Person p1 inner join person p2
where p1.email = p2.email # we got duplicate emails
and p1.id > p2.id; # since p1 id is > , so delete it