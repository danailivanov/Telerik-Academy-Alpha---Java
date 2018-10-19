-- task 1
select e.FirstName, e.LastName, e.Salary from employees e
where e.Salary = (select min(Salary) from employees)

-- task 2
select e.FirstName, e.LastName, e.Salary from employees e
where e.Salary <= (select min(Salary) from employees) * 1.1

-- task 3
select e.FirstName, e.LastName, d.Name, e.Salary
from employees e
join departments d on e.DepartmentID = d.DepartmentID
where e.salary = (select min(salary) from employees as em
where em.DepartmentId = d.DepartmentID)

-- task 4
select avg(e.Salary)
from employees e
where DepartmentID = 1

-- task 5
select avg(e.Salary) from employees e
join departments d on e.DepartmentID = d.DepartmentID
where d.Name = 'Sales' 

-- task 6
select count(e.Salary) from employees e
join departments d on e.DepartmentID = d.DepartmentID
where d.Name = 'Sales' 

-- task 7
select count(e.EmployeeID) from employees e
where e.ManagerID is not NULL

-- task 8
select count(e.EmployeeID) from employees e
where e.ManagerID is NULL

-- task 9
select d.Name, avg(e.Salary) from employees e
join departments d on e.DepartmentID = d.DepartmentID
group by d.Name
order by d.DepartmentID

-- task 10
select d.Name, t.Name, count(e.EmployeeID) from employees e
join departments d on e.DepartmentID = d.DepartmentID
join addresses a on e.AddressID = a.AddressID
join towns t on a.TownID = t.TownID
group by t.Name, d.Name

-- task 11
select m.FirstName, m.LastName from employees m
join employees e on e.ManagerID = m.EmployeeID
group by m.FirstName, m.LastName
having count(e.ManagerID) = 5

-- task 12





