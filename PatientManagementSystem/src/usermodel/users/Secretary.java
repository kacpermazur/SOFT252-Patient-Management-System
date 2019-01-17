/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import usermodel.Address;
import usermodel.Details;
import usermodel.Notification;

/**
 *
 * @author kacper
 */
public class Secretary extends User{

    public Secretary(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }

    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    
}
