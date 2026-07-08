CREATE DATABASE EmployeeManagement;
USE EmployeeManagement;

CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);

INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

select * from department;

CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);

INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

-- basic queries 
select * from employee
select Empname,Salary from employee where Salary > 50000;
select Empname,Age from employee where Age > 30;

-- where clause
SELECT *FROM Employee WHERE DeptID = 103;
select Empname,gender from employee where Gender='Female';
select Empname,HireDate from employee where Hiredate > '2022-01-01';

-- order by
select Empname,Salary from employee order by Salary desc;
select Empname from employee order by Empname;

-- Aggregate Functions
select count(*) from employee;
select max(Salary) from employee;
select min(Salary) from employee;
select avg(Salary) from employee;
select sum(Salary) from employee;

-- GROUP BY
select count(Empname) from employee group by DeptId;
select DeptId,avg(Salary) from employee group by DeptId;
select DeptId,max(Salary) from employee group by DeptId;

-- JOIN Queries
select employee.Empname,Department.DeptName from employee join Department on Employee.DeptID = Department.DeptID; 
SELECT Employee.EmpName, Department.DeptName, Department.Location FROM Employee JOIN Department ON Employee.DeptID = Department.DeptID;
SELECT Employee.EmpName, Attendance.AttendanceDate, Attendance.Status FROM Employee JOIN Attendance ON Employee.EmpID = Attendance.EmpID;

-- UPDATE
UPDATE Employee SET Salary = Salary * 1.10 WHERE DeptID = 103;
UPDATE Employee SET Designation='CA' WHERE DeptID = 102;
UPDATE Department SET DeptName='CA' WHERE DeptID = 102;

-- DELETE
delete from employee where salary < 40000;
DELETE FROM Attendance WHERE AttendanceDate = '2026-07-01';

-- Views
CREATE VIEW EmployeeDetails AS
SELECT e.EmpID, e.EmpName, d.DeptName, e.Salary
FROM Employee e
JOIN Department d ON e.DeptID = d.DeptID;

-- Stored Procedure
DELIMITER //
CREATE PROCEDURE GetEmployeess()
BEGIN
   SELECT * FROM Employee;
END //
DELIMITER ;
CALL GetEmployees();
