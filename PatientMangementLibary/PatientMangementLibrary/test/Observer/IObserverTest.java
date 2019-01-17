/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usermodel.Notification;

/**
 *
 * @author kacper
 */
public class IObserverTest {
    
    public IObserverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testUpdate() {
    }

    public class IObserverImpl implements IObserver {

        public void update(Notification notfication) {
        }
    }
    
}
