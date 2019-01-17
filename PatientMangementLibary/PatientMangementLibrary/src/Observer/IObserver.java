/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import usermodel.Notification;

/**
 *
 * @author kacper
 */
public interface IObserver 
{

    /**
     * This is implemented by the classes that and get updated from subject
     * @param notfication notification class that holds data, title, and comment
     */
    public void update (Notification notfication);
}
