/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import singleton.UserManger;
import usermodel.Appointment;
import usermodel.users.User;

/**
 * this will set the appointment to the target doctor 
 * @author kacper
 */
public class PreApprovedAppointment implements IAppointment{

    /**
     * sets the appointment to the target doctor that is stored on the appointment class and refrence is called from the usermanger.
     * @param appointment
     */
    @Override
    public void makeAppointment(Appointment appointment) {
        
        String temp = appointment.getDoctorID();
        
        User tempUser = UserManger.getInstance().getById(temp);
        tempUser.getUserData().getActivePatientAppointments().add(appointment);
    }
        
    
}
