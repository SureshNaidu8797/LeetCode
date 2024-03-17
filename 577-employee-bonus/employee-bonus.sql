# Write your MySQL query statement below
SELECT
 Employee.name,
 Bonus.bonus
FROM 
Employee LEFT JOIN Bonus ON 
    Employee.empId=Bonus.empId
WHERE
IFNULL(bonus,0)<1000;