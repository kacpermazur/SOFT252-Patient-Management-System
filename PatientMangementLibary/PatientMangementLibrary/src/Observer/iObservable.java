/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author kacper
 */
public interface iObservable 
{

    /**
     *  registers the Observer that is being passed through 
     * @param observer classes that implement this interface
     */
    public void registerObserver(IObserver observer);
    
    /**
     * removes the Observer that is being passed through 
     * @param observer classes that implement this interface
     */
    public void removeObserver(IObserver observer);
    
    /**
     * notifies the Observer that is being passed through 
     * @param observer classes that implement this interface
     */
    public void notifySingleObserver(IObserver observer);
    
    /**
     * notifies all the Observer that is being passed through 
     */
    public void notifyObservers();
}
