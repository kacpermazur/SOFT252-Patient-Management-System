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
     *
     * @param observer
     */
    public void registerObserver(IObserver observer);
    
    /**
     *
     * @param observer
     */
    public void removeObserver(IObserver observer);
    
    /**
     *
     * @param observer
     */
    public void notifySingleObserver(IObserver observer);
    
    /**
     *
     */
    public void notifyObservers();
}
