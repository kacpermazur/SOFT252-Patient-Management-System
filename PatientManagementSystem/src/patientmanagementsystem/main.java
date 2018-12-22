/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import usermodel.Address;
import usermodel.Details;
import usermodel.User;

/**
 *
 * @author kacper
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test: GUI Input sim
        Address inputAdd = new Address("building1", "road1", "city1", "postcode1");
        Details inputDet = new Details("Bob" , "Smith", "0001t", inputAdd);
        
        System.out.println(inputAdd.toString());
        System.out.println();
        System.out.println(inputDet.toString());
        System.out.println("______________________");
        
        
        //testUser.toString();
        User test = new User(inputDet);
        System.out.println(test.toString());
    }
    
}
