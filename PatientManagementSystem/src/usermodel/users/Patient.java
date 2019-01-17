/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import singleton.UserManger;
import usermodel.Address;
import usermodel.Details;
import usermodel.Notification;
import usermodel.Rating;

/**
 *
 * @author kacper
 */
public class Patient extends User{

    public Patient(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    public boolean requestAccount()
    {
        return UserManger.getInstance().register(this, 'R');
    }
    
    public boolean rateDoctor(String doctorID, Rating userRating)
    {
        
    }
}
