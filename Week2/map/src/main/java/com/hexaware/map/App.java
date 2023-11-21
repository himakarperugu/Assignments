package com.hexaware.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Products food=new Products();
        food.setProduct_id(201);
        food.setProduct_name("Biryani");
       
        Customers user=new Customers();
        user.setCustomer_id(101);
        user.setCustomer_name("ravi");
        
        /*user.setProduct(food);*/
        user.getProduct().add(food);
        food.getCustome().add(user);
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Customers.class).addAnnotatedClass(Products.class);
        
        SessionFactory sf = config.buildSessionFactory();   
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        session.persist(user);
        session.persist(food);
        
        session.getTransaction().commit();
    }
}