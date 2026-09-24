# Write your MySQL query statement below
select query_name ,
round( avg(rating/position),2) as quality,
round( sum(rating<3)/count(*) * 100  , 2 )as poor_query_percentage 
# count(*)  gives no. of rows as per group like cat has 3  
# and rating also as perr group

from Queries
group by query_name