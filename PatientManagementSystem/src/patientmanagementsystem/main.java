/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import usermodel.Address;
import usermodel.Details;
import usermodel.User;
import usermodel.users.Patient;

/**
 *
 * @author kacper
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // GUI Stored Input:
        Details inputDet = new Details("Joe", "Smith");
        Address inputAdd = new Address("Build Name", "Street Name", "Plymouth", "PL1 1AA");
        
        inputDet.setUserAddress(inputAdd);
        
        User test = new Patient(inputDet);
        
        System.out.println(test.toString());
        System.out.println(test.getUnqiueID());
        System.out.println(test.getUserType());
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        
        User test2 = new Patient(inputDet);
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        
    }
    
}
