/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.List;
import singleton.UserManger;
import usermodel.IInitialize;
import usermodel.Notification;
import usermodel.users.User;

/**
 * Used by the observer pattern, this is where the subject is set and will 
 * @author kacper
 */
public class NotificationManger implements iObservable
{
    private List<IObserver> observers;
    
    private Notification notficationToSend;

    /**
     *
     * @param observer
     */
    @Override
    public void registerObserver(IObserver observer) 
    {
        observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    @Override
    public void removeObserver(IObserver observer) 
    {
        int index = observers.indexOf(observer);
        
        if (index >= 0)
        {
            observers.remove(index);
        }
    }

    /**
     *
     * @param observer
     */
    @Override
    public void notifySingleObserver(IObserver observer) 
    {
        if(notficationToSend != null)
        {
            observer.update(notficationToSend);
            notficationToSend = null;
        }
    }

    /**
     *
     */
    @Override
    public void notifyObservers() 
    {
        for(IObserver observer : observers)
        {
            if(notficationToSend != null)
            {
                observer.update(notficationToSend);
                notficationToSend = null;
            }
        }
    }
    
    /**
     *
     * @param notification
     */
    public void setNotfication(Notification notification)
    {
        notficationToSend = notification;
        notifyObservers();
    }
    
    /**
     *
     * @param notification
     * @param observer
     */
    public void setNotfication(Notification notification, IObserver observer)
    {
        notficationToSend = notification;
        notifySingleObserver(observer);
    }
}
