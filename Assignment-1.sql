CREATE DATABASE CompanyDB;

use CompanyDB;
CREATE TABLE Employee(
emp_id INT auto_increment,
firt_name Varchar(50) Not null,
last_name varchar(50) Not null,
email varchar(100) Not null,
phone varchar(15) null,
hire_date date Not null,
salary decimal(10,2),
department varchar(50),
constraint pk_employee primary key(emp_id)
);


insert into Employee (firt_name,last_name,email,phone,hire_date,salary,department) values
('ajay','kumar','ajay@gmail.com','9505247219','2022-09-01',100000.00,'Sales'),
('kasi','sai','kasi@gmail.com','9505242219','2022-06-23',600000.00,'Marketing'),
('kuamr','Tekkali','kumar@gmail.com','9505243219','2023-07-20',99000.00,'IT'),
('Naga','venkata','naga@gmail.com','9505244219','2021-08-01',120000.00,'IT'),
('priya','kumari','priya@gmail.com','9505245219','2026-03-23',60000.00,'Sales'),
('rahul','kalyan','rahul@gmail.com','9505246219','2024-02-14',100000.00,'HR');

-- ----Query 1---
select *from Employee;

-- ----Query 2---
select * from Employee Where salary >50000.00;

-- ----Query 3---
select * from Employee Where hire_date>'2022-01-01';

-- ----Query 4---
select * from Employee Where department='IT';

-- ----Query 5---
select count(*) from Employee;

-- ----Query 6---
update Employee set salary=salary+(salary*0.1)
where emp_id=3;

-- ----Query 7 ---
delete from Employee where emp_id=5;


