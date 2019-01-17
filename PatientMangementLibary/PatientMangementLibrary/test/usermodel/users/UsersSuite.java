/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kacper
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({usermodel.users.AdminTest.class, usermodel.users.UserTest.class, usermodel.users.SecretaryTest.class, usermodel.users.DoctorTest.class, usermodel.users.PatientTest.class})
public class UsersSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
