use companiesdb;
select * from employee;

delimiter //
create procedure highest_lowest_salary( in empid Int)
begin
declare emp_salary decimal(10,2);
declare exit handler for not found
begin
	select concat('The emp id you enter is not found ' ,empid) as invalid_emp_id;
end;

select salary into emp_salary  from employee where emp_id=empid;

if emp_salary>30000 then
select 'highest_salary' as salary_level;
else 
select 'lowest_salary' as salary_level;
end if;
end //


delimiter ;
 call highest_lowest_salary(9);
 call highest_lowest_salary(4);
 CALL highest_lowest_salary(3);
 
 /* THE CODE THAT CAN HANDLE THE ALL TYPE OF ERROR AND TELL NUMBER OD ERROE AND MSG ALSO 
 DROP PROCEDURE IF EXISTS highest_lowest_salary;

delimiter // 

create procedure highest_lowest_salary(in empid Int) 
begin 
    declare emp_salary decimal(10,2);
    
    -- Variables to hold the dynamic error details (Like Java's Exception object variables)
    declare error_code int;
    declare error_msg varchar(255);
    
    -- CATCH-ALL HANDLER (Like Java's: catch (Exception e))
    declare exit handler for sqlexception
    begin
        -- STEP 1: Extract the error details (Like e.getMessage() and e.getErrorCode())
        get diagnostics condition 1 
            error_code = mysql_errno, 
            error_msg = message_text;
            
        -- STEP 2: Print the detailed "stack trace" to the screen
        select 
            concat('Execution Failed!') as status,
            error_code as mysql_error_number,
            error_msg as detailed_error_message;
    end;

    -- Your normal procedure logic
    select salary into emp_salary from employee where emp_id = empid;

    if emp_salary > 30000 then 
        select 'highest_salary' as salary_level; 
    else 
        select 'lowest_salary' as salary_level; 
    end if; 
end // 

delimiter ;
*/

-- 2 Question
delimiter //

CREATE PROCEDURE  creation_table_student()
begin 
create table  student(
std_id int primary key,
std_name varchar(30),
std_marks  int not null
 );
 end//
 
delimiter ;
 
call creation_table_student();
 select * from student;
 delimiter //
 create procedure result( in student_id int)
 begin
 declare marks int;
 select std_marks into marks from student where std_id=student_id;
 if marks >=85 then
	 select 'distincition' as result;
 elseif marks <85 and marks>=75 then
    select 'first Class' as result;
elseif marks <75 and marks>=65 then
    select 'second Class' as result; 
elseif marks <65 and marks>=35 then
    select 'pass' as result; 
else
    select 'fail' as result;
  end if;
 end //
 
 delimiter ;
 call result(1);
 DROP PROCEDURE IF EXISTS result;
 
 
 -- 3 question
 delimiter //
 create procedure grade_evaluation(in student_grade char(1)) 
 begin 
 case student_grade 
 when 'A' then 
  select 'congratulation for A' as feedback;
  when 'B' then 
  select 'your grade is B try for grade A' as feedback;
  when 'c' then 
  select 'your grade is C try to get grade B' as feedback;
  else 
   select ' you have entered invalid geade ' as feedback;
   end case;
   end //
   delimiter ;
   call grade_evaluation('A');
   call grade_evaluation('b');
   call grade_evaluation('m');
   call grade_evaluation('3');
   -- question
   SHOW PROCEDURE STATUS WHERE Db = 'companiesdb';
   
   
 

 