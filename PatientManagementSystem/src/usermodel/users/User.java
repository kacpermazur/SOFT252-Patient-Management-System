/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import Observer.IObserver;
import java.io.Serializable;
import usermodel.Address;
import usermodel.Data;
import usermodel.Details;
import usermodel.Notification;


/**
 *
 * @author kacper
 */
public abstract class User implements Serializable, IObserver{
    
    protected Data userData = new Data();

    public User(Details userDetails, Address userAddress) {
        this.userData.setDetails(userDetails);
        this.userData.setAdress(userAddress);
        
    }
    public Data getUserData() {
        return userData;
    }

    public void setUserData(Data userData) {
        this.userData = userData;
    }

    @Override
    public abstract void update(Notification notfication);
    
}
