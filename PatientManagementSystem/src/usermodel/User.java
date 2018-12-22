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
    
    Details userInfo;;

    public User(Details userInfo) {
        this.userInfo = userInfo;
    }
    
    public String toString()
    {
        String hold = "";
        
        hold = this.userInfo.toString();
        
        return hold;
    }
}
