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
public class User {
    
    private Details userDetails;
    
    public User(String currName, String currSurname, Address currAddress, 
            String currUnqiueID)
    {
        this.userDetails.setName(currName);
        this.userDetails.setSurname(currSurname);
        this.userDetails.setAddress(currAddress);
        this.userDetails.setUnquieID(GenerateUnqiueID());
    }
    
    private String GenerateUnqiueID()
    {
        return "Test001";
    }
}
