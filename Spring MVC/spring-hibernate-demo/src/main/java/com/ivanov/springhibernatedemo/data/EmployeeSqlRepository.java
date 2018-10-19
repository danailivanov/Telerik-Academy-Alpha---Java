package com.ivanov.springhibernatedemo.data;

import com.ivanov.springhibernatedemo.models.Address;
import com.ivanov.springhibernatedemo.models.Employee;
import com.ivanov.springhibernatedemo.models.Project;
import com.ivanov.springhibernatedemo.models.Town;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeSqlRepository implements EmployeeRepository {

    private SessionFactory factory;

    @Autowired
    public EmployeeSqlRepository(SessionFactory factory) {
        this.factory = factory;
    }
    //        private static final SessionFactory factory;
//
//    static {
//        factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Town.class)
//                .addAnnotatedClass(Address.class)
//                .addAnnotatedClass(Project.class)
//                .buildSessionFactory();
//    }

    @Override
    public Employee getById(int id) {
        Employee employee = null;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            employee = session.get(Employee.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();

        try (Session session = factory.openSession()) {
            session.beginTransaction();
            employees = session.createQuery("from Employee").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }
}
