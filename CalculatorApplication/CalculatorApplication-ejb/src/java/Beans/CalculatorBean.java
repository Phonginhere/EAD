/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Admin
 */
public class CalculatorBean implements CalculatorBeanLocal{

    @Override
    public Integer sum(int x, int y) {
      return x+y;
    }
    
    
}
