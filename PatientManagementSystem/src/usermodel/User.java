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
    
    protected Details userInfo;
    protected String unqiueID;
    
    private static int unqiueUserCount = 0;

    public User(Details userInfo) {
        this.userInfo = userInfo;
        this.unqiueID = generateID();
        
        unqiueUserCount = unqiueUserCount + 1;
    }

    public static void setUnqiueUserCount(int unqiueUserCount) {
        User.unqiueUserCount = unqiueUserCount;
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
           
    protected abstract String generateID();
    
    public abstract UserType getUserType();
    
    public String toString()
    {
        String hold = "";
        
        hold = this.userInfo.toString();
        
        return hold;
    }
}
