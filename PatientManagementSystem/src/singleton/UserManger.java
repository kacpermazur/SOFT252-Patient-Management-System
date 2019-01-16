/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import java.util.List;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class UserManger {
    
    private List<User> UserList = new ArrayList<>();
    
    private volatile static UserManger _instance;
        
    public static UserManger getInstance()
    {
        if(_instance == null)
        {
            synchronized (UserManger.class)
            {
                if(_instance == null)
                {
                    _instance = new UserManger();
                }
            }
        }
        return _instance;
    }
}
