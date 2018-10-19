-- task 1 
select p.ProductName, p.UnitPrice from products p
order by p.UnitPrice desc limit 3

-- task 2
select p.ProductName, s.CompanyName from products p
join suppliers s on p.SupplierID = s.SupplierID
order by p.ProductName limit 5

-- task 3
select m.FirstName, m.LastName from employees m
join employees e on e.ReportsTo = m.EmployeeID
group by m.FirstName, m.LastName
having count(e.ReportsTo) > 2

-- task 4
select p.ProductName, max(UnitPrice), c.CategoryName from products p
join categories c on p.CategoryID = c.CategoryID
group by c.CategoryName
order by max(UnitPrice)

-- task 5
select t.CompanyName from shippers as t
join orders o on t.ShipperID = o.ShipVia
having max(o.ShipVia)

