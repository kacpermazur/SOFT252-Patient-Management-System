/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kacper
 */
public class NotificationList implements Serializable{
    
    private final List<Notification> notifications;

    public NotificationList() {
        notifications = new ArrayList<>();
    }
    
    public boolean add(Notification currNotfication)
    {
        boolean isAdded = false;
        
        if(currNotfication != null)
        {
            isAdded = notifications.add(currNotfication);
        }
        
        return isAdded;
    }
    
    public boolean Clear()
    {
         boolean isCleared = false;
         
         if(!notifications.isEmpty())
         {
            isCleared =  notifications.containsAll(notifications);
         }
         
         return isCleared;
    }
    
    public Notification getByTitle(String value)
    {
        Notification searchNotification;
        
        return searchNotification = notifications.stream()
                .filter(Notification -> value.equals(Notification.getSubjectTitle()))
                .findAny()
                .orElse(null);
    }
    
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        for (Notification currNotify : notifications)
        {
            hold.append(currNotify.ToString() + "\n");
        }
        
        return hold.toString();
    }
}
