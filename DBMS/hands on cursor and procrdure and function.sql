use db_employees;

delimiter //
create procedure pout( in empno int ,
inout emname varchar(30),
inout emsalary decimal(10,2))
begin
-- select employee_name, salary from  employees where empno=employee_id;

set emname='ajaykumar';
set emsalary=emsalary+34;
end //
delimiter ;

delimiter //

create procedure previcerout(in id int)
begin
declare emp_id int;
declare empname varchar(30);
declare empsalary decimal(10,2);
declare done int default false;

declare c1 cursor  for
	select employee_id, employee_name, salary from  employees where employee_id=id;
    
declare continue handler for not found set done =true;

open c1;
 read_loop : loop
	fetch c1 into emp_id, empname, empsalary;
    
    if done then
		 leave read_loop;
	end if;
    
    call pout(emp_id, empname, empsalary);
    
    update employees set
    employee_name=empname,
	salary=empsalary
    where employee_id=emp_id;
end loop;
close c1;

end //
delimiter ;
select * from employees;
call previcerout(101);

delimiter //
create function f1(
empid int)
returns decimal(10,2)
deterministic
begin
 declare esalary decimal(10,2);
 select salary into esalary from employees where employee_id=empid;
 if esalary<=500000 then
	set esalary=esalary+ 5000;
else 
set esalary=esalary;
end if;
return esalary;
end//

create procedure functioncall(in empid int)
begin
	
    declare empsalary decimal(10,2);
    declare done int default false;
    
     declare c2 cursor for
		select salary from employees where employee_id=empid;
        
    declare continue handler for not found set done=true;
   
	open c2 ;
	read_loop: loop
		fetch c2 into empsalary;
        
        if done then
			leave read_loop;
		end if;
        
        set empsalary=f1(empid);
        update employees set salary=empsalary where employee_id =empid;
	end loop;
    close c2;

end//

delimiter ;
call functioncall(101);
select * from employees;

delimiter //

create trigger  day_insert_check
before insert on employees
for each row
begin 
  if dayname(now()) ='thursday' then
	signal sqlstate '45000'
    set message_text='we cant insert on thursady';
end if;
end //
insert into employees value(111,'mannu', 30, 'hr', 345000, null, '2026-08-09');