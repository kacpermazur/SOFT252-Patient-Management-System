/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import java.io.Serializable;
import java.util.ArrayList;
import usermodel.Address;
import usermodel.Data;
import usermodel.Details;


/**
 *
 * @author kacper
 */
public abstract class User implements Serializable{
    
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
}
