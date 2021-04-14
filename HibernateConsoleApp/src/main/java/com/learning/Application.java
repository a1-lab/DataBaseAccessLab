package com.learning;

import com.learning.database.HibernateUtil;
import com.learning.service.CustomerService;
import org.hibernate.SessionFactory;

public class Application {
    public static void main(String... args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        CustomerService customerService = new CustomerService(sessionFactory);
        customerService.createCustomer("test customer5");
    }
}
