USE db_employees;

-- 1. list all the employees whose salary is greater than average salary
select employee_name, salary from employees
where salary>
(select avg(salary) from employees);


-- 2. list all the employees who belong to Sales department
 select * from departments;
select * from employees as e
where e.department_id =(
select department_id from departments as d
where department_name like 'sales'
) ;


-- 3.Employees who joined after the earliest Engineering joining date.

select * from employees
WHERE joining_date > (
    select min(e.joining_date) 
    from employees e
    join departments d on e.department_id = d.department_id
    where d.department_name = 'Engineering'
);

-- 4. Departments having at least one employee.
select * from departments
where department_id in (
    select distinct department_id 
    from employees
    where department_id is not null
);


-- 5.Employees in departments located in Bangalore or Mumbai.
select * from employees
where department_id in(
select department_id from departments
where location in('Bangalore','Mumbai')
);

select * from employees;

-- 6.Employees earning more than their manager.
select * from employees
where salary >(
select salary from employees m
WHERE m.employee_id = employees.manager_id
);

