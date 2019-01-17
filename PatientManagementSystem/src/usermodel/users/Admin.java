/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import java.time.LocalDate;
import singleton.UserManger;
import usermodel.Address;
import usermodel.Details;
import usermodel.Notification;

/**
 *
 * @author kacper
 */
public class Admin extends User{

    public enum StaffType { ADMIN, DOCTOR, SECRETARY };
    
    public Admin(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    public void createStaff(Details details, Address address, StaffType type)
    {
        switch(type)
        {
            case ADMIN:
                UserManger.getInstance().register( new Admin(details, address), 'A');
                break;
            case DOCTOR:
                UserManger.getInstance().register( new Doctor(details, address), 'D');
                break;
            case SECRETARY:
                UserManger.getInstance().register( new Secretary(details, address), 'S');
                break;
            default:
                System.out.println("Error: No StaffType Detected!");
                break;
        }
    }
    
    public void removeStaff(String id)
    {
        UserManger.getInstance().deleteUser(UserManger.getInstance().getById(id));
    }
    
    public String viewRatings(String doctorID)
    {
        return UserManger.getInstance().getById(doctorID).getUserData()
                .getDoctorRatings().ToString();
    }
    
    public void provideFeedback(String doctorID, String comment)
    {
        Notification notification = new Notification(LocalDate.now(),
                "FeedBack:", comment);
        
        UserManger.getNotificationManger().setNotfication(notification, 
                UserManger.getInstance().getById(doctorID));
    }
}
