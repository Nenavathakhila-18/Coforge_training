create database schools;

use schools;

create table tbl_students(
studentId integer primary key,
name varchar(50),
age integer,
gender varchar(10),
city varchar(50)
);

insert into tbl_students values
(101,'Rahul',20,'Male','Hyderabad'),
(102,'Priya',19,'Female','Chennai'),
(103,'Arjun',21,'Male','Bengaluru'),
(104,'Sneha',20,'Female','Mumbai'),
(105,'Kiran',22,'Male','Pune');
select * from tbl_students;

select name,city from tbl_students;

select * from tbl_students where age>20;

select * from tbl_students where gender='female';

select * from tbl_students where city='Hyderabad';

SELECT * 
FROM tbl_students
ORDER BY name ASC;

SELECT * 
FROM tbl_students
ORDER BY age Desc;

SELECT * 
FROM tbl_students
ORDER BY city ASC, name ASC;

SELECT * 
FROM tbl_students
where age between 19 and 21;

SELECT *
FROM tbl_students
WHERE name LIKE 'R%';

SELECT *
FROM tbl_students
WHERE city LIKE '%i';

SELECT *
FROM tbl_students
WHERE age IN (20, 22);

update tbl_students
set city = 'Delhi'
where name = 'Rahul';

UPDATE tbl_students
SET age = age + 1
WHERE name = 'Arjun';

UPDATE tbl_students
SET city = 'Kolkata'
WHERE name = 'Sneha';

SELECT * FROM tbl_students;

DELETE FROM tbl_students
WHERE StudentID = 105;

DELETE FROM tbl_students
WHERE city = 'Chennai';