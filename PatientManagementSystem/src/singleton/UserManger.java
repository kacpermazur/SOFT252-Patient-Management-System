/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public void Serialize()
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
    
    public void Deserialize()
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
}
