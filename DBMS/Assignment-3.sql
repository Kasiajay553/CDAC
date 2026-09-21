create database db_DBMS;
use db_DBMS;


#creating the tables in DBMS DB 

# 1->Students table

CREATE TABLE Students(
student_id INT,
name VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
age NUMERIC NOT NULL,
course VARCHAR(50) NOT NULL,
CONSTRAINT py_student PRIMARY KEY(student_id)
);


# 2->Courses table

CREATE TABLE Courses(
course_id INT NOT NULL,
course_name VARCHAR(50) NOT NULL,
duration tinyint unsigned NOT NULL,
fee int NOT NULL,
constraint courses_id_py Primary key (course_id)
);

# 3->Enrollment table

CREATE TABLE Enrollment(
enrollment_id INT NOT NULL,
student_id int NOT NULL,
course_id int Not NUll,
enroll_date date NOT NULL,
constraint enrollment_id_py primary key(enrollment_id),
foreign key (student_id) references Students(student_id) ON UPDATE CASCADE ON  DELETE  CASCADE,
foreign key (course_id) references Courses(course_id) ON UPDATE CASCADE ON  DELETE  CASCADE
);


select * from Students;
select * from Courses;
select * from Enrollment;


#Modifying tables
-- adding the phone_number to the students table
alter  table Students add phone_number varchar(12) null; 

-- change the datatyoe of fee int deciamal(10,2)
alter table Courses modify column fee decimal(10,2);

-- rename the course_name to course_title in table Courses
alter table Courses rename column course_name to course_title;

#Drop table 
drop table Enrollment;

# 4. Insert Data
-- Inserting 5 records into the Students table
INSERT INTO Students (student_id, name, email, age, course, phone_number) VALUES
(1, 'Alice Johnson', 'alice@example.com', 20, 'Computer Science', 1234567890),
(2, 'Bob Smith', 'bob@example.com', 17, 'Data Science', 1987654321),
(3, 'Charlie Brown', 'charlie@example.com', 22, 'Mathematics', 1122334455),
(4, 'Diana Prince', 'diana@example.com', 19, 'Physics', 1555666777),
(5, 'Evan Wright', 'evan@example.com', 16, 'Computer Science', 1999888777);


-- Inserting 5 records into the Courses table
INSERT INTO Courses ( course_id, course_title, duration, fee) VALUES
(101, 'Introduction to CS', 4, 500.00),
(102, 'Data Analytics basics', 3, 600.00),
(103, 'Advanced Calculus', 5, 450.00),
(104, 'Quantum Mechanics', 4, 700.00),
(105, 'Web Development', 3, 350.00);


# 5.Update Data
-- Update the fee to 10% in courses table
set sql_safe_updates=0;
UPDATE Courses set fee=fee+(fee*0.1);
set sql_safe_updates=1;


#6.Delete Data
-- remove the students who are younger than 18 from the Students table
set sql_safe_updates=0;
delete from Students where age<18;
set sql_safe_updates=1;


#7.Truncate Data
-- truncate the data fromthe Courses table
truncate table Courses;

# 8.User Management & Privileges
--  Create a new database user 'academy_user'
create user 'academy_user'@'localhost' identified by 'password123';

-- Grant SELECT, INSERT, and UPDATE privileges to academy_user on the Students table 
grant select,insert,update on Students to 'academy_user'@'localhost';

-- Revoke the INSERT privilege from academy_user
revoke insert on Students from 'academy_user'@'localhost';

-- SHOW GRANTS FOR 'academy_user'@'localhost';

#9.Transaction Controlo
-- Begin a transaction, insert a new student, and then rollback the transaction.
start transaction;

INSERT INTO Courses (course_id, course_title, duration, fee) VALUES
(101, 'Introduction to CS', 4, 500.00);

INSERT INTO Students (student_id, name, email, age, course, phone_number) VALUES
(6, 'Alice', 'alice@example.com', 22, 'Computer Science', 1234567891);

select * from Students;
Select * from Courses;

rollback;
select * from Students;

-- Insert another student and commit the transaction
start transaction;
INSERT INTO Students (student_id, name, email, age, course, phone_number) VALUES
(7, 'john', 'john@example.com', 22, 'Mechanical', 1234567887);
select * from Students;
commit;