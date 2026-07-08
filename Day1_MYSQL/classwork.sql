create database training;
use training;
create table tbl_employee(
eid integer,
empname varchar(50),
esalary integer
);
describe tbl_employee;
insert into tbl_employee(eid,empname,esalary) 
values (101,'Akhila',40000),
(102,'Ram',20000),
(103,'Shyam',30000),
(104,'James',30000);
select * from tbl_employee;
select eid,empname from tbl_employee;
insert into tbl_employee values(105,NULL,5000);
select * from tbl_employee where eid <> 104;
select empname from tbl_employee where esalary< 30000;
select eid,empname from tbl_employee where empname is null;
select eid,empname from tbl_employee where empname is not null;
select * from tbl_employee where eid in (101,103,106);
select * from tbl_employee where eid not in (101,103);
select * from tbl_employee where esalary between 10000 and 40000;
select * from tbl_employee where esalary not between 40000 and 10000;
select empname,eid from tbl_employee where empname like '_A%';
set sql_safe_updates=0;
update tbl_employee set esalary=0 where eid=102;
select * from tbl_employee
rollback;
delete from tbl_employee where empname is null;
select 'Akki',100+200 from tbl_employee;
ALTER table tbl_employee add column deptno Integer;

SELECT * from tbl_employee1;

rename table tbl_employee to  tbl_employee1;

ALTER TABLE tbl_employee drop column deptno;
SELECT distinct * from tbl_employee;

ALTER table tbl_employee rename column eid to empid;
truncate table tbl_employee;

drop table tbl_employee1;