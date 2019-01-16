/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import java.io.Serializable;
import usermodel.Data;


/**
 *
 * @author kacper
 */
public abstract class User implements Serializable{
    
    protected Data userData = new Data();

    public Data getUserData() {
        return userData;
    }

    public void setUserData(Data userData) {
        this.userData = userData;
    }
}
