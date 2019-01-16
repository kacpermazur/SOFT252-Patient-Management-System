/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.List;
import usermodel.IInitialize;
import usermodel.users.Secretary;

/**
 *
 * @author kacper
 */
public class NotificationManger implements iObservable, IInitialize
{
    private List<Secretary> secretaryList;
    
    @Override
    public void initialize()
    {
        
    }

    @Override
    public void registerObserver(IObserver observer) {
        
    }

    @Override
    public void removeObserver(IObserver observer) {
        
    }

    @Override
    public void SingleObserver(IObserver observer) {
       
    }

    @Override
    public void notifyObservers() {
        
    }
    
}
