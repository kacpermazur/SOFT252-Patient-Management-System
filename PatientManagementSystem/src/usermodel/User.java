/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

/**
 *
 * @author kacper
 */
public abstract class User {
    
    private Details userDetails;
    
    public User()
    {
        this.userDetails =  new userDetails();
    }
}
