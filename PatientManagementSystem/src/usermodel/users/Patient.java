/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import usermodel.*;

/**
 *
 * @author kacper
 */
public class Patient extends User {

    public Patient(Details userInfo, String userPassword) {
        super(userInfo, userPassword);
        this.userType = UserType.PATIENT;
    }
        
    @Override
    protected String generateID()
    {
        String id = "P" + Integer.toString(0000 + User.getUnqiueUserCount());
        
        return id;
    }
    
    @Override
    public UserType getUserType()
    {
        return this.userType;
    }
}
