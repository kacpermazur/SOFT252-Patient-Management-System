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
 *
 * @author kacper
 */
public class NotificationManger implements iObservable, IInitialize
{
    private List<IObserver> observers;
    
    private Notification notficationToSend;
    
    @Override
    public void initialize()
    {
        try
        {
            for (User u : UserManger.getInstance().getUserTypeInList('S'))
            {
                registerObserver(u);
            }
        }
        catch (NullPointerException ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public void registerObserver(IObserver observer) 
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) 
    {
        int index = observers.indexOf(observer);
        
        if (index >= 0)
        {
            observers.remove(index);
        }
    }

    @Override
    public void notifySingleObserver(IObserver observer) 
    {
        if(notficationToSend != null)
        {
            observer.update(notficationToSend);
            notficationToSend = null;
        }
    }

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
    
    public void setNotfication(Notification notification)
    {
        notficationToSend = notification;
        notifyObservers();
    }
    
    public void setNotfication(Notification notification, IObserver observer)
    {
        notficationToSend = notification;
        notifySingleObserver(observer);
    }
}
