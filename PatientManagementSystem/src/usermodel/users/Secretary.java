/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import java.util.List;
import singleton.UserManger;
import usermodel.Address;
import usermodel.Appointment;
import usermodel.Data;
import usermodel.Details;
import usermodel.Notification;

/**
 *
 * @author kacper
 */
public class Secretary extends User{

    public Secretary(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }

    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    public String viewWaitingAccount()
    {
        List<User> holder = UserManger.getInstance().getUserTypeInList('R');
        
        StringBuilder hold = new StringBuilder();
        
        if (holder != null)
        {
            for(User u : holder)
            {
                hold.append(u.userData.getDetails().toString());
                hold.append("\n");
            }
        }
        else
        {
            hold.append("None Found!");
        }
        
        return hold.toString();
    }
    
    public void approveAccount(String Id)
    {
        User temp = UserManger.getInstance().getById(Id);
        
        String userID = temp.userData.getDetails().getiD();

         char[] set = new char[4];
         set[0] = 'p';
         set[1] = userID.charAt(1);
         set[2] = userID.charAt(2);
         set[3] = userID.charAt(3);
         
        StringBuilder hold = new StringBuilder();
        
        hold.append(set[0]);
        hold.append(set[1]);
        hold.append(set[2]);
        hold.append(set[3]);
        
        userID = hold.toString();
        temp.userData.getDetails().setiD(userID);
    }
    
    public String viewRequestedAppointments()
    {
        return Data.getRequestedAppointments().ToString();
    }
    
    public void CreateAppointmentBetween(String userID)
    {
        Appointment appointment = Data.getRequestedAppointments()
               .getByPatientID(userID);
        
        UserManger.getInstance().getById(appointment.getDoctorID()).getUserData()
                .getActivePatientAppointments().add(appointment);
        
        Data.getRequestedAppointments().remove(appointment);
    }
   
    public void removePatient(String ID)
    {
        User hold = UserManger.getInstance().getById(ID).de;
    }
}

