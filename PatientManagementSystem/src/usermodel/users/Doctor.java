/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import usermodel.Address;
import usermodel.Details;

/**
 *
 * @author kacper
 */
public class Doctor extends User{

    public Doctor(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
}
