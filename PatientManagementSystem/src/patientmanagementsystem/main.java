/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import java.time.LocalDate;
import singleton.UserManger;
import usermodel.Address;
import usermodel.Details;
import usermodel.users.Doctor;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class main {

    /**
     * @param args the command line arguments"
     */
    public static void main(String[] args) {
        
        Details dets = new Details("testName", "testSurname", LocalDate.now(), "password");
        Address add = new Address("Building", "road", "City", "postcode");
        
        User test = new Doctor(dets, add);
        
        UserManger.getInstance().register(test, 'D');
        UserManger.getInstance().register(test, 'D');
        UserManger.getInstance().register(test, 'D');
        UserManger.getInstance().register(test, 'D');
        UserManger.getInstance().register(test, 'D');
        
        System.out.println(UserManger.getInstance().ToString());
        
        UserManger.getInstance().serialize();
        
        UserManger.getInstance().clear();
        
        System.out.println("Cleared List");
        System.out.println(UserManger.getInstance().ToString());
        
        UserManger.getInstance().deserialize();
        System.out.println("Loaded List");
        System.out.println(UserManger.getInstance().ToString());
    }
    
}
