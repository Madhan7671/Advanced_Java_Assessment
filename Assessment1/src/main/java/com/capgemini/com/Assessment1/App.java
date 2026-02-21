package com.capgemini.com.Assessment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        try {
        	em.getTransaction().begin();

            Employee emp = new Employee();
            emp.setName("John");
            emp.setEmail("john@example.com");

            IdCard card = new IdCard(null, "IDC101","2026-02-14", emp);

            emp.setIdcard(card);
            card.setEmployee(emp);

            em.persist(emp);

            em.getTransaction().commit();
            System.out.println("Employee Created Successfully");

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }

    }
}
