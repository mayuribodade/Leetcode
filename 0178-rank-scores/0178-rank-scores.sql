# Write your MySQL query statement below
SELECT score ,
Dense_Rank() over (order by score desc)
As "rank"
from Scores;