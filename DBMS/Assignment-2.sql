use companydb;

Create table Books(
name Varchar(50) not null,
author varchar(50)not null,
price decimal(10,2),
writer varchar(50)not null
);
 select * from Books;
alter table Books add published_year year;

alter table Books modify price decimal(10,3);
alter table Books rename  column writer to publisher;
alter table Books drop column published_year;


insert into Books (name,author,price,publisher)
values
('java','ramana',60000,'VRS'),
('python','jhon',34500,'RR'),
('C++','viveky',34803.000,'VSS'),
('C','kasi',23400.00,'RLS'),
('SQL','naga',540000.00,'RSL');

set sql_safe_updates=0;
update Books set price=price-(price*0.1)
where name='SQL';
set sql_safe_updates=1;

set sql_safe_updates=0;
delete from Books where name='C++';
set sql_safe_updates=1;
 select * from Books;
 
 truncate Books;
 
 
 create user 'dbda'@'localhost' identified by 'password123';
 
 grant all privileges on companydb.* to 'dbda'@'localhost';
 
revoke delete on companydb.* from 'dbda'@'localhost';


start transaction;
insert into Books (name,author,price,publisher)
values
('java','ramana',60000,'VRS');

select *from Books;

rollback;

select * from Books;


start transaction;
insert into Books (name,author,price,publisher)
values
('java','ramana',60000,'VRS');

select *from Books;

commit;

select * from Books;
