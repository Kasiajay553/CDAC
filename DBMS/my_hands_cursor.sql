use db_employees;
select * from employees;


delimiter //
create procedure  salary_incerment()
begin 
declare done int default false;
declare empid int;
declare jobtitle varchar(30);
 DECLARE c1 CURSOR FOR 
        SELECT employee_id, job_title FROM employees;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

open c1;
read_loop: loop
	fetch c1 into empid,jobtitle;
    if done then
		leave read_loop;
	end if;
   
    end loop read_loop;
    close c1;
    select employee_id, job_title from employees;
end //
delimiter ;

call salary_incerment();

delimiter //
create procedure display()
begin
	update  employees set salary=456000 where employee_id in (101,105);
end//

delimiter ; 

call display();

drop procedure display;