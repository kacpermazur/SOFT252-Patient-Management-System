/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import usermodel.Data;


/**
 *
 * @author kacper
 */
public abstract class User {
    
    protected Data userData;

    public Data getUserData() {
        return userData;
    }

    public void setUserData(Data userData) {
        this.userData = userData;
    }
            
    
}
