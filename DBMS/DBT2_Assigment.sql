create database DBT2Assigments;

use DBT2Assigments;

/*ASSIGNMENT 1- Create an Employee table containing `Employee No`, `Employee Name`,
and `Salary`.
Write and execute a MySQL program that accepts an employee number, checks the
employee's salary, and displays:
* **Salary ≥ 3000** → `High Salary`
* **Salary < 3000** → `Low Salary`
Test the program with 2–3 employee records and display the output*/

create table Employee (
Employee_No int,
Employee_name varchar(30),
salary decimal(10,2)
);

insert into Employee
(Employee_No,
Employee_name ,
salary )
values (101,' ajay',3000),
(102,"kasi",4000),
(103,'naga',2000),
(104,'kumar',1500),
(105,'CDAC sai',5000);

delimiter //
create procedure high_low_salary(in empid int)
begin
declare sal decimal(10,2);
declare exit handler for not found
	begin
		select'not found employee' as error_meassage;
	end;
select salary into sal from Employee where Employee_No =empid;
if sal >=3000 then
	select 'High Salary' as salary_grade;
else 
	select 'Low Salary' as salary_grade;
end if;

end //
delimiter ;

call high_low_salary(101);
call high_low_salary(103);
call high_low_salary(106);

-- ASSIGNMENT 2 - Create a Student table with the following columns:
-- * `Student No` – Primary Key
-- * `Student Name`
-- * `Student Marks`
-- Write and execute a MySQL stored procedure named *check result* that accepts a
-- student number, checks the student's marks, and displays the result as Distinction,
-- First Class, Pass, or Fail based on the marks.
-- Test the procedure using 2–3 student records and display the output.

create table Student (
Student_No int primary key,
Student_Name varchar(30),
Student_Marks int
);

insert into Student values(14, 'Keerthan', 100),
(10, 'ram', 80),
(17, 'Sai', 75),
(11, 'Ajay', 60),
(15, 'kasi', 34);

delimiter //
create procedure result(in std_no int)
begin
	declare marks int;
    declare exit handler for not found
    begin
		select 'Student  Not Found' as Message;
    end;    
    select Student_Marks into marks from Student where Student_No = std_no;
    
    if marks >= 85 then
		select 'Distinction' as ResultStatus;
	elseif marks >= 75 then
		select 'First Class' as ResultStatus;
    elseif marks >= 35 then
		select 'Pass' as ResultStatus;  
	else 
        select 'Fail' as ResultStatus;  
   end if;     
end //
delimiter ;

call result(14);
call result(10);
call result(17);
call result(11);
call result(15);

-- ASSIGNMENT 3 -Write and execute a MySQL program using conditional statement to
-- accept a grade (`A–Z`) from the user and display the following messages:
-- * **A** → `Congratulations!`
-- * **B** → `You are in B. Try to go to A.`
-- * **C** → `Try to go to B.`
-- * **D–Z** → `Invalid grade is entered.`
-- Demonstrate the program with appropriate sample inputs and outputs.


delimiter //
create procedure grade(in grade varchar(1))
begin
	case 
		when upper(grade) = 'A' then
			select 'Congratulations!' as Message;
          when upper(grade) = 'B' then
			select 'You are in B. Try to go to A.' as Message;
		 when upper(grade) = 'C' then
			select 'You are in B. Try to go to A.' as Message;
            else 
				select 'Invalid grade is entered.'as Message;
            end case;
end //
delimiter ;

call grade('a');
call grade('B');
call grade('c');
call grade('x');

-- ASSIGNMENT 4 - Write a command in MYSQL , which will list all the procedures stored
-- under the folder .
-- 1-Write and execute the appropriate MySQL command to list all the stored procedures
-- available in a given database/schema.
-- 2-Also, display the details of any one stored procedure using the appropriate MySQL
-- command.

SHOW PROCEDURE STATUS WHERE Db = 'DBT2Assigments';

show CREATE PROCEDURE grade;

-- ASSIGNMENT 5 - Create a cursor program on student table having two columns student
-- number and marks . When the cursor program is executed, It should assign ranks
-- based on the marks.
-- If two or more students have secured same ranks both of them should be given same
-- ranks and maximum three ranks should be given.
--  1. Write a PL/SQL cursor program to assign ranks based on marks. Students with the
-- same marks should receive the same rank, with a **maximum of three ranks**.
-- 2. Create 2–3 suitable triggers on the Student table.
-- 3. Execute and demonstrate the triggers using appropriate `INSERT`, `UPDATE`, or
-- `DELETE` statements.
-- 4. Display the final Student No, Marks, and Rank.


drop table if exists Student;
create table Student (
    student_no int primary key,
    marks int,
    student_rank int
);

delimiter //

create procedure Rank_assign()
begin
    declare done int default false;
    declare s_no int;
    declare s_marks int;
    declare current_rank int default 0;
    declare last_marks int default -1;
    
    declare cur cursor for 
        select student_no, marks 
        from Student 
        order by marks desc;
        
    declare continue handler for not found set done = true;

    update Student set student_rank = null;

    open cur;

    read_loop: loop
        fetch cur into s_no, s_marks;
        if done then
            leave read_loop;
        end if;

        if s_marks <> last_marks then
            set current_rank = current_rank + 1;
            set last_marks = s_marks;
        end if;

        if current_rank <= 3 then
            update Student 
            set student_rank = current_rank 
            where student_no = s_no;
        else
            leave read_loop;
        end if;
    end loop;

    close cur;
end //

delimiter ;

delimiter //

create trigger student_after_insert
after insert on Student
for each row
begin
end //

create trigger student_after_update
after update on Student
for each row
begin
end //

create trigger student_after_delete
after delete on Student
for each row
begin
end //

delimiter ;

insert into Student (student_no, marks) values 
(1, 95),
(2, 90),
(3, 95),
(4, 85),
(5, 80),
(6, 90);

call Rank_assign();
select * from Student order by marks desc;

insert into Student (student_no, marks) values (7, 98);
call Rank_assign();
select * from Student order by marks desc;

update Student set marks = 92 where student_no = 2;
call Rank_assign();
select * from Student order by marks desc;

delete from Student where student_no = 1;
call Rank_assign();
select * from Student order by marks desc;



-- ASSIGNMENT 6- MySQL Audit Trigger
-- Create an Employee table with suitable columns such as `Employee No`, `Employee
-- Name`, `Department`, and `Salary`.
-- Create an Audit table to maintain a record of changes made to the Employee table.
-- Write and execute MySQL audit triggers to:
-- 1. Record details whenever an employee record is *inserted*.
-- 2. Record details whenever an employee record is *updated*.
-- 3. Record details whenever an employee record is *deleted*.
-- The Audit table should store relevant information such as Employee Number, Action
-- Type, Old/New Salary, and Date/Time of the action.
-- Execute the triggers using suitable `INSERT`, `UPDATE`, and `DELETE` statements and
-- display the audit records.

drop table if exists Employee;
create table Employee (
    Emp_No int primary key,
    Emp_Name varchar(50) not null,
    Department varchar(50) not null,
    Salary decimal(10, 2) not null
);
INSERT INTO Employee (Emp_No, Emp_Name, Department, Salary) 
VALUES 
(101, 'Amit Sharma', 'IT', 75000.00),
(102, 'Priya Patel', 'HR', 62000.00),
(103, 'Rohan Das', 'Finance', 85000.00),
(104, 'Sneha Reddy', 'Marketing', 58000.00);

drop table if exists audit;
create table audit (
    auditNo int auto_increment primary key,
    Emp_No int,
    type_of_op varchar(10),
    old_salary decimal(10, 2),
    new_salary decimal(10, 2),
    timeOp timestamp default current_timestamp
);

delimiter //

create trigger insertTr
after insert on Employee
for each row
begin
    insert into audit (Emp_No, type_of_op, old_salary, new_salary)
    values (new.Emp_No, 'INSERT', null, new.Salary);
end //
delimiter ;
delimiter //
create trigger updateTr
after update on Employee
for each row
begin
    insert into audit (Emp_No, type_of_op, old_salary, new_salary)
    values (new.Emp_No, 'UPDATE', old.Salary, new.Salary);
end //
delimiter ;
delimiter //
create trigger deleteTr
after delete on Employee
for each row
begin
    insert into audit (Emp_No, type_of_op, old_salary, new_salary)
    values (old.Emp_No, 'DELETE', old.Salary, null);
end //

delimiter ;

insert into Employee (Emp_No, Emp_Name, Department, Salary) values (108, 'Sharma', 'IT', 79000.00);
update Employee set Salary = 90000.00 where Emp_No = 108;
delete from Employee where Emp_No = 108;



select * from audit;

-- ASSIGNMENT 7- MySQL Tracking Operation Trigger
-- Create an Employee table with suitable fields such as `Employee No`, `Employee
-- Name`, `Department`, and `Salary`.
-- Create a Tracking table to record the operations performed on the Employee table.
-- Write and execute MySQL triggers to track the following operations:
-- 1. INSERT – Record when a new employee is added.
-- 2. UPDATE – Record when employee details are modified.
-- 3. DELETE– Record when an employee record is deleted.
-- The Tracking table should store the **Employee Number, Operation Type, and
-- Date/Time of the operation**.
-- Execute suitable `INSERT`, `UPDATE`, and `DELETE` statements and display the
-- tracking records generated by the triggers.

drop table if exists Track;
create table Track (
    Emp_No int, 
    type_of_op varchar(10), 
    timeOp timestamp default current_timestamp
);

delimiter //

create trigger TrackIn
after insert on Employee
for each row
begin
    insert into Track (Emp_No, type_of_op) 
    values (new.Emp_No, 'INSERT');
end //

create trigger TrackUp
after update on Employee
for each row
begin
    insert into Track (Emp_No, type_of_op) 
    values (old.Emp_No, 'UPDATE');
end //

create trigger TrackDel
after delete on Employee
for each row
begin
    insert into Track (Emp_No, type_of_op) 
    values (old.Emp_No, 'DELETE');
end //

delimiter ;

insert into Employee (Emp_No, Emp_Name, Department, Salary) 
values (105, 'Vikas Kumar', 'IT', 79000.00);

update Employee set Salary = 90000.00 where Emp_No = 105;
delete from Employee where Emp_No = 105;


select * from Employee;
select * from Track;
