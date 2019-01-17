/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;
import usermodel.Notification;

/**
 * Used by the observer pattern, this is where the subject is set and will send
 * its notfications across its subsribers 
 * @author kacper
 */
public class NotificationManger implements iObservable
{
    private List<IObserver> observers = new ArrayList<>();
    
    private Notification notficationToSend;

    /**
     * Class implementing the observer will set to list of observers inerfaces
     * @param observer class implementing the interface
     */
    @Override
    public void registerObserver(IObserver observer) 
    {
        observers.add(observer);
    }

    /**
     * removes the refrence that from the list so it no longer gets updated;
     * @param observer class implementing the interface
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
     * sends notfication to single targeted class that implements IObserver
     * @param observer class implementing the interface
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
     * go through whole list and trigger the update each class is implementing with the passed value
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
     * sets the notfications and sends it out to all subsribers 
     * @param notification notification that gets send out
     */
    public void setNotfication(Notification notification)
    {
        notficationToSend = notification;
        notifyObservers();
    }
    
    /**
     * sends out a notfication to a single targeted user
     * @param notification notfication that is being send out
     * @param observer class that implements it so update can be triggered
     */
    public void setNotfication(Notification notification, IObserver observer)
    {
        notficationToSend = notification;
        notifySingleObserver(observer);
    }
}
