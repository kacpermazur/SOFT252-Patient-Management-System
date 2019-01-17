/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import java.time.LocalDate;
import singleton.UserManger;
import strategy.IAppointment;
import strategy.RequestAppointment;
import usermodel.Address;
import usermodel.Appointment;
import usermodel.Details;
import usermodel.Notification;
import usermodel.Rating;

/**
 *
 * @author kacper
 */
public class Patient extends User implements IAppointment{
    
    /**
     *
     * @param userDetails
     * @param userAddress
     */
    public Patient(Details userDetails, Address userAddress) {
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
     *
     * @return
     */
    public boolean requestAccount()
    {
        return UserManger.getInstance().register(this, 'R');
    }
    
    /**
     *
     * @param doctorID
     * @param userRating
     * @return
     */
    public boolean rateDoctor(String doctorID, Rating userRating)
    {
        User temp = UserManger.getInstance().getById(doctorID);
        
        return temp.getUserData().getDoctorRatings().add(userRating);
    }
    
    /**
     *
     * @param doctorID
     * @return
     */
    public String viewDoctorRating(String doctorID)
    {
        User temp = UserManger.getInstance().getById(doctorID);
        
        return temp.getUserData().getDoctorRatings().ToString();
    }
    
    /**
     *
     * @param pastAppointmentHistory
     * @return
     */
    public boolean AddToHistory(Appointment pastAppointmentHistory)
    {
        return this.userData.getHistory().add(pastAppointmentHistory);
    }
    
    /**
     *
     * @return
     */
    public String ViewHistory()
    {
        return this.userData.getHistory().ToString();
    }

    /**
     *
     * @param appointment
     */
    @Override
    public void makeAppointment(Appointment appointment) 
    {
        IAppointment app = new RequestAppointment();
        app.makeAppointment(appointment);
    }
    
    /**
     *
     * @return
     */
    public String ViewAppointment()
    {
        return this.userData.getActiveAppointment().ToSring();
    }
    
    /**
     *
     * @return
     */
    public String ViewPerscription()
    {
        return this.userData.getActivePatientAppointments().ToString();
    }
    
    /**
     *
     */
    public void requestTermination()
    {
        Notification termination = new Notification(LocalDate.now(), "ACCOUNT TERMINATION",
                this.userData.getDetails().getiD());
                
        UserManger.getNotificationManger().setNotfication(termination);
    }
}
