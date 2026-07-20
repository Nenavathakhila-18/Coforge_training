use training;

create table tbl_emp(
eid integer,
ename varchar(50),
esal integer,
dno integer
);

describe tbl_emp;

insert into tbl_emp values
(101,'Ramesh',10000,10),
(102,'Suresh',20000,20),
(103,'Ramu',30000,10),
(104,'Naresh',40000,20);

select * from tbl_emp;

select dno , count(*) as "Total number of employees" from tbl_emp group by dno;

select dno,sum(esal),avg(esal),min(esal),max(esal) from tbl_emp group by dno;

select dno,sum(esal),avg(esal),min(esal),max(esal) from tbl_emp group by dno having min(esal) > 10000;

select dno,sum(esal),avg(esal),min(esal),max(esal) from tbl_emp group by dno order by dno desc;

select * from tbl_emp order by eid desc;

-- subquery

create table tbl_dept(
dno integer,
dname varchar(50));

insert into tbl_dept values(10,"Devlopment"),(20,"Testing");

select * from tbl_dept;

select dname from tbl_dept where dno=(select dno from tbl_emp where eid=101);

select * from tbl_emp where dno in (select dno from tbl_dept where dname = 'testing');

select dname from tbl_dept where dno=(select dno from tbl_emp where ename = 'Ramesh');

select dname from tbl_dept where dno in (select dno from tbl_emp where eid=101 or eid=102);

drop table tbl_emp;

create table tbl_emp(
eid integer primary key,
ename varchar(50) not null,
esal integer check(esal>0),
email varchar(50) unique,
dno integer
);

insert into tbl_emp values(101,'Ramesh',10000,'ramesh@gmail.com',10),
(102,'Suresh',20000,'suresh@gmail.com',20),
(103,'Ramu',30000,'ramu@gmail.com',10),
(104,'Naresh',40000,'naresh@gmail.com',20);

drop table tbl_emp;
drop table tbl_dept;
drop table tbl_empp;

create table tbl_dept(dno integer primary key,dname varchar(20));

create table tbl_empp(
eid integer primary key,
ename varchar(50) not null,
esal integer check(esal>0),
dno integer ,foreign key(dno) references tbl_dept(dno)
);

insert into tbl_dept values(10,'dev');
insert into tbl_dept values(20,'testing');
insert into tbl_empp values(101,'Ramesh',10000,10);

DELIMITER //
CREATE PROCEDURE insertemployee(
    IN peid INT,
    IN pename VARCHAR(20),
    IN pesal INT,
    IN pdno INT
)
BEGIN
    INSERT INTO tbl_empp(eid, ename, esal, dno)
    VALUES (peid, pename, pesal, pdno);
END //

call insertemployee(101,'Ramesh',3000,10);
drop procedure insertemployee;

select * from tbl_dept;

DELIMITER //

CREATE PROCEDURE getemployeeName(
    IN eid INT,
    OUT empname VARCHAR(20)
)
BEGIN
    SELECT ename
    INTO empname
    FROM tbl_empp
    WHERE tbl_empp.eid = eid;
END //
DELIMITER ;

call getemployeeName(106,@empname);
select @empname as ename;

DELIMITER //
create function getempname(in empid integer) return varchar(20) deterministic
begin
declare empname varchar(20);
select ename into empname from tbl_empp where eid=empid;
return empname;
end //
DELIMITER ;

DELIMITER //
CREATE FUNCTION getempname(empid INT)
RETURNS VARCHAR(20) 
DETERMINISTIC
BEGIN
    DECLARE empname VARCHAR(20);

    SELECT ename
    INTO empname
    FROM tbl_empp
    WHERE eid = empid;

    RETURN empname;
END //
DELIMITER ;

SELECT getempname(101);

create table agents(
aid integer,
aname varchar(50),
acity varchar(50));

insert into agents values(101,'a1','chennai'),
(102,'a1','chennai'),
(103,'a2','Banglore'),
(104,'a3','banglore');

create table customer(
cid integer,
cname varchar(20),
ccity varchar(20));
insert into customer values(01,'c1','chennai'),
(02,'c2','chennai'),
(03,'c3','chennai'),
(04,'c4','banglore'),
(05,'c5','banglore');

select agents.aname, customer.cname, customer.ccity
from agents, customer where agents.acity = customer.ccity;

select agents.aname, customer.cname, customer.ccity
from agents join customer on agents.acity <> customer.ccity;

select * from agents left outer join customer on agents.acity =
customer.ccity;

 select * from agents right outer join customer on agents.acity =
customer.ccity;

select * from agents full outer join customer on agents.acity=
customer.ccity;




