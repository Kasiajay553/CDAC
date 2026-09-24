CREATE DATABASE IF NOT EXISTS db_employees;

USE db_employees;

-- ==================================================================
-- 2. REMOVE OLD TABLES
-- Drop child tables before parent tables so the script can be rerun.
-- ==================================================================

DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS salary_grades;
DROP TABLE IF EXISTS shifts;
DROP TABLE IF EXISTS departments;


-- ==================================================================
-- 3. CREATE TABLES
-- ==================================================================

-- Parent table used in most join examples.
CREATE TABLE departments (
    department_id   INT PRIMARY KEY,
    department_name VARCHAR(60) NOT NULL UNIQUE,
    location        VARCHAR(60) NOT NULL
) ;


-- Employee has two relationships:
--   department_id references departments
--   manager_id references another employee
CREATE TABLE employees (
    employee_id   INT PRIMARY KEY,
    employee_name VARCHAR(100) NOT NULL,
    department_id INT NULL,
    job_title     VARCHAR(80) NOT NULL,
    salary        DECIMAL(10,2) NOT NULL,
    manager_id    INT NULL,
    joining_date  DATE NOT NULL,
    CONSTRAINT fk_employee_department
        FOREIGN KEY (department_id)
        REFERENCES departments (department_id)
        ON UPDATE CASCADE
        ON DELETE SET NULL,
    CONSTRAINT fk_employee_manager
        FOREIGN KEY (manager_id)
        REFERENCES employees (employee_id)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);


-- Used to demonstrate CROSS JOIN.
CREATE TABLE shifts (
    shift_id   INT PRIMARY KEY,
    shift_name VARCHAR(30) NOT NULL UNIQUE,
    start_time TIME NOT NULL,
    end_time   TIME NOT NULL
);


-- Used to demonstrate a non-equi range join.
CREATE TABLE salary_grades (
    grade_code VARCHAR(2) PRIMARY KEY,
    min_salary DECIMAL(10,2) NOT NULL,
    max_salary DECIMAL(10,2) NOT NULL,
    CONSTRAINT chk_salary_grade_range
        CHECK (min_salary <= max_salary)
) ;


-- ==================================================================
-- 4. INSERT SAMPLE DATA
-- ==================================================================

INSERT INTO departments
    (department_id, department_name, location)
VALUES
    (10, 'Engineering', 'Bangalore'),
    (20, 'Human Resources', 'Hyderabad'),
    (30, 'Sales', 'Mumbai'),
    (40, 'Finance', 'Pune'),
    (50, 'Research', 'Chennai');


-- Managers are inserted before employees who reference them.
-- Imran has no department to create an unmatched employee row.
-- Finance and Research have no employees to create unmatched departments.
INSERT INTO employees
    (employee_id, employee_name, department_id, job_title,
     salary, manager_id, joining_date)
VALUES
    (101, 'Asha',  10,   'Engineering Manager', 90000.00, NULL, '2018-04-16'),
    (102, 'Ravi',  10,   'Software Engineer',   72000.00, 101,  '2021-06-15'),
    (103, 'Neha',  20,   'HR Manager',          68000.00, 101,  '2019-08-05'),
    (104, 'Kiran', 30,   'Sales Executive',     85000.00, 103,  '2020-11-20'),
    (105, 'Imran', NULL, 'Independent Analyst', 55000.00, NULL, '2023-01-12');


INSERT INTO shifts
    (shift_id, shift_name, start_time, end_time)
VALUES
    (1, 'Morning', '08:00:00', '16:00:00'),
    (2, 'Evening', '14:00:00', '22:00:00');


-- Ranges do not overlap, so each employee matches one grade.
INSERT INTO salary_grades
    (grade_code, min_salary, max_salary)
VALUES
    ('A',     0.00, 59999.99),
    ('B', 60000.00, 79999.99),
    ('C', 80000.00, 99999.99),
    ('D',100000.00,149999.99);


-- ==================================================================
-- 5. VALIDATE THE SETUP
-- ==================================================================

SELECT * FROM departments ORDER BY department_id;
SELECT * FROM employees ORDER BY employee_id;
SELECT * FROM shifts ORDER BY shift_id;
SELECT * FROM salary_grades ORDER BY min_salary;

# SECTION A - INNER AND EQUI JOINS
-- 1. Display the employee ID, employee name, department name and department
-- 	location for employees who have a matching department.

select e.employee_id, e.employee_name, d.department_name, d.location
from employees as e
join departments as d
on e.department_id=d.department_id;

-- 2. Display the employee name, job title and department name for employees
-- 	working in the Engineering department.

select e.employee_name, e.job_title, d.department_name
from employees as e
join departments as d
on e.department_id=d.department_id
where  d.department_name like'%Engineering%';

-- 3. Display the employee name, salary and department name for matched employees
-- whose salary is greater than 70000.

select e.employee_name, e.salary, d.department_name
from employees as e
join departments as d
on e.department_id=d.department_id
where  e.salary>70000;

-- 4. Write an equi join between employees and departments using department_id.
-- Display employee_name, department_id and department_name.

select e.employee_name, d.department_id, d.department_name
from employees as e
inner join departments as d
on e.department_id=d.department_id;

-- 5. Display every employee along with the corresponding department name. An
-- employee without a department must also appear.

select * from employees as e
left join departments as d
on e.department_id=d.department_id;

-- 6. Find employees who do not have a matching department. Display employee_id
-- and employee_name.
select employee_id, employee_name
from employees  where
department_id is null;


-- 7. Use RIGHT JOIN to display every department and any employees assigned to it.
-- Include departments that do not have employees.
select * from departments as d
right join employees as e
on d.department_id= e.department_id;

-- 8. Rewrite Question 7 using LEFT JOIN instead of RIGHT JOIN.
select * from departments as d
left join employees as e
on d.department_id= e.department_id;

-- 9. Find departments that do not have any employees. Display department_id,
-- department_name and location.
SELECT d.department_id, d.department_name, d.location FROM
departments AS d LEFT JOIN employees AS e
ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;

-- 10. Produce a full outer join result between employees and departments in
-- MySQL. The result must include matched rows, employees without departments,
-- and departments without employees. Use LEFT JOIN, RIGHT JOIN and UNION ALL.

select * from employees AS e
left join departments as d
on e.department_id=d.department_id
where d.department_id is null
union
select * from employees AS e
right join departments as d
on e.department_id=d.department_id
where e.department_id is null;

-- 11. Generate every possible employee and shift combination. Display
-- employee_name, shift_name, start_time and end_time.

select employee_name, shift_name, start_time, end_time
from employees
join shifts;

-- 12. Generate employee-shift combinations only for employee IDs 101, 102 and
-- 103. Sort the result by employee_id and shift_id.

select * from employees as e
join shifts as s
where e.employee_id in(102,101,103)
order by e.employee_id asc, s.shift_id asc;

SELECT 
    e.employee_id,
    e.employee_name,
    s.shift_id,
    s.shift_name
FROM employees AS e
CROSS JOIN shifts AS s
WHERE e.employee_id = 101 
   OR e.employee_id = 102 
   OR e.employee_id = 103
ORDER BY e.employee_id ASC, s.shift_id ASC;

-- 13. Calculate the expected number of rows produced when all employees are
-- CROSS JOINed with all shifts. Display employee_count, shift_count and
-- expected_combinations.
select 
count(distinct employee_id) as employee_count, -- distinct used to get the unique or non repeat values.
count(distinct shift_id) as shift_count,
count(*) as expected_combinations
from employees as e
cross join shifts as s;

-- 14. Use a self join to display employees who have a manager. Show the employee
-- name and manager name.
select * from employees;
select e.employee_name, m.employee_name as manager
from employees as e
join employees as m
on m.manager_id=e.employee_id ;


-- 15. Modify the self join so that all employees appear, including employees
-- without a manager. Display "No manager" for a missing manager.
SELECT 
    e.employee_name, 
    COALESCE(m.employee_name, 'No manager') AS manager
FROM employees AS e
 JOIN employees AS m 
  ON e.manager_id = m.employee_id;

-- 16. Use a non-equi join to assign every employee to a salary grade. Display
-- employee_name, salary and grade_code.

select employee_name, salary, grade_code from employees as e
join salary_grades as s
on e.salary between s.min_salary  and s.max_salary;

-- 17. Use NATURAL JOIN to display employee_id, employee_name, department_id and
-- department_name for matched employees.

select e.employee_id,e.employee_name, d.department_id, d.department_name
from employees as e
natural join departments as d;


-- SECTION E - ON AND WHERE FILTER PLACEMENT
-- ========================================

-- 18. Write a LEFT JOIN that preserves every employee but matches department
-- details only when the department name is Engineering. Put the department
-- filter inside the ON clause.

 select * from employees as e
left join departments as d
on e.department_id=d.department_id
and d.department_name like '%Engineering%';

-- 19. Write the same department filter in the WHERE clause. Compare the output
-- with Question 18 and note which employee rows disappear.

select * from employees as e
left join departments as d
on e.department_id=d.department_id
where d.department_name like '%Engineering%';

-- SECTION F - JOINS WITH AGGREGATION
-- ========================================\

-- 20. Count the number of employees in every department. Departments with no
-- employees must appear with employee_count equal to zero.

SELECT d.department_name, COUNT(e.employee_id) 
AS employee_count
FROM departments AS d
LEFT JOIN employees AS e
ON d.department_id = e.department_id
GROUP BY d.department_name;

-- 21. Calculate the average employee salary for every department. Include empty
-- departments and display zero as their average salary.

select d.department_name, ifnull(avg(e.salary),0) as average_salary
from employees as e
right join departments as d
ON d.department_id = e.department_id
GROUP BY d.department_name;

-- 22. Display only departments that have at least two employees. Show
-- department_name and employee_count.

select department_name, count(e.employee_id) as employee_count
from employees as e
right join departments as d
ON d.department_id = e.department_id
GROUP BY d.department_name
having count(e.employee_id)>=2;

-- 23. Display each department's total salary expense. Include empty departments
-- and display zero for their total salary.

select department_name,ifnull(max(salary),0) as total_salary
from employees as e
right join departments as d
ON d.department_id = e.department_id
GROUP BY d.department_name;


-- SECTION G - MULTIPLE JOINS AND ANALYSIS
-- ========================================


-- 24. Display employee_id, employee_name, department_name and manager_name for
-- every employee. Employees without a department or manager must remain in the result.

select e.employee_id, e.employee_name, d.department_name, m.employee_name as manager_name
from employees as e
left join employees as m
on  e.manager_id=e.employee_id
left join departments as d
on e.department_id = d.department_id;

-- 25. Display every department with its highest employee salary. Departments
-- without employees must appear with zero as highest_salary.

select d. department_name, ifnull(max(e.salary),0) as max_salary
from employees as e
right join departments as d
on e.department_id=d.department_id
group  by d.department_name;
