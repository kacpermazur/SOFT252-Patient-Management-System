/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import usermodel.users.User;
import java.time.LocalDateTime;
import usermodel.*;
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
        
        inputDet.setAddress(inputAdd);
        
        User test = new Patient(inputDet, "pass123");
        
        System.out.println(test.toString());
        System.out.println(test.getUnqiueID());
        System.out.println(test.getUserType());
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        
       // User test2 = new Patient(inputDet, "pass123");
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        System.out.println("Current User Count: " + User.getUnqiueUserCount());
        
        LocalDateTime date = LocalDateTime.now();
        
        Notification abc = new Notification(date, "Spagget", "Somebody touch ma spagget");
        Notification abcd = new Notification(date, "dab", "dab on it");
        Notification abcde = new Notification(date, "frog", "check frogs");
        
        test.getNotficationList().addNotification(abc);
        test.getNotficationList().addNotification(abcd);
        test.getNotficationList().addNotification(abcde);
        
        System.out.println(abcd.toString());
        
        System.out.println(test.getNotficationList().getByTitle("dab").toString());
        //System.out.println(test2.getUserNotfications().getNotificationByTitle("dab").toString());
    }
    
}
