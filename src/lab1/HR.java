/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Date;

/**
 *
 * @author Emilio
 */
public class HR {
     private Employee employee;
     
     public void getEmployeeInfo(String firstName, String lastName, String ssn){
         employee  = new Employee();
         employee.setFirstName(firstName);
         employee.setLastName(lastName);
         employee.setSsn(ssn);
         employee.doOrientation("B387");
         
     }
     public String getEmployeeStatus() {
        return employee.getStatus();
    }
}
