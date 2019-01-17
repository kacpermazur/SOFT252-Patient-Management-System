/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import Observer.NotificationManger;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import usermodel.IInitialize;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class UserManger implements IInitialize {
    
    private List<User> UserList;
    
    private final File FILENAME = new File ("UserDataList.bigchungus");
    
    private volatile static UserManger _instance;
    private NotificationManger notificationManger;
        
    /**
     *
     * @return
     */
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
    
    /**
     *
     * @return
     */
    public static NotificationManger getNotificationManger()
    {
        return _instance.notificationManger;
    }
    
    /**
     *
     */
    @Override
    public void initialize()
    {
        UserList = new ArrayList<>();
        notificationManger = new NotificationManger();
    }
    
    /**
     *
     * @param id
     * @param password
     * @return
     */
    public User login(String id, String password)
    {
        User temp = getById(id);
        
        if(temp.getUserData().getDetails().getPassword().equals(password))
        {
            return temp;
        }
        
        return null;
    }
    
    /**
     *
     * @param type
     * @return
     */
    public List<User> getUserTypeInList(char type)
    {
        List<User> temp = null;
        
        for(User u : UserList)
        {
            if(u.getUserData().getDetails().getiD().charAt(0) == type)
            {
                temp.add(u);
            }
        }
        return temp;
    }
    
    /**
     *
     * @param user
     * @param type
     * @return
     */
    public boolean register(User user, char type)
    {
        user.getUserData().getDetails().setiD(generateID(type));
        
        return UserList.add(user);
    }
    
    /**
     *
     * @param user
     * @return
     */
    public boolean deleteUser(User user)
    {
        return UserList.remove(user);
    }
    
    /**
     *
     * @param user
     * @return
     */
    public String getUserID(User user)
    {
        return user.getUserData().getDetails().getiD();
    }
    
    /**
     *
     */
    public void clear()
    {
         
        UserList.clear();
    }
    
    /**
     *
     * @param userID
     * @return
     */
    public User getById(String userID)
    {
        User temp;
        
        return temp = UserList.stream()
                .filter(User -> userID.equals(User.getUserData().getDetails().getiD()))
                .findAny()
                .orElse(null);
    }
    
    /**
     *
     */
    public void serialize()
    {
        try
        {
            FileOutputStream serialize = new FileOutputStream(FILENAME);
            ObjectOutputStream serializeOBJ = new ObjectOutputStream(serialize);
            
            serializeOBJ.writeObject(UserList);
            serializeOBJ.close();
            
            System.out.println("Saved!");
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
    
    /**
     *
     */
    public void deserialize()
    {
        try
        {
            FileInputStream deserialize = new FileInputStream(FILENAME);
            ObjectInputStream deserializeOBJ = new ObjectInputStream(deserialize);
            
            UserList = (List<User>)deserializeOBJ.readObject();
            deserializeOBJ.close();
            
            System.out.println("Loaded!");
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
    
    /**
     *
     * @return
     */
    public String ToString()
    {
        StringBuilder temp = new StringBuilder();
        
        for(User u : UserList )
        {
            temp.append(u.getUserData().getDetails().ToText());
            temp.append("\n");
        }
        
        return temp.toString();
    }
    
    private String generateID(char type)
    { 
        
        NumberFormat nf = new DecimalFormat("000");
        
        return type + nf.format(UserList.size());
    }
    
}
