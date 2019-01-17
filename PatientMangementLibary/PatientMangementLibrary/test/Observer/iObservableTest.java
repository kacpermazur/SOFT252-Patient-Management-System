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

/**
 *
 * @author kacper
 */
public class iObservableTest {
    
    public iObservableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testRegisterObserver() {
    }

    @Test
    public void testRemoveObserver() {
    }

    @Test
    public void testNotifySingleObserver() {
    }

    @Test
    public void testNotifyObservers() {
    }

    public class iObservableImpl implements iObservable {

        public void registerObserver(IObserver observer) {
        }

        public void removeObserver(IObserver observer) {
        }

        public void notifySingleObserver(IObserver observer) {
        }

        public void notifyObservers() {
        }
    }
    
}
