/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import usermodel.Address;
import usermodel.Details;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class UserManger {
    
    private List<User> UserList = new ArrayList<>();
    
    private final File FILENAME = new File ("UserDataList.bigchungus");
    
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
    
    public User login(String id, String password)
    {
        User temp = getById(id);
        
        if(temp.getUserData().getDetails().getPassword().equals(password))
        {
            return temp;
        }
        
        return null;
    }
    
    public boolean register(User user, Details userDetails, Address userAddress)
    {
        user.getUserData().setDetails(userDetails);
        user.getUserData().setAdress(userAddress);
        
        return UserList.add(user);
    }
    
    public User getById(String userID)
    {
        User temp;
        
        return temp = UserList.stream()
                .filter(User -> userID.equals(User.getUserData().getDetails().getiD()))
                .findAny()
                .orElse(null);
    }
    
    public void serialize()
    {
        try
        {
            FileOutputStream serialize = new FileOutputStream(FILENAME);
            ObjectOutputStream serializeOBJ = new ObjectOutputStream(serialize);
            
            serializeOBJ.writeObject(UserList);
            serializeOBJ.close();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void deserialize()
    {
        try
        {
            FileInputStream deserialize = new FileInputStream(FILENAME);
            ObjectInputStream deserializeOBJ = new ObjectInputStream(deserialize);
            
            UserList = (List<User>)deserializeOBJ.readObject();
            deserializeOBJ.close();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    
    private String generateID(char c)
    { 
        NumberFormat nf = new DecimalFormat("000");
        
        return c + nf.format(UserList.size());
    }
}
