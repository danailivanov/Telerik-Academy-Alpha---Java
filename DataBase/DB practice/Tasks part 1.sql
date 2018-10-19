-- task 2
select * from departments

-- task 3
select name from departments

-- task 4
select salary from employees

-- task 5
select concat (firstname, " ", lastname) from employees

-- task 6
select concat (firstname, '.', lastname, '@telerik.com') as 'Full Email Addresses' from employees 

-- task 7
select salary from employees order by salary desc

-- task 8
select * from employees where jobtitle = 'Sales Representative'

-- task 9
select firstname from employees where firstname like 'sa%'

-- task 10
select lastname from employees where lastname like '%ei%'

-- task 11
select salary from employees where salary between 20000 and 30000

-- task 12
select concat (firstname, " ", lastname) from employees
where salary = '25000' or '14000' or '12500' or '23600'

-- task 13
select * from employees where managerID is null

-- task 14
select * from employees where salary > '50000'
order by salary desc

-- task 15
select * from employees where salary > '50000'
order by salary desc limit 5

-- task 16
select * from employees e 
join addresses a on e.AddressID = a.AddressID

-- task 17
select e.FirstName, e.LastName, a.AddressText from employees e 
join addresses a on e.AddressID = a.AddressID

-- task 18
select e.FirstName, e.LastName, e.ManagerID, m.firstname, m.lastname, m.employeeID  from employees e
join employees m on e.ManagerID = m.EmployeeID 

-- task 19 
select e.EmployeeID, e.FirstName, e.LastName, e.ManagerID, m.EmployeeID, m.FirstName, m.LastName, a.AddressText from employees as e
join employees as m on e.ManagerID = m.EmployeeID 
join addresses as a on e.AddressID = a.AddressID 

-- task 20 
select name from departments union select name from towns

-- task 21 
select e.FirstName, e.LastName, e.ManagerID, m.EmployeeID, m.FirstName, m.LastName  from employees m
right join employees e on e.ManagerID = m.EmployeeID

-- task 22
select e.FirstName, e.LastName, d.Name, e.HireDate
from employees e
join departments d on d.DepartmentID = e.DepartmentID
where d.Name in ('Sales', 'Finance') 
and (e.HireDate between '2002-01-01' and '2004-12-31' )
-- and (YEAR(e.HireDate) between 2002 and 2004 )