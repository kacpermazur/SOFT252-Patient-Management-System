/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.util.List;

/**
 *
 * @author kacper
 */
public abstract class User {
    
    private static int unqiueUserCount = 0;
    
    protected Details userInfo;
    protected String unqiueID;
    protected String password;
    
    protected NotificationList userNotfications;

    public User(Details userInfo, String userPassword) {
        this.userInfo = userInfo;
        this.unqiueID = generateID();
        this.password = userPassword;
        
        unqiueUserCount = unqiueUserCount + 1;
        userNotfications = new NotificationList();
    }

    public static void setUnqiueUserCount(int unqiueUserCount) {
        User.unqiueUserCount = unqiueUserCount;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    } 
    
    public String getUnqiueID() {
        return unqiueID;
    }
    public static int getUnqiueUserCount() {
        return unqiueUserCount;
    }

    public Details getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(Details userInfo) {
        this.userInfo = userInfo;
    }

    public NotificationList getUserNotfications() {
        return userNotfications;
    }
    public void setUserNotfications(NotificationList userNotfications) {
        this.userNotfications = userNotfications;
    }
    
    
           
    protected abstract String generateID();
    
    public abstract UserType getUserType();
    
    public String toString()
    {
        String hold = "n/a";
        
        hold = this.userInfo.toString();
        
        return hold;
    }
}
