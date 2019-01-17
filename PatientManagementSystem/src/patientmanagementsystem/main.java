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
import usermodel.Notification;
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
        
        UserManger.getInstance().initialize();
        
        Details dets = new Details("testName", "testSurname", LocalDate.now(), "password");
        Address add = new Address("Building", "road", "City", "postcode");
        
        Details dets2 = new Details("asd", "billy", LocalDate.now(), "password");
        Address add2 = new Address("Building", "road", "City", "postcode");
        
        Details dets3 = new Details("spagget", "ssss", LocalDate.now(), "password");
        Address add3 = new Address("Building", "road", "City", "postcode");
        
        User test = new Doctor(dets, add);
        User test2 = new Doctor(dets2, add2);
        User test3 = new Doctor(dets3, add3);
        
        UserManger.getInstance().register(test, 'D');
        UserManger.getInstance().register(test2, 'D');
        UserManger.getInstance().register(test3, 'D');
        
        System.out.println(UserManger.getInstance().ToString());
        
        UserManger.getInstance().serialize();
        
        UserManger.getInstance().clear();
        
        System.out.println("Cleared List");
        System.out.println(UserManger.getInstance().ToString());
        
        UserManger.getInstance().deserialize();
        System.out.println("Loaded List");
        System.out.println(UserManger.getInstance().ToString());
        
        System.out.println("=================================================");
        
        Notification testNotification = new Notification(LocalDate.now(), "Title: Spaggget", "UR a spagget");
        
        System.out.println(test.getUserData().getNotfications().ToString());
        
        System.out.println("=============== SEND BY OBSER");
        
        
        UserManger.getNotificationManger().setNotfication(testNotification, test);
        
        System.out.println(test.getUserData().getNotfications().ToString());
        
        System.out.println();
    }
    
}
