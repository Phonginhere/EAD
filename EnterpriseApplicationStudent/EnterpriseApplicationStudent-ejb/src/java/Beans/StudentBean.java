/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Models.Student;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class StudentBean implements StudentBeanLocal{

    private EntityManager entityManager = Persistence.createEntityManagerFactory("").createEntityManager();
    
    
    @Override
    public void insert(String rollnumber, String name, String email, Short age) {
        try{
            entityManager.getTransaction().begin();
            Student student = new Student(rollnumber, name, email, age);
            entityManager.persist(student);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch(Exception e){
            System.err.println("Cannot insert student, error: " +e.getMessage());
        }
    }
    
}
