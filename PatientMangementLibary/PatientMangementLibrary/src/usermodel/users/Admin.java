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
 * admin class
 * @author kacper
 */
public class Admin extends User{

    /**
     * diffrent staff types that are checked aginst
     */
    public enum StaffType { 

        /**
         *
         */
        ADMIN, 

        /**
         *
         */
        DOCTOR, 

        /**
         *
         */
        SECRETARY };
    
    /**
     * constructor that takes in details (name, surname...ect) and the address
     * @param userDetails
     * @param userAddress
     */
    public Admin(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    /**
     *
     * @param notfication
     */
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    /**
     * create the staff based on staff type and adds to the user list in userManger
     * @param details user details name, surname,ect
     * @param address 
     * @param type what type of user they are
     */
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
    
    /**
     * removes the staff from the user list
     * @param id
     */
    public void removeStaff(String id)
    {
        UserManger.getInstance().deleteUser(UserManger.getInstance().getById(id));
    }
    
    /**
     * checks the rating of the doctor by searching it by its ID
     * @param doctorID
     * @return string of the review
     */
    public String viewRatings(String doctorID)
    {
        return UserManger.getInstance().getById(doctorID).getUserData()
                .getDoctorRatings().ToString();
    }
    
    /**
     * admin providing feed back the doctor based on its ID and sets it as a notfication
     * to he doctor
     * @param doctorID
     * @param comment
     */
    public void provideFeedback(String doctorID, String comment)
    {
        Notification notification = new Notification(LocalDate.now(),
                "FeedBack:", comment);
        
        UserManger.getNotificationManger().setNotfication(notification, 
                UserManger.getInstance().getById(doctorID));
    }
}
