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
    
    public Patient(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    public boolean requestAccount()
    {
        return UserManger.getInstance().register(this, 'R');
    }
    
    public boolean rateDoctor(String doctorID, Rating userRating)
    {
        User temp = UserManger.getInstance().getById(doctorID);
        
        return temp.getUserData().getDoctorRatings().add(userRating);
    }
    
    public String viewDoctorRating(String doctorID)
    {
        User temp = UserManger.getInstance().getById(doctorID);
        
        return temp.getUserData().getDoctorRatings().ToString();
    }
    
    public boolean AddToHistory(Appointment pastAppointmentHistory)
    {
        return this.userData.getHistory().add(pastAppointmentHistory);
    }
    
    public String ViewHistory()
    {
        return this.userData.getHistory().ToString();
    }

    @Override
    public void makeAppointment(Appointment appointment) 
    {
        IAppointment app = new RequestAppointment();
        app.makeAppointment(appointment);
    }
    
    public String ViewAppointment()
    {
        return this.userData.getActiveAppointment().ToSring();
    }
    
    public String ViewPerscription()
    {
        return this.userData.getActivePatientAppointments().ToString();
    }
    
    public void requestTermination()
    {
        Notification termination = new Notification(LocalDate.now(), "ACCOUNT TERMINATION",
                this.userData.getDetails().getiD());
                
        UserManger.getNotificationManger().setNotfication(termination);
    }
}
