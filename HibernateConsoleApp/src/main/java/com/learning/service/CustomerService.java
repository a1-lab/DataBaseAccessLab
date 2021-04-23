package com.learning.service;

import com.learning.dao.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerService {
    
    private final SessionFactory sessionFactory;
    
    public CustomerService(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public CustomerEntity getCustomer(final int id) {
        return null;
    }
    
    public void createCustomer(final String name) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                CustomerEntity customerEntity = new CustomerEntity();
                customerEntity.setName(name);
                session.save(customerEntity);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
            }
        }
    }
}
