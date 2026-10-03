-- 1. Create database dac_dbt
create database dac_dbt;

-- 2. Switch to databse dac_dbt
use dac_dbt;

-- 3. Create the following tables , with the given fields, choose appropriate data type
-- a. create table dept(deptcode varchar(15), deptname varchar(60), budget integer
create table dept(
deptcode varchar(15),
depatname varchar(60),
budget int
);
-- b. create table grade(gradecode varchar(15), gradelevel varchar(30), gradedescription 
-- varchar(60), basic integer);
create table grade(
gradecode varchar(15),
gradelevel varchar(30),
gradescription varchar(60),
basic int
);


-- c. create table desig(desigcode varchar(15), designame varchar(15));
create table design(
desigcode varchar(15),
designame varchar(15)
);

/* d. create table emp(empcode varchar(15), empname varchar(60), deptcode 
varchar(15),birthdate date not null, joindate date not null, sex char(1) check (sex in 
('M', 'F', 'T')),desigcode varchar(15), supcode varchar(15), gradecode 
varchar(15),gradelevel varchar(30), basicpay integer);*/
create table emp(
empcode varchar(15),
empname varchar(60),
deptcode varchar(15),
birthdate date not null,
joindate date not null,
sex char(1) check(sex in ('M','F','T')),
desigcode varchar(15),
suocode varchar(15),
gradecode varchar(15),
gradelevel varchar(30),
basicpay int
);


-- e. create table salary(empcode varchar2(15), salmonth date not null, basic number, 
-- allow number, deduct number);
create table salary(empcode varchar(15),
salmonth date not null, 
basic numeric, 
allow numeric, 
deduct numeric
);

-- f. create table history(empcode varchar2(15), changedate date not null, desigcode 
-- varchar2(15), gradecode varchar2(15), gradelevel varchar2(30), basicpay number);
create table history(
empcode varchar(15), 
changedate date not null, 
desigcode varchar(15), 
gradecode varchar(15), 
gradelevel varchar(30), 
basicpay numeric
);

-- 4. Add the following primary key
-- a. dept add primary key (deptcode)
alter table dept add  primary key(deptcode);
-- b. desig add primary key (desigcode);
alter table design rename  to desig;
alter table desig add primary key(desigcode);
-- c. emp add primary key (empcode);
alter table  emp add primary key(empcode);
-- d. salary add primary key (empcode, salmonth)
alter table salary add primary key (empcode, salmonth);
-- e. history add primary key (empcode, changedate, desigcode, gradecode, gradelevel)
alter table history add primary key (empcode, changedate, desigcode, gradecode, gradelevel);
-- f. grade add primary key (gradecode, gradelevel);
alter table grade add primary key(gradecode, gradelevel);


-- 5. Add the following foreign keys 
-- a) emp add foreign key (deptcode) references dept(deptcode)
alter table emp add foreign key(deptcode) references dept(deptcode);
-- b) emp add foreign key (desigcode) references desig(desigcode)
alter table emp add foreign key(desigcode) references desig(desigcode);
-- c) emp add foreign key (supcode) references emp(empcode);
alter table emp rename column suocode to supercode;
alter table emp rename column supercode to supcode;
alter table emp add foreign key (supcode) references emp(empcode);

-- ©DAC 2021 CDAC-Bangalore Page 2
-- d) emp add foreign key (gradecode, gradelevel) references grade (gradecode, 
-- gradelevel)
alter table emp add foreign key (gradecode, gradelevel) references grade (gradecode, gradelevel);
-- e) history add foreign key (empcode) references emp (empcode);
alter table history add foreign key(empcode) references emp(empcode);
-- f) history add foreign key (desigcode) references desig(desigcode);
alter table history add foreign key(desigcode) references desig(desigcode);
-- g) history add foreign key (gradecode, gradelevel) references grade(gradecode, gradelevel);
alter table history add foreign key (gradecode, gradelevel) references grade(gradecode, gradelevel);
-- h) alter table salary add foreign key (empcode) references emp(empcode);
alter table salary add foreign key (empcode) references emp(empcode);


/*6. Insert the following field (Note that accepted syntax for date in mysql is YYYY-MM-DD
e.g 1959-12-12, use the correct syntax wherever required)
a. Insert following filed in dept 
 values('ACCT', 'Accounts', 19);
 values('PRCH', 'Purchase', 25);
 values('SALE', 'Sales', 39);
 values('STOR', 'Stores', 33);
 values('FACL', 'Facilities', 42);
 values('PERS', 'Personal', 12);*/
insert into dept (deptcode,depatname, budget) values
('ACCT', 'Accounts', 19),
('PRCH', 'Purchase', 25),
('SALE', 'Sales', 39),
('STOR', 'Stores', 33),
('FACL', 'Facilities', 42),
('PERS', 'Personal', 12);

/*b. Following filed into grade table
 values('GC1', 'GL1', 'GC-GL-1', 25000);
 values('GC4', 'GL1', 'GC-4-GL-1', 21000);
 values('GC4', 'GL4', 'GC-4-GL-4', 15000);
 values('GC6', 'GL1', 'GC-6-GL-1', 13000);
 values('GC6', 'GL2', 'GC-6-GL-2', 11000);
 values('GC12', 'GL1', 'GC-12-GL-1', 9000);
 values('GC12', 'GL2', 'GC-12-GL-2', 8500);
 values('GC12', 'GL3', 'GC-12-GL-3', 8000);
 values('GC15', 'GL1', 'GC-15-GL-1', 7000);
 values('GC15', 'GL2', 'GC-15-GL-2', 6500);
 values('GC15', 'GL3', 'GC-15-GL-3', 6000);
 values('GC20', 'GL1', 'GC-20-GL-1', 3500);
 values('GC20', 'GL2', 'GC-20-GL-2', 3000);
 values('GC20', 'GL3', 'GC-20-GL-3', 2500);
 values('GC20', 'GL4', 'GC-20-GL-4', 2000);*/

insert into grade (gradecode, gradelevel, gradescription, basic) values
('GC1', 'GL1', 'GC-GL-1', 25000),
('GC4', 'GL1', 'GC-4-GL-1', 21000),
('GC4', 'GL4', 'GC-4-GL-4', 15000),
('GC6', 'GL1', 'GC-6-GL-1', 13000),
('GC6', 'GL2', 'GC-6-GL-2', 11000),
('GC12', 'GL1', 'GC-12-GL-1', 9000),
('GC12', 'GL2', 'GC-12-GL-2', 8500),
('GC12', 'GL3', 'GC-12-GL-3', 8000),
('GC15', 'GL1', 'GC-15-GL-1', 7000),
('GC15', 'GL2', 'GC-15-GL-2', 6500),
('GC15', 'GL3', 'GC-15-GL-3', 6000),
('GC20', 'GL1', 'GC-20-GL-1', 3500),
('GC20', 'GL2', 'GC-20-GL-2', 3000),
('GC20', 'GL3', 'GC-20-GL-3', 2500),
('GC20', 'GL4', 'GC-20-GL-4', 2000);

/*c. Following table to design
 insert into desig values('CLRK', 'Clerk');
 insert into desig values('SLMN', 'Sales Man');
 insert into desig values('MNGR', 'Manager');
 insert into desig values('SPRV', 'Supervisor');
©DAC 2021 CDAC-Bangalore Page 3
 insert into desig values('PRES', 'Personal');*/
insert into desig values('CLRK', 'Clerk');
insert into desig values('SLMN', 'Sales Man');
insert into desig values('MNGR', 'Manager');
insert into desig values('SPRV', 'Supervisor');
insert into desig values('PRES', 'Personal');

/*d. Following table to emp table 
insert into 
emp(empcode,empname,deptcode,birthdate,joindate,sex,desigcode,supcode,gradecod
e,gradelevel,basicpay) values ('7839', 'Reddy', 'ACCT', '1959-12-12', '1981-07-17', 'M', 
'PRES', null, 'GC1', 'GL1', 32000),
('7566', 'Jain', 'PRCH', '1955-01-24', '1981-04-02', 'F', 'MNGR', '7839', 'GC6', 'GL2', 
12400),
('7698', 'Murthy', 'SALE', '1960-09-16', '1981-05-01', 'F', 'MNGR', '7839', 'GC6', 'GL1', 
14700),
('7782', 'Menon', 'ACCT', '1967-08-30', '1981-06-09','M', 'MNGR', '7839', 'GC6', 'GL2', 
12400),
('7902', 'Naik', 'PRCH', '1958-02-20', '1981-12-03', 'M', 'MNGR', '7839', 'GC6', 'GL2', 
11800),
('7654', 'Gupta', 'SALE', '1957-01-22', '1981-09-28', 'M', 'SLMN', '7698', 'GC6', 'GL2', 
12600),
('7521', 'Wilson', 'STOR', '1956-03-18', '1981-02-22', 'M', 'MNGR', '7698', 'GC6', 'GL2', 
12200),
('7844', 'Singh', 'SALE', '1956-09-09', '1981-09-08', 'F', 'SLMN', '7698', 'GC6', 'GL1', 14300),
('7900', 'Shroff', 'SALE', '1956-06-28', '1981-12-03', 'M', 'CLRK', '7698', 'GC6', 'GL2', 
12000),
('7788', 'Khan', 'PRCH', '1957-02-03', '1982-12-09', 'M', 'SPRV', '7566', 'GC6', 'GL2', 11900),
('7499', 'Roy', 'SALE', '1957-09-27', '1981-02-20', 'M', 'SLMN', '7698', 'GC6', 'GL1', 14200),
('7934', 'Kaul', 'ACCT', '1957-05-02', '1982-01-23', 'M', 'CLRK', '7782', 'GC6', 'GL2', 11950),
('7369', 'Shah', 'PRCH', '1960-05-25','1983-12-17', 'M', 'CLRK', '7902', 'GC6', 'GL2', 
12200),
('7876', 'Patil', 'PRCH', '1965-09-02', '1990-12-17', 'M', 'CLRK', '7788', 'GC6', 'GL2', 12300),
('7999', 'Sinha', 'SALE', '1970-04-11', '1992-02-20', 'M', 'SLMN', '7782', 'GC6', 'GL1', 
14600),
('7939', 'Rai', 'PRCH', '1988-08-10', '2012-12-06', 'M', 'CLRK', '7782', 'GC6', 'GL2', 11800),
('7192', 'John', 'ACCT', '1968-11-05', '1994-12-03', 'M', 'CLRK', '7902', 'GC6', 'GL2', 
12300),
('9902', 'Ahmad', 'SALE', '1970-02-16', '1992-04-17', 'M', 'SLMN', '7698', 'GC6', 'GL1', 
14200),
('7802', 'Sanghvi','STOR', '1980-05-06', '1993-01-01', 'M', 'MNGR', '7566', 'GC6', 'GL2', 
12400),
('6569', 'Tiwari', 'STOR', '1989-08-19', '2010-08-21', 'M', 'MNGR', '7782', 'GC6', 'GL2', 
12400);*/


insert into 
emp(empcode,empname,deptcode,birthdate,joindate,sex,desigcode,supcode,gradecode,gradelevel,basicpay)
 values 
 ('7839', 'Reddy', 'ACCT', '1959-12-12', '1981-07-17', 'M', 'PRES', null, 'GC1', 'GL1', 32000),
('7566', 'Jain', 'PRCH', '1955-01-24', '1981-04-02', 'F', 'MNGR', '7839', 'GC6', 'GL2', 
12400),
('7698', 'Murthy', 'SALE', '1960-09-16', '1981-05-01', 'F', 'MNGR', '7839', 'GC6', 'GL1', 
14700),
('7782', 'Menon', 'ACCT', '1967-08-30', '1981-06-09','M', 'MNGR', '7839', 'GC6', 'GL2', 
12400),
('7902', 'Naik', 'PRCH', '1958-02-20', '1981-12-03', 'M', 'MNGR', '7839', 'GC6', 'GL2', 
11800),
('7654', 'Gupta', 'SALE', '1957-01-22', '1981-09-28', 'M', 'SLMN', '7698', 'GC6', 'GL2', 
12600),
('7521', 'Wilson', 'STOR', '1956-03-18', '1981-02-22', 'M', 'MNGR', '7698', 'GC6', 'GL2', 
12200),
('7844', 'Singh', 'SALE', '1956-09-09', '1981-09-08', 'F', 'SLMN', '7698', 'GC6', 'GL1', 14300),
('7900', 'Shroff', 'SALE', '1956-06-28', '1981-12-03', 'M', 'CLRK', '7698', 'GC6', 'GL2', 
12000),
('7788', 'Khan', 'PRCH', '1957-02-03', '1982-12-09', 'M', 'SPRV', '7566', 'GC6', 'GL2', 11900),
('7499', 'Roy', 'SALE', '1957-09-27', '1981-02-20', 'M', 'SLMN', '7698', 'GC6', 'GL1', 14200),
('7934', 'Kaul', 'ACCT', '1957-05-02', '1982-01-23', 'M', 'CLRK', '7782', 'GC6', 'GL2', 11950),
('7369', 'Shah', 'PRCH', '1960-05-25','1983-12-17', 'M', 'CLRK', '7902', 'GC6', 'GL2', 
12200),
('7876', 'Patil', 'PRCH', '1965-09-02', '1990-12-17', 'M', 'CLRK', '7788', 'GC6', 'GL2', 12300),
('7999', 'Sinha', 'SALE', '1970-04-11', '1992-02-20', 'M', 'SLMN', '7782', 'GC6', 'GL1', 
14600),
('7939', 'Rai', 'PRCH', '1988-08-10', '2012-12-06', 'M', 'CLRK', '7782', 'GC6', 'GL2', 11800),
('7192', 'John', 'ACCT', '1968-11-05', '1994-12-03', 'M', 'CLRK', '7902', 'GC6', 'GL2', 
12300),
('9902', 'Ahmad', 'SALE', '1970-02-16', '1992-04-17', 'M', 'SLMN', '7698', 'GC6', 'GL1', 
14200),
('7802', 'Sanghvi','STOR', '1980-05-06', '1993-01-01', 'M', 'MNGR', '7566', 'GC6', 'GL2', 
12400),
('6569', 'Tiwari', 'STOR', '1989-08-19', '2010-08-21', 'M', 'MNGR', '7782', 'GC6', 'GL2', 12400);

/*e. Following values to salary table 
insert into salary(empcode,salmonth,basic,allow,deduct) values('7839', 
©DAC 2021 CDAC-Bangalore Page 4
'2011-12-01', 30000, 3000, 1200),
('7839', '2012-01-01', 32000, 3200, 1250),
('7839', '2012-02-01', 32000, 3200, 1250),
('7566', '2011-12-01', 12000, 600, 400),
('7566', '2012-01-01', 12400, 1240, 550),
('7566', '2012-02-01', 12400, 1240, 550),
('7698', '2011-12-01', 13900, 800, 500),
('7698', '2012-01-01', 14700, 1470, 650),
('7698', '2012-02-01', 14700, 1470, 650),
('7782', '2011-12-01', 11800, 600, 500),
('7782', '2012-01-01', 12400, 1240, 550),
('7782', '2012-02-01', 12400, 1240, 550),
('7902', '2011-12-01', 11200, 600, 450),
('7902', '2012-01-01', 11800, 1180, 550),
('7902', '2012-02-01', 11800, 1180, 550),
('7654', '2011-12-01', 11900, 700, 500),
('7654', '2012-01-01', 12600, 1260, 550),
('7654', '2012-02-01', 12600, 1260, 550),
('7521', '2011-12-01', 11400, 800, 500),
('7521', '2012-01-01', 12200, 1220, 550),
('7521', '2012-02-01', 12200, 1220, 550),
('7844', '2011-12-01', 13400, 900, 600),
('7844', '2012-01-01', 14300, 1430, 650),
('7844', '2012-02-01', 14300, 1430, 650),
('7900', '2011-12-01', 11500, 500, 300),
('7900', '2012-01-01', 12000, 1200, 550),
('7900', '2012-02-01', 12000, 1200, 550),
('7788', '2011-12-01', 11300, 600, 450),
('7788', '2012-01-01', 11900, 1190, 550),
('7788', '2012-02-01', 11900, 1190, 550),
('7499', '2011-12-01', 13400, 800, 550),
('7499', '2012-01-01', 14200, 1420, 650),
('7499', '2012-02-01', 14200, 1420, 650),
('7934', '2011-12-01', 11450, 500, 250),
('7934', '2012-01-01', 11950, 1195, 550),
('7934', '2012-02-01', 11950, 1195, 550),
('7369', '2011-12-01', 11600, 600, 450),
('7369', '2012-01-01', 12200, 1220, 550),
('7369', '2012-02-01', 12200, 1220, 550),
('7876', '2011-12-01', 11700, 600, 500),
©DAC 2021 CDAC-Bangalore Page 5
('7876', '2012-01-01', 12300, 1230, 550),
('7876', '2012-02-01', 12300, 1230, 550),
('7999', '2011-12-01', 13950, 650, 600),
('7999', '2012-01-01', 14600, 1460, 650),
('7999', '2012-02-01', 14600, 1460, 650),
('7939', '2011-12-01', 11100, 700, 400),
('7939', '2012-01-01', 11800, 1180, 550),
('7939', '2012-02-01', 11800, 1180, 550),
('7192', '2011-12-01', 11700, 600, 500),
('7192', '2012-01-01', 12300, 1230, 550),
('7192', '2012-02-01', 12300, 1230, 550),
('9902', '2011-12-01', 13400, 800, 500),
('9902', '2012-01-01', 14200, 1420, 650),
('9902', '2012-02-01', 14200, 1420, 650),
('7802', '2011-12-01', 11900, 500, 300),
('7802', '2012-01-01', 12400, 1240, 550),
('7802', '2012-02-01', 12400, 1240, 550),
('6569', '2011-12-01', 11800, 600, 400),
('6569', '2012-01-01', 12400, 1240, 550),*/


insert into salary(empcode,salmonth,basic,allow,deduct) values('7839', 
'2011-12-01', 30000, 3000, 1200),
('7839', '2012-01-01', 32000, 3200, 1250),
('7839', '2012-02-01', 32000, 3200, 1250),
('7566', '2011-12-01', 12000, 600, 400),
('7566', '2012-01-01', 12400, 1240, 550),
('7566', '2012-02-01', 12400, 1240, 550),
('7698', '2011-12-01', 13900, 800, 500),
('7698', '2012-01-01', 14700, 1470, 650),
('7698', '2012-02-01', 14700, 1470, 650),
('7782', '2011-12-01', 11800, 600, 500),
('7782', '2012-01-01', 12400, 1240, 550),
('7782', '2012-02-01', 12400, 1240, 550),
('7902', '2011-12-01', 11200, 600, 450),
('7902', '2012-01-01', 11800, 1180, 550),
('7902', '2012-02-01', 11800, 1180, 550),
('7654', '2011-12-01', 11900, 700, 500),
('7654', '2012-01-01', 12600, 1260, 550),
('7654', '2012-02-01', 12600, 1260, 550),
('7521', '2011-12-01', 11400, 800, 500),
('7521', '2012-01-01', 12200, 1220, 550),
('7521', '2012-02-01', 12200, 1220, 550),
('7844', '2011-12-01', 13400, 900, 600),
('7844', '2012-01-01', 14300, 1430, 650),
('7844', '2012-02-01', 14300, 1430, 650),
('7900', '2011-12-01', 11500, 500, 300),
('7900', '2012-01-01', 12000, 1200, 550),
('7900', '2012-02-01', 12000, 1200, 550),
('7788', '2011-12-01', 11300, 600, 450),
('7788', '2012-01-01', 11900, 1190, 550),
('7788', '2012-02-01', 11900, 1190, 550),
('7499', '2011-12-01', 13400, 800, 550),
('7499', '2012-01-01', 14200, 1420, 650),
('7499', '2012-02-01', 14200, 1420, 650),
('7934', '2011-12-01', 11450, 500, 250),
('7934', '2012-01-01', 11950, 1195, 550),
('7934', '2012-02-01', 11950, 1195, 550),
('7369', '2011-12-01', 11600, 600, 450),
('7369', '2012-01-01', 12200, 1220, 550),
('7369', '2012-02-01', 12200, 1220, 550),
('7876', '2011-12-01', 11700, 600, 500),
('7876', '2012-01-01', 12300, 1230, 550),
('7876', '2012-02-01', 12300, 1230, 550),
('7999', '2011-12-01', 13950, 650, 600),
('7999', '2012-01-01', 14600, 1460, 650),
('7999', '2012-02-01', 14600, 1460, 650),
('7939', '2011-12-01', 11100, 700, 400),
('7939', '2012-01-01', 11800, 1180, 550),
('7939', '2012-02-01', 11800, 1180, 550),
('7192', '2011-12-01', 11700, 600, 500),
('7192', '2012-01-01', 12300, 1230, 550),
('7192', '2012-02-01', 12300, 1230, 550),
('9902', '2011-12-01', 13400, 800, 500),
('9902', '2012-01-01', 14200, 1420, 650),
('9902', '2012-02-01', 14200, 1420, 650),
('7802', '2011-12-01', 11900, 500, 300),
('7802', '2012-01-01', 12400, 1240, 550),
('7802', '2012-02-01', 12400, 1240, 550),
('6569', '2011-12-01', 11800, 600, 400),
('6569', '2012-01-01', 12400, 1240, 550);

/*f. Following values into history table
insert into history 
(empcode,changedate,desigcode,gradecode,gradelevel,basicpay) values ( '7839', 
'1981-09-17', 'CLRK', 'GC15','GL1', 7000),
( '7839', '1985-12-31', 'SLMN', 'GC12','GL3', 8000),
( '7839', '1988-12-31', 'SPRV', 'GC12','GL2', 8500),
( '7839', '1990-12-31', 'MNGR', 'GC12','GL1', 9000),
( '7839', '1994-12-31', 'CLRK', 'GC6', 'GL2', 11000),
( '7839', '1998-12-31', 'SLMN', 'GC6', 'GL1', 13000),
( '7839', '2001-12-31', 'SPRV', 'GC4', 'GL4', 15000),
( '7839', '2006-12-31', 'MNGR', 'GC4', 'GL1', 21000),
( '7839', '2011-12-31', 'PRES', 'GC1', 'GL1', 25000),
( '7566', '1981-04-02', 'CLRK', 'GC12','GL3', 8000),
( '7566', '1991-12-31', 'SLMN', 'GC12','GL2', 8500),
( '7566', '2001-12-31', 'SPRV', 'GC12','GL1', 9000),
( '7566', '2011-12-31', 'MNGR', 'GC6', 'GL2', 11000),
( '7698', '1981-05-01', 'CLRK', 'GC12','GL3', 8000),
( '7698', '1991-05-01', 'SLMN', 'GC12','GL2', 8500),
( '7698', '2001-05-01', 'MNGR', 'GC12','GL1', 9000),
( '7698', '2006-05-01', 'SPRV', 'GC6', 'GL2', 11000),
( '7698', '2011-05-01', 'MNGR', 'GC6', 'GL1', 13000),
©DAC 2021 CDAC-Bangalore Page 6
( '7782', '1981-06-09', 'CLRK', 'GC12','GL3', 8000),
( '7782', '1991-06-09', 'SLMN', 'GC12','GL2', 8500),
( '7782', '2001-06-09', 'SPRV', 'GC12','GL1', 9000),
( '7782', '2011-06-09', 'MNGR', 'GC6', 'GL2', 11000),
( '7902', '1981-12-03', 'CLRK', 'GC12','GL3', 8000),
( '7902', '1991-12-03', 'SLMN', 'GC12','GL2', 8500),
( '7902', '2001-12-03', 'SPRV', 'GC12','GL1', 9000),
( '7902', '2011-12-03', 'MNGR', 'GC6', 'GL2', 11000),
( '7654', '1981-09-28', 'SLMN', 'GC12','GL3', 8000),
( '7654', '1991-09-28', 'SLMN', 'GC12','GL2', 8500),
( '7654', '2001-09-28', 'SLMN', 'GC12','GL1', 9000),
( '7654', '2011-09-28', 'SLMN', 'GC6', 'GL2', 11000),
( '7521', '1981-02-22', 'CLRK', 'GC12','GL3', 8000),
( '7521', '1991-02-22', 'SLMN', 'GC12','GL2', 8500),
( '7521', '2001-02-22', 'SPRV', 'GC12','GL1', 9000),
( '7521', '2011-02-22', 'MNGR', 'GC6', 'GL2', 11000),
( '7844', '1981-09-08', 'SLMN', 'GC12','GL3', 8000),
( '7844', '1991-09-08', 'SLMN', 'GC12','GL2', 8500),
( '7844', '2001-09-08', 'SLMN', 'GC12','GL1', 9000),
( '7844', '2006-09-08', 'SLMN', 'GC6', 'GL2', 11000),
( '7844', '2011-09-08', 'SLMN', 'GC6', 'GL1', 13000),
( '7900', '1981-12-03', 'SLMN', 'GC12','GL3', 8000),
( '7900', '1991-12-03', 'SLMN', 'GC12','GL2', 8500),
( '7900', '2001-12-03', 'CLRK', 'GC12','GL1', 9000),
( '7900', '2011-12-03', 'CLRK', 'GC6', 'GL2', 11000),
( '7788', '1982-12-09', 'SLMN', 'GC12','GL3', 8000),
( '7788', '1992-12-09', 'CLRK', 'GC12','GL2', 8500),
( '7788', '2002-12-09', 'MNGR', 'GC12','GL1', 9000),
( '7788', '2012-12-09', 'SPRV', 'GC6', 'GL2', 11000),
( '7499', '1981-02-20', 'SLMN', 'GC12','GL3', 8000),
( '7499', '1991-02-20', 'SLMN', 'GC12','GL2', 8500),
( '7499', '2001-02-20', 'SLMN', 'GC12','GL1', 9000),
( '7499', '2006-02-20', 'SLMN', 'GC6', 'GL2', 11000),
( '7499', '2011-02-20', 'SLMN', 'GC6', 'GL1', 13000),
( '7934', '1982-01-23', 'SLMN', 'GC12','GL3', 8000),
( '7934', '1992-01-23', 'SLMN', 'GC12','GL2', 8500),
( '7934', '2002-01-23', 'CLRK', 'GC12','GL1', 9000),
( '7934', '2012-01-23', 'CLRK', 'GC6', 'GL2', 11000),
( '7369', '1983-12-17', 'SLMN', 'GC12','GL3', 8000),
( '7369', '1993-12-17', 'SLMN', 'GC12','GL2', 8500),

( '7369', '2003-12-17', 'CLRK', 'GC12','GL1', 9000),
( '7369', '2006-12-17', 'CLRK', 'GC6', 'GL2', 11000);*/


insert into history 
(empcode,changedate,desigcode,gradecode,gradelevel,basicpay) values ( '7839', 
'1981-09-17', 'CLRK', 'GC15','GL1', 7000),
( '7839', '1985-12-31', 'SLMN', 'GC12','GL3', 8000),
( '7839', '1988-12-31', 'SPRV', 'GC12','GL2', 8500),
( '7839', '1990-12-31', 'MNGR', 'GC12','GL1', 9000),
( '7839', '1994-12-31', 'CLRK', 'GC6', 'GL2', 11000),
( '7839', '1998-12-31', 'SLMN', 'GC6', 'GL1', 13000),
( '7839', '2001-12-31', 'SPRV', 'GC4', 'GL4', 15000),
( '7839', '2006-12-31', 'MNGR', 'GC4', 'GL1', 21000),
( '7839', '2011-12-31', 'PRES', 'GC1', 'GL1', 25000),
( '7566', '1981-04-02', 'CLRK', 'GC12','GL3', 8000),
( '7566', '1991-12-31', 'SLMN', 'GC12','GL2', 8500),
( '7566', '2001-12-31', 'SPRV', 'GC12','GL1', 9000),
( '7566', '2011-12-31', 'MNGR', 'GC6', 'GL2', 11000),
( '7698', '1981-05-01', 'CLRK', 'GC12','GL3', 8000),
( '7698', '1991-05-01', 'SLMN', 'GC12','GL2', 8500),
( '7698', '2001-05-01', 'MNGR', 'GC12','GL1', 9000),
( '7698', '2006-05-01', 'SPRV', 'GC6', 'GL2', 11000),
( '7698', '2011-05-01', 'MNGR', 'GC6', 'GL1', 13000),
( '7782', '1981-06-09', 'CLRK', 'GC12','GL3', 8000),
( '7782', '1991-06-09', 'SLMN', 'GC12','GL2', 8500),
( '7782', '2001-06-09', 'SPRV', 'GC12','GL1', 9000),
( '7782', '2011-06-09', 'MNGR', 'GC6', 'GL2', 11000),
( '7902', '1981-12-03', 'CLRK', 'GC12','GL3', 8000),
( '7902', '1991-12-03', 'SLMN', 'GC12','GL2', 8500),
( '7902', '2001-12-03', 'SPRV', 'GC12','GL1', 9000),
( '7902', '2011-12-03', 'MNGR', 'GC6', 'GL2', 11000),
( '7654', '1981-09-28', 'SLMN', 'GC12','GL3', 8000),
( '7654', '1991-09-28', 'SLMN', 'GC12','GL2', 8500),
( '7654', '2001-09-28', 'SLMN', 'GC12','GL1', 9000),
( '7654', '2011-09-28', 'SLMN', 'GC6', 'GL2', 11000),
( '7521', '1981-02-22', 'CLRK', 'GC12','GL3', 8000),
( '7521', '1991-02-22', 'SLMN', 'GC12','GL2', 8500),
( '7521', '2001-02-22', 'SPRV', 'GC12','GL1', 9000),
( '7521', '2011-02-22', 'MNGR', 'GC6', 'GL2', 11000),
( '7844', '1981-09-08', 'SLMN', 'GC12','GL3', 8000),
( '7844', '1991-09-08', 'SLMN', 'GC12','GL2', 8500),
( '7844', '2001-09-08', 'SLMN', 'GC12','GL1', 9000),
( '7844', '2006-09-08', 'SLMN', 'GC6', 'GL2', 11000),
( '7844', '2011-09-08', 'SLMN', 'GC6', 'GL1', 13000),
( '7900', '1981-12-03', 'SLMN', 'GC12','GL3', 8000),
( '7900', '1991-12-03', 'SLMN', 'GC12','GL2', 8500),
( '7900', '2001-12-03', 'CLRK', 'GC12','GL1', 9000),
( '7900', '2011-12-03', 'CLRK', 'GC6', 'GL2', 11000),
( '7788', '1982-12-09', 'SLMN', 'GC12','GL3', 8000),
( '7788', '1992-12-09', 'CLRK', 'GC12','GL2', 8500),
( '7788', '2002-12-09', 'MNGR', 'GC12','GL1', 9000),
( '7788', '2012-12-09', 'SPRV', 'GC6', 'GL2', 11000),
( '7499', '1981-02-20', 'SLMN', 'GC12','GL3', 8000),
( '7499', '1991-02-20', 'SLMN', 'GC12','GL2', 8500),
( '7499', '2001-02-20', 'SLMN', 'GC12','GL1', 9000),
( '7499', '2006-02-20', 'SLMN', 'GC6', 'GL2', 11000),
( '7499', '2011-02-20', 'SLMN', 'GC6', 'GL1', 13000),
( '7934', '1982-01-23', 'SLMN', 'GC12','GL3', 8000),
( '7934', '1992-01-23', 'SLMN', 'GC12','GL2', 8500),
( '7934', '2002-01-23', 'CLRK', 'GC12','GL1', 9000),
( '7934', '2012-01-23', 'CLRK', 'GC6', 'GL2', 11000),
( '7369', '1983-12-17', 'SLMN', 'GC12','GL3', 8000),
( '7369', '1993-12-17', 'SLMN', 'GC12','GL2', 8500),
( '7369', '2003-12-17', 'CLRK', 'GC12','GL1', 9000),
( '7369', '2006-12-17', 'CLRK', 'GC6', 'GL2', 11000);

-- Section -2 
-- Execute the following query based on the Database created in section -1
-- 1. List the name, employee code and designation of each employee of the office
select e.empname, e.empcode, d.designame
from emp as e
join desig as d
on e.desigcode=d.desigcode;

-- 2. List all the departments and the budgets
select * from dept;

-- 3. List the employees and their respective department names
alter table dept rename column depatname to deptname;
select e.empname , d.deptname
from emp as e
inner join dept as d
on e.deptcode=d.deptcode;

-- 4. List the employees who are not having any superior to work under
select * from emp
where supcode is null;

/*5. List the employees who are working directly under superior most employee of the
office. (Assume the superior most employee is the employee who does not have a
supervisor)*/
select * from emp 
where supcode=(
select empcode from emp
where supcode is null);


-- 6. List the employee(s) who is senior most in the office
select * from emp
where joindate in(
select min(joindate) from emp);

-- 7. List the employees who will retire from the office next.
select * from emp
where birthdate=(
select min(birthdate) from emp);

-- 8. List the departments with the respective department managers
select e.empname ,d.deptname
from emp as e
join dept as d
on e.deptcode=d.deptcode
join desig as de
on e.desigcode=de.desigcode
where de.designame='Manager';

select e.empname ,d.deptname
from emp as e
join dept as d
on e.deptcode=d.deptcode
where e.desigcode='MNGR';

-- 9. List the employees who work as ‘manager’ to at least one department.
SELECT DISTINCT e.empcode, e.empname
FROM emp AS e
JOIN desig AS de 
  ON e.desigcode = de.desigcode
JOIN dept AS d 
  ON e.deptcode = d.deptcode
WHERE de.designame = 'Manager';


-- 10. List the number of employees working for either ‘accounts’ or ‘personal’ or
-- ‘purchase’ departments

SELECT COUNT(*) AS employee_count,d.deptname 
FROM emp AS e
JOIN dept AS d 
  ON e.deptcode = d.deptcode
WHERE d.deptname IN ('Accounts', 'Personal', 'Purchase')
group by deptname;

-- 11. List the employees working for ‘accounts’ or ‘personal’ department
select e.empcode,e.empname, d.deptname
 from emp as e
 join dept as d
 on e.deptcode = d.deptcode
 where d.deptname in ('Accounts', 'personal');
 
-- 12. List the employees working for ‘accounts’ and ‘personal’ department
 SELECT e.empcode, e.empname 
FROM emp AS e
JOIN dept AS d ON e.deptcode = d.deptcode
WHERE d.deptname = 'Accounts'
  AND e.empcode IN (
      SELECT e2.empcode 
      FROM emp AS e2 
      JOIN dept AS d2 ON e2.deptcode = d2.deptcode 
      WHERE d2.deptname = 'Personal'
  );
 
-- 13. List the employees working for ‘accounts’ but not for ‘personal’ department
 SELECT e.empcode, e.empname 
FROM emp AS e
JOIN dept AS d ON e.deptcode = d.deptcode
WHERE d.deptname = 'Accounts'
  AND e.empcode not IN (
      SELECT e2.empcode 
      FROM emp AS e2 
      JOIN dept AS d2 ON e2.deptcode = d2.deptcode 
      WHERE d2.deptname = 'Personal'
  );
  
-- 14. List the youngest employee of the office
select * from emp
where birthdate=(
select max(birthdate) from emp);

-- 15. List the employees who are drawing basic pay not equal to 12400.
select * from emp
where basicpay<> 12400;

-- 16. List the employees who are drawing basic salary between 11000 and 12000.
select * from emp as e
join salary as s
on e.empcode=s.empcode
where s.basic between 11000 and 12000;

select * from emp
where basicpay between 11000 and 12000;

-- 17. List the employees who are drawing basic salary not between 11000 and 12000
select * from emp
where basicpay  not between 11000 and 12000;

-- 18. List the employees who got salary allowance between Rs.1000 to Rs.1500 in the
-- month of January 2012.
select e.empname,s.allow 
from emp as e
join salary as s
on e.empcode=s.empcode
where s.allow between 1000 and 1500
and s.salmonth between '2012-01-01'and '2012-01-31';

SELECT e.empname, s.allow
FROM emp AS e
JOIN salary AS s
  ON e.empcode = s.empcode
WHERE s.allow BETWEEN 1000 AND 1500
  AND MONTH(s.salmonth) = 1 
  AND YEAR(s.salmonth) = 2012;


-- 19. List the employees whose name ends with ‘i’ or ‘y’.
select empname 
from emp
where empname like '%i' or empname like '%y';

-- 20. List the employees who have atleast 25 years of experience
select empname, joindate
from emp
where timestampdiff(year,joindate, current_date())>=25;

select empname, joindate
from emp
where joindate <= current_date() - interval 25 year;


-- 21. List the ‘Salesmen’ who have minimum 30 to 20 years of experience
select e.empname, d.designame 
from emp as e
join desig as d
on e.desigcode=d.desigcode
where d.designame='Salesmen' and  
e.joindate between  (current_date() - interval 30 year) and (current_date() - interval 20 year);

SELECT e.empname, d.designame 
FROM emp AS e
JOIN desig AS d
  ON e.desigcode = d.desigcode
WHERE d.designame = 'Salesman'
  AND e.joindate BETWEEN (CURRENT_DATE() - INTERVAL 30 YEAR) 
                     AND (CURRENT_DATE() - INTERVAL 20 YEAR);
                     
                     SELECT e.empname, d.designame 
FROM emp AS e
JOIN desig AS d
  ON e.desigcode = d.desigcode
WHERE d.designame = 'Salesman'
  AND TIMESTAMPDIFF(YEAR, e.joindate, CURRENT_DATE()) BETWEEN 20 AND 30;


-- 22. List the basic salary and half of the basic salary for each employee.
select basicpay , basicpay*0.5 as halfSalary 
from emp;

-- 23. List the employees and the latest take-home-pay of each employee. 
-- (Hint: Take￾home-pay = basic + allowance - deductions)
select e.empname, e.basicpay+(s.allow-s.deduct) as home_pay
from emp as e
join salary as s
on e.empcode=s.empcode
where s.salmonth=(
select max(s1.salmonth)
from salary as s1
where s1.empcode=e.empcode
);

-- 24. List the employees and the latest take-home-pay of each employee of ‘Accounts’
-- department.
select e.empname, e.basicpay+(s.allow-s.deduct) as home_pay
from emp as e
join salary as s
on e.empcode=s.empcode
join dept as d
on e.deptcode=d.deptcode
where d.deptname ='Accounts' and s.salmonth=(
select max(s1.salmonth)
from salary as s1
where s1.empcode=e.empcode
);

-- 25. List employees and their respective ages.
select empname, timestampdiff(year,birthdate,current_date) as AGE from emp;


select empname, 
year(current_date) - year(birthdate) as AGE
from emp;

-- 26. List all the ‘Accounts’ department employees, first ordered by their age and then
-- by their names.
select e.empname, timestampdiff(year,e.birthdate, current_date) as age
from emp as e
join dept as d
on e.deptcode=d.deptcode
where d.deptname='Accounts' 
order by age,e.empname;

select e.empname,
timestampdiff(year, birthdate , current_date) as age
from emp as e
where e.deptcode=(
select deptcode from dept
where deptname='Accounts'
)order by age, e.empname;

-- 27. List the number of employees directly reporting to ‘Reddy’
select count(*) as num_of_emp
from emp 
where supcode=(
select empcode from emp
where empname like '%Reddy'
);

/*28. List the employees who have atleast one person working under him/her and the
number of their subordinates. List the employee with highest number of
subordinates first, next the person with next highest number of subordinates and
so on.*/

SELECT s.empname,
       COUNT(e.empcode) AS number_of_subordinates
FROM emp AS s
JOIN emp AS e
    ON s.empcode = e.supcode
GROUP BY s.empcode, s.empname
ORDER BY number_of_subordinates DESC;


-- 29. List the employees who have minimum 3 employees working under him/her.
SELECT s.empname,
       COUNT(e.empcode) AS number_of_subordinates
FROM emp AS s
JOIN emp AS e
    ON s.empcode = e.supcode
GROUP BY s.empcode, s.empname
having number_of_subordinates>=3;

-- 30. List the minimum and maximum salaries drawn in each grade code.
select gradecode, max(basic), min(basic)
from grade
group by gradecode;

-- 31. List the employees with names of their supervisors (Hint: Use Join).
select e.empname as super, em.empname 
from emp as e
join emp as em
on em.supcode=e.empcode;

-- 32. List the number of officers reporting to each supervisor having more than 3
-- people working under them
SELECT s.empname AS supervisor,
       COUNT(e.empcode) AS number_of_officers
FROM emp AS s
JOIN emp AS e
    ON s.empcode = e.supcode
GROUP BY s.empcode, s.empname
HAVING COUNT(e.empcode) > 3;

-- 33. List the employees who have not got any promotion till now.
select emp.empname from emp
left join history as h
on emp.empcode=h.empcode
where h.empcode is Null;

select empname from emp
where empcode not in(
select empcode from history
);

-- 34. List the employee with maximum number of promotions. Also list the number of
-- promotions that he/she got.
select e.empname , count(h.empcode) as number_of_promotions from emp as e
left join history as h
on e.empcode =h.empcode
group by e.empcode,e.empname
ORDER BY number_of_promotions DESC
limit 1;


-- 35. List the employees who got promoted in the year 1991.
select e.empname from emp as e
left join history as h
on e.empcode=h.empcode
where 1991= year(h.changedate);

/*36. List the department budget and the total salary drawn (by the employees of this
©DAC 2021 CDAC-Bangalore Page 10
department*/
select d.deptname, d.budget, sum(s.basic +(s.allow-s.deduct))  as totala_pay
from emp as e
join dept as d
on e.deptcode=d.deptcode
join salary as s
on e.empcode =s.empcode
WHERE s.salmonth = (
    SELECT MAX(salmonth)
    FROM salary
)
group by d.deptname, d.budget;

-- 37. Display the employee names in full uppercase.
select upper(empname) as empname from emp;

-- 38. List all the employees drawing salary higher than the salary drawn by ‘Jain’
select e.empname, (s.basic+s.allow-s.deduct )as emp_salary from emp as e
join salary as s
on e.empcode=s.empcode
where emp_salary >(
select basicpay from emp
where empname like 'Jain'
);

-- 39. List all the employees who have higher salary than all the employees who draw
-- salary in the range of 11000 to 12000.
SELECT e.empcode, e.empname, (s.basic + s.allow - s.deduct) AS take_home_pay
FROM emp AS e
JOIN salary AS s 
  ON e.empcode = s.empcode
WHERE (s.basic + s.allow - s.deduct) > ALL (
    SELECT (basic + allow - deduct)
    FROM salary
    WHERE (basic + allow - deduct) BETWEEN 11000 AND 12000
);

select empname, basicpay from emp
where basicpay between 11000 and 12000 order by basicpay desc
limit 1;

SELECT empcode, empname, basicpay
FROM emp
WHERE basicpay > (
    SELECT MAX(basicpay)
    FROM emp
    WHERE basicpay BETWEEN 11000 AND 12000
);

SELECT empcode, empname, basicpay
FROM emp
WHERE basicpay > ALL (
    SELECT basicpay 
    FROM emp 
    WHERE basicpay BETWEEN 11000 AND 12000
);

-- 40. List all the employees who have greater than average pay. Display the result in the
-- increasing order of the salary.
select empname ,basicpay from emp
where basicpay>(
select avg(basicpay) from emp)
order by basicpay asc;


-- 41. List the employees who draws highest salary
select  max(basicpay) from emp;

SELECT empcode, empname, basicpay
FROM emp
WHERE basicpay = (
    SELECT MAX(basicpay)
    FROM emp
);
-- 42. List all the employees other than the employees who draw highest salary
select empcode, empname, basicpay
from emp
where basicpay <>(
select max(basicpay)
from emp
);

-- 43. List the employees who draw highest salary in each department
select e.empname, d.deptname, e.basicpay from
emp as e
join dept as d
on e.deptcode=d.deptcode
where e.basicpay=(
select max(basicpay)
from emp 
where emp.deptcode=e.deptcode
);

-- 44. List the employee(s) getting second highest salary
select empname, basicpay 
from emp
where basicpay=(
select basicpay from emp
order by basicpay desc
limit 1 offset 1
);

-- 45.List the employee(s) who are getting fifth highest salary.
select empname, basicpay 
from emp
where basicpay=(
select distinct basicpay from emp
order by basicpay desc
limit 1 offset 4
);
-- 46. List the female employee who draws the highest salary higher than any other
-- female employee
select empname, basicpay from
emp
where basicpay=(select
max(basicpay) from emp
where sex='F'
);

SELECT empcode, empname, sex, basicpay
FROM emp
WHERE sex = 'F'
  AND basicpay = (
      SELECT MAX(basicpay)
      FROM emp
      WHERE sex = 'F'
  );
-- 47. List the department name of the female employee who draws the highest salary
-- higher than any other female employee

select e.empname, d.deptname ,e.basicpay
from emp as e
join dept as d
on e.deptcode =d.deptcode
where e.basicpay =(
select max(basicpay)from emp
where sex='F'
);

SELECT d.deptname
FROM emp AS e
JOIN dept AS d 
  ON e.deptcode = d.deptcode
WHERE e.sex = 'F'
  AND e.basicpay = (
      SELECT MAX(basicpay)
      FROM emp
      WHERE sex = 'F'
  );
-- 48. List the department manager of the department, in which the female employee
-- who draws the highest salary higher than any other female employee works in
SELECT m.empcode AS manager_code, m.empname AS manager_name, m.deptcode
FROM emp AS m
JOIN desig AS d 
  ON m.desigcode = d.desigcode
WHERE d.designame = 'Manager' 
  AND m.deptcode IN (
      SELECT e.deptcode
      FROM emp AS e
      WHERE e.sex = 'F'
        AND e.basicpay = (
            SELECT MAX(basicpay)
            FROM emp
            WHERE sex = 'F'
        )
  );


-- 49. List all male employees who draw salary greater than atleast on female employee
select  empname, basicpay from emp
where (sex='M' or sex='T')and basicpay >(select
min(basicpay) from emp
where sex='F'
);
-- 50. List the departments in which average salary of employees is more than average
-- salary of the company
SELECT d.deptcode, d.deptname, AVG(e.basicpay) AS avg_dept_salary
FROM emp AS e
JOIN dept AS d 
  ON e.deptcode = d.deptcode
GROUP BY d.deptcode, d.deptname
HAVING AVG(e.basicpay) > (
    SELECT AVG(basicpay)
    FROM emp
);


-- 51. List the employees drawing salary lesser than the average salary of employees
-- working for ‘accounts’ department

SELECT empcode, empname, basicpay
FROM emp
WHERE basicpay < (
    SELECT AVG(basicpay)
    FROM emp
    WHERE deptcode = (
        SELECT deptcode
        FROM dept
        WHERE deptname = 'Accounts'
    )
);

/*Section -3
Views Practice questions:
1. Write a view to compute the employee age of the organization*/
create view compute_age as
select empname, year(current_date)- year(birthdate) as age from emp;

select * from compute_age;

-- 2. Write a view to compute the employee experience with the organization
create view compute_experince as
select empname, year(current_date)- year(joindate) as experience from emp;

-- 3. Write a view that computes the employee pay for the current month for all the
-- employees. Hint: Compute the employee pay as the Basic+Allowance-Deduction
create view compate_pay as
select  e.empname, (s.basic+s.allow-s.deduct) as current_pay 
from emp as e
join salary as s
on e.empcode=s.empcode
where s.salmonth=(
select max(salmonth)
from salary
);
select * from salary;


-- 4. List the employees who are older than their supervisors. Hint: Use views to
-- implement employee age
create  view  emp_age_gts as
SELECT 
    e.empname AS employee_name,

    TIMESTAMPDIFF(YEAR, e.birthdate, CURRENT_DATE) AS employee_age

FROM emp AS e
JOIN emp AS s
    ON e.supcode = s.empcode
WHERE TIMESTAMPDIFF(YEAR, e.birthdate, CURRENT_DATE) >
      TIMESTAMPDIFF(YEAR, s.birthdate, CURRENT_DATE);
      
-- 5. Write a view to display the total number of employees in each department
CREATE VIEW department_employee_counts AS
select d.deptname , count(e.empcode) from emp as e
left join dept as d
on e.deptcode=d.deptcode
group by d.deptname order by count(e.empcode) desc;

-- 6. Write a view to display the total number of employees in the organization
create view total_emp as
select count(*) as total_emp from emp;
 
-- 7. Use the views in Qn No 5 & Qn No 6, to display the percentage of employees in
-- each department
SELECT 
    d.deptname,
    d.count(e.empcode) AS total_employees,
    ROUND(
        (d.count(e.empcode) * 100.0) / t.total_emp,
        2
    ) AS employee_percentage
FROM department_employee_count AS d
CROSS JOIN total_emp AS t;

/*Section -4
Index and temporary tables
1. Create emp_index on table emp on the field birthdate.*/
create index emp_index on emp(birthdate);
describe emp;

-- 2. Create unique index dept_index on table dept on the field deptname.
create unique index dept_index  on  dept(deptname);

-- 3. Create students table, with filed id, name, age, gender, index on id 
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT,
    gender CHAR(1),
    INDEX idx_student_id (id)
);

-- 4. Drop index of table emp
alter table emp drop index emp_index;
-- 5. Find all the index of table dept
show index from dept;


-- 6. Create a temporary table student with field with filed id, name, age, gender
CREATE TEMPORARY TABLE student (
    id INT,
    name VARCHAR(100),
    age INT,
    gender CHAR(1)
);

-- 7. Logout from session and login again to check if temporary table exists.

select * from student;
-- 8. Create a temporary table test
CREATE TEMPORARY TABLE test (
    id INT,
    name VARCHAR(100),
    age INT,
    gender CHAR(1)
);
-- 9. Drop temporary table test

drop table test;