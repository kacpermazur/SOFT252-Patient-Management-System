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
 * Singleton user manger that handles saving/ and loading the data back in.
 * and stores refrence to the Notification manger
 * @author kacper
 */
public class UserManger implements IInitialize {
    
    private List<User> UserList;
    
    private final File FILENAME = new File ("UserDataList.bigchungus");
    
    private volatile static UserManger _instance;
    private NotificationManger notificationManger;
        
    /**
     * gets the instance of the singleton, but it checks on a single thread, first time
     * its being so no two instances get created by accident
     * @return userManger class 
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
     * play can get refernce to the notification manger
     * @return singletons instance of that referance that is being stored
     */
    public static NotificationManger getNotificationManger()
    {
        return _instance.notificationManger;
    }
    
    /**
     * initializes the userlist and notfication manger for first time
     */
    @Override
    public void initialize()
    {
        UserList = new ArrayList<>();
        notificationManger = new NotificationManger();
    }
    
    /**
     *
     * @param id user id
     * @param password users password
     * @return returns the user if it finds the correct password
     */
    public User login(String id, String password)
    {
        User temp = getById(id);
        
        if(temp.getUserData().getDetails().getPassword().equals(password))
        {
            return temp;
        }
        
        return temp;
    }
    
    /**
     *
     * @param type user type based on their ID A = admin, S = secutary, D = doctor, p = patient, 
     * r = reuqested User (patent) before approved
     * @return returns the list of users that had that ID at beging of their ID code
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
     * @param user abstract user means any user that is passed though gets added to user list
     * @param type generated the code based on user type e.g. if they are a doctor
     * @return returns true if it was added to the list.
     */
    public boolean register(User user, char type)
    {
        user.getUserData().getDetails().setiD(generateID(type));
        
        return UserList.add(user);
    }
    
    /**
     * deletes the user from the list
     * @param user user class that is being passed thought
     * @return true if it got removed 
     */
    public boolean deleteUser(User user)
    {
        return UserList.remove(user);
    }
    
    /**
     *
     * @param user user class that is being passed thought
     * @return returns the passed through users ID as string
     */
    public String getUserID(User user)
    {
        return user.getUserData().getDetails().getiD();
    }
    
    /**
     * clears the whole userlist 
     */
    public void clear()
    {
         
        UserList.clear();
    }
    
    /**
     *
     * @param userID string value of user 
     * @return returns user if it finds them with their correct ID if not found it will be set to null
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
     * Saves all the objects in the userList.
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
     * loads all the userList data and casts it back to userlist
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
     * goes through the user list and displays their details on new like for each user
     * @return each user on new like and their details .e.g. name, suername, gender, age....
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
