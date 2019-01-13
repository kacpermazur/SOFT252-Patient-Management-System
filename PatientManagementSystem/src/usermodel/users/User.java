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
public abstract class User {
    
    protected Details userInfo;
    protected Address userAddress;
    protected NotificationList userNotifcations;

    public User(Details userInfo, Address userAddress, NotificationList userNotifcations) {
        this.userInfo = userInfo;
        this.userAddress = userAddress;
        this.userNotifcations = userNotifcations;
    }
    
    public Details getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(Details userInfo) {
        this.userInfo = userInfo;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public NotificationList getUserNotifcations() {
        return userNotifcations;
    }

    public void setUserNotifcations(NotificationList userNotifcations) {
        this.userNotifcations = userNotifcations;
    }
    
    
}
