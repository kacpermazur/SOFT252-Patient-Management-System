/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kacper
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({usermodel.RatingTest.class, usermodel.DetailsTest.class, usermodel.NotificationListTest.class, usermodel.RatingListTest.class, usermodel.users.UsersSuite.class, usermodel.AppointmentListTest.class, usermodel.IInitializeTest.class, usermodel.AppointmentTest.class, usermodel.AddressTest.class, usermodel.DataTest.class, usermodel.NotificationTest.class, usermodel.PerscriptionTest.class, usermodel.MedicineTest.class})
public class UsermodelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
