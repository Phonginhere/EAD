/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface StudentBeanLocal {
    public void insert(String rollnumber, String name, String email, Short age);
}
