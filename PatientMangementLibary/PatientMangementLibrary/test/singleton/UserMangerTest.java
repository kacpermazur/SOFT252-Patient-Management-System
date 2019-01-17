/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import Observer.NotificationManger;
import java.time.LocalDate;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usermodel.Address;
import usermodel.Details;
import usermodel.users.Patient;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class UserMangerTest {
    
    public UserMangerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInstance method, of class UserManger.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserManger expResult = UserManger.getInstance();
        UserManger result = UserManger.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNotificationManger method, of class UserManger.
     */
    @Test
    public void testGetNotificationManger() {
        System.out.println("getNotificationManger");
        UserManger.getInstance().initialize();
        NotificationManger expResult = UserManger.getNotificationManger();
        NotificationManger result = UserManger.getNotificationManger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of initialize method, of class UserManger.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        UserManger instance = new UserManger();
        instance.initialize();
        
        Details dets = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
        Address add = new Address("Building", "road", "City", "postcode");
        User test = new Patient(dets, add);
        instance.register(test, 'p');
        
        assertEquals(instance.getUserID(test), test.getUserData().getDetails().getiD());
    }

    /**
     * Test of login method, of class UserManger.
     */
    @Test
    public void testLogin() {
        
        Details dets = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
        Address add = new Address("Building", "road", "City", "postcode");
        User test = new Patient(dets, add);
        
        System.out.println("login");
        String id = "p000";
        String password = "password";
        UserManger.getInstance().register(test, 'p');
        System.out.println(test.getUserData().getDetails().ToText());
        User expResult = test;
        User result = UserManger.getInstance().login(id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of register method, of class UserManger.
     */
    
    Details dets2 = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
    Address add2 = new Address("Building", "road", "City", "postcode");
    
    @Test
    public void testRegister() {
        System.out.println("register");
        User user = new Patient(dets2, add2);
        char type = 'P';
        
        boolean expResult = true;
        boolean result = UserManger.getInstance().register(user, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteUser method, of class UserManger.
     */
    @Test
    public void testDeleteUser() {
        Details dets2 = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
        Address add2 = new Address("Building", "road", "City", "postcode");
        User newd = new Patient(dets2, add2);
        UserManger.getInstance().register(newd, 'P');
        System.out.println("deleteUser");
        boolean expResult = true;
        boolean result = UserManger.getInstance().deleteUser(newd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUserID method, of class UserManger.
     */
    @Test
    public void testGetUserID() {
        
        
        Details dets2 = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
        Address add2 = new Address("Building", "road", "City", "postcode");
        User newd = new Patient(dets2, add2);
        UserManger.getInstance().register(newd, 'P');
        String userIDd = newd.getUserData().getDetails().getiD();
        

        String expResult = userIDd;
        String result = UserManger.getInstance().getUserID(newd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of clear method, of class UserManger.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        UserManger.getInstance().clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getById method, of class UserManger.
     */
    
    @Test
    public void testGetById() {
        
        Details dets2 = new Details("testName", "testSurname", "Male", LocalDate.now(), "password");
        Address add2 = new Address("Building", "road", "City", "postcode");
        User newd = new Patient(dets2, add2);
        UserManger.getInstance().register(newd, 'P');
        
        System.out.println("getById");
        String userID = newd.getUserData().getDetails().getiD();
        
        
        User expResult = newd;
        User result = UserManger.getInstance().getById(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.;
    }

    
}
