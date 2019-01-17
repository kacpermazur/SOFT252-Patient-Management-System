/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kacper
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({strategy.IAppointmentTest.class, strategy.RequestAppointmentTest.class, strategy.PreApprovedAppointmentTest.class})
public class StrategySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
