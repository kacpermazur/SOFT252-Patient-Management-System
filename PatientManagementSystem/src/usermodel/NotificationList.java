/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kacper
 */
public class NotificationList implements Iterable<Notification>{
    
    private final List<Notification> notificationData;

    public NotificationList() {
        notificationData = new ArrayList<>();
    }
    
    public boolean addNotification(Notification currNotfication)
    {
        boolean isAdded = false;
        
        if(currNotfication != null)
        {
            isAdded = notificationData.add(currNotfication);
        }
        
        return isAdded;
    }
    
    public Notification getNotificationByTitle(String value)
    {
        Notification searchNotification;
        
        return searchNotification = notificationData.stream()
                .filter(Notification -> value.equals(Notification.getSubjectTitle()))
                .findAny()
                .orElse(null);
    }
    
    @Override
    public Iterator<Notification> iterator()
    {
        return notificationData.iterator();
    }
}
