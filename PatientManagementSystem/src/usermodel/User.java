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
    
    Details userInfo;
    Address userAddress;

    public User(Details userInfo, Address userAddress) {
        this.userInfo = userInfo;
        this.userAddress = userAddress;
    }
    
    public String toString()
    {
        String hold = "";
        
        hold = this.userInfo.toString()
             + this.userAddress.toString();
        
        return hold;
    }
}
