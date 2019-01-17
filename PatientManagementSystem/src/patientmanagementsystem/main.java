/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import guiview.loginUI;
import java.time.LocalDate;
import singleton.UserManger;
import usermodel.Address;
import usermodel.Details;
import usermodel.users.Admin;
import usermodel.users.Doctor;
import usermodel.users.Patient;
import usermodel.users.Secretary;

/**
 *
 * @author kacper
 */
public class main {

    /**
     * @param args the command line arguments"
     */
    public static void main(String[] args) {
        
           // here is some tests, all the code works just UI is not finished
        
          //loginUI view = new loginUI();
          
          
          UserManger.getInstance().initialize();
          UserManger.getInstance().deserialize();
          
          
//          Details details = new Details("Billy", "Smith", "Male", LocalDate.of(1999,12,12), "password");
//          Details details2 = new Details("Tim", "Rogger", "Male", LocalDate.of(1969,12,12), "password");
//          Details details3 = new Details("Sally", "McGee", "Female", LocalDate.of(1979,12,12), "password");
//          
//          Details details4 = new Details("Jimmy", "White", "Male", LocalDate.of(1994,12,12), "password");
//          Details details5 = new Details("Luke", "Addh", "Male", LocalDate.of(1999,12,12), "password");
//          Details details6 = new Details("Beth", "Smith", "Female", LocalDate.of(1999,12,12), "password");
//          
//          Details details7 = new Details("Jade", "Mikel", "Male", LocalDate.of(1993,12,12), "password");
//          Details details8 = new Details("Kate", "Kay", "Female", LocalDate.of(1991,12,12), "password");
//          
//          Details details9 = new Details("Zack", "Kay", "Female", LocalDate.of(1991,12,12), "password");
//          
//          Address address = new Address("Building1", "road2", "City3", "pl4 Test");
//          
//          UserManger.getInstance().register(new Doctor(details, address), 'D');
//          UserManger.getInstance().register(new Doctor(details2, address), 'D');
//          UserManger.getInstance().register(new Doctor(details3, address), 'D');
//          
//          UserManger.getInstance().register(new Patient(details4, address), 'P');
//          UserManger.getInstance().register(new Patient(details5, address), 'P');
//          UserManger.getInstance().register(new Patient(details6, address), 'P');
//          
//          UserManger.getInstance().register(new Secretary(details7, address), 'S');
//          UserManger.getInstance().register(new Secretary(details8, address), 'S');
//          
//          UserManger.getInstance().register(new Admin(details9, address), 'A');
//          
//          UserManger.getInstance().serialize();
//        
//        Details dets = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
//        Address add = new Address("Building", "road", "City", "postcode");
//        
//        Details dets2 = new Details("asd", "billy", "Male", LocalDate.now(), "password");
//        Address add2 = new Address("Building", "road", "City", "postcode");
//        
//        Details dets3 = new Details("spagget", "ssss", "Female", LocalDate.now(), "password");
//        Address add3 = new Address("Building", "road", "City", "postcode");
//        
//        User test = new Doctor(dets, add);
//        User test2 = new Patient(dets2, add2);
//        User test3 = new Doctor(dets3, add3);
//        
//        UserManger.getInstance().register(test, 'D');
//        UserManger.getInstance().register(test2, 'D');
//        UserManger.getInstance().register(test3, 'D');
//        
//        System.out.println(UserManger.getInstance().ToString());
//        
//        UserManger.getInstance().serialize();
//        
//        UserManger.getInstance().clear();
//        
//        System.out.println("Cleared List");
//        System.out.println(UserManger.getInstance().ToString());
//        
//        UserManger.getInstance().deserialize();
//        System.out.println("Loaded List");
//        System.out.println(UserManger.getInstance().ToString());
//        
//        System.out.println("=================================================");
//        
//        Notification testNotification = new Notification(LocalDate.now(), "Title: Spaggget", "UR a spagget");
//        
//        System.out.println(test.getUserData().getNotfications().ToString());
//        
//        System.out.println("=============== SEND BY OBSER");
//        
//        
//        UserManger.getNotificationManger().setNotfication(testNotification, test);
//        
//        System.out.println(test.getUserData().getNotfications().ToString());
//        Patient testing = new Patient(dets3, add3);
//        
//        Appointment newApp = new Appointment("DoctorIDhere", "PatientIDhere", LocalDate.now());
//        testing.makeAppointment(newApp);
//        
//        System.out.println("=============== Check Strat");
//        System.out.println(Data.getRequestedAppointments().ToString());
//        
//        
//        Details dets4 = new Details("yaYeetBoi", "EEEEEEEEEEE", "Female", LocalDate.now(), "password");
//        Address add4 = new Address("Buildingteate", "roadad", "Cityafwaf", "postcodewfawfaw");
//        
//        Admin adminTest = new Admin(dets4, add4);
//        
//        adminTest.createStaff(dets4, add4, Admin.StaffType.ADMIN);
//        
//        System.out.println(UserManger.getInstance().ToString());
    }
    
}
